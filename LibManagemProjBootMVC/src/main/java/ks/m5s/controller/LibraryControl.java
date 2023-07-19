package ks.m5s.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import ks.m5s.service.BookLendingServiceImpl;

@Controller
@RequestMapping("/lib")
public class LibraryControl {

	@Bean
	public LocalDate getDate() {
		return LocalDate.now();
	}
	
	@Autowired
	private BookLendingServiceImpl bookOrganize; 
	
	
}
