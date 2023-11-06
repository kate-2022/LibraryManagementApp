package ks.m5s.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfigApp {
	
	@Autowired
	private DataSource dataSource;

	public void authenticationManager(AuthenticationManagerBuilder auth) throws Exception {
				auth
				.jdbcAuthentication()
				.passwordEncoder(new BCryptPasswordEncoder())
				.dataSource (dataSource)
				.usersByUsernameQuery("select username, password, enabled from users where username =?")
				.authoritiesByUsernameQuery("select username, authority from authorities where username=?");
	}
	
	@Bean
	public SecurityFilterChain configure(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(
				request -> request.antMatchers("/","/index.jsp","/lib", "/lib/home","/lib//studReg","/lib/stuLog", "/lib/libReg","/lib/libLog",
						"/lib/display","/book", "/book/search" ).permitAll()
				.antMatchers("/lib/safe").hasRole("LIBRARIAN")
				.antMatchers("/book/lend", "/book/display", "/book/bookBack").hasAnyRole("STUDENT", "LIBRARIAN")
				.anyRequest().authenticated()
				).formLogin()
				.and().rememberMe()
				.and().logout()
				.and().sessionManagement().maximumSessions(3)
				.maxSessionsPreventsLogin(true);	
		return http.build();
	}
	

}
