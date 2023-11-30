package ks.m5s.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ks.m5s.model.Books;
import ks.m5s.model.Student;
import ks.m5s.service.IBookLendingService;


@Controller
@RequestMapping("/book")
public class BookLendingControl {
	
	Student student; 
	
	@Autowired
	private IBookLendingService service;
	
	private Logger logger = LoggerFactory.getLogger(BookLendingControl.class);
	
	// private Boolean bookOut;
	
	// log 1-5
	
	@GetMapping("/search")
	public String findABook(@ModelAttribute ("bTrack") Books book) {
		//System.out.println("Implementation class is :: " + service.getClass().getName());
		logger.info("findABook() _GetMapping method was called - log 1a");
		
		return "bookSearch";
	}
	
	@PostMapping("/search")
	public String findBook(@ModelAttribute ("bTrack") Books book) {
		System.out.println("Implementation class is :: " + service.getClass().getName());
		logger.info("findABook() _PostMapping method was called - log 1b");
		
		return "saving";
	}
    
	@GetMapping("/lend")
	public String bookCheck(Map<String, Object> map, @ModelAttribute("bTrack") Books book) {
		logger.info("bookCeckout() _GetMapping method was called - log 2");
		map.put("bookId", book);
   		map.put("booName", book);
   		map.put("authorLastName", book);
   		map.put("authorFirstName", book);
   		map.put("yearOfPublication", book);
   		service.bookCheckOut(student, book);
		return"bCheckOut";
	}
	
	@PostMapping("/lend")
	public String bookCheckout(Map<String, Object> map, @ModelAttribute("bTrack") Books book) {
		logger.info("entering bookCeckout() _PostMapping method was called - log 3a");
 		map.put("bookId", book);
   		map.put("booName", book);
   		map.put("authorLastName", book);
   		map.put("authorFirstName", book);
   		map.put("yearOfPublication", book);
   		service.bookCheckOut(student, book);
   		logger.info("leaving bookCeckout() _PostMapping method was called - log 3b");
		return "bCheckOut";
	}
	
	@GetMapping("/display")
	public String displayConfirmation() {	
		logger.info("displayConfirmation() _GetMapping method was called - log 4");
		return "confirm";
	}
	
	@GetMapping("bookBack")
	public String bookReturn(Long id) {
		service.deletBookById(id);
		logger.info("bookReturn() _GetMapping method was called - log 5");
		return"bReturn";	
	}
	
	
	
}
