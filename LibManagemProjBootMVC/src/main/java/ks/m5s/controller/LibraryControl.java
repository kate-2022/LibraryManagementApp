package ks.m5s.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={ "ks" })
public class LibraryControl {

	@Bean
	public LocalDate getDate() {
		return LocalDate.now();
	}
	
}
