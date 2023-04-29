package ks.m5s;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LibManagemProjBootMvcApplication {

	public static void main(String[] args) {
		ApplicationContext context = (ApplicationContext) SpringApplication.run(LibManagemProjBootMvcApplication.class, args);
	       ((ConfigurableApplicationContext) context).close();
	
	}

}
