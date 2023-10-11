package ks.m5s.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks.m5s.model.BookStatus;
import ks.m5s.model.Books;
import ks.m5s.model.Student;
import ks.m5s.service.IBookLendingService;


@Controller
@RequestMapping("/book")
public class BookLendingControll {
	
	Student student; 
	BookStatus bookOut;
	
	@Autowired
	private IBookLendingService service;
	
	// private Boolean bookOut;
	
	@GetMapping("/search")
	public String findABook(@ModelAttribute ("bTrack") Books book) {
		System.out.println("Implementation class is :: " + service.getClass().getName());
		return "bookSearch";
	}
    
	@GetMapping("/check")
	public String bookCheck(@ModelAttribute("bTrack") Books book) {
		return"bCheckOut";
	}
	
	@PostMapping("/check")
	public String bookCheckout(Map<String, Object> map, @ModelAttribute("bTrack") Books book) {
	//	System.out.println("Implementation class is :: " + service.getClass().getName());
 		map.put("bookId", book);
   		map.put("booName", book);
   		map.put("authorLastName", book);
   		map.put("authorFirstName", book);
   		map.put("ayeraOfPublication", book);
   		service.bookCheckOut(student, bookOut);
		return "bCheckOut";
	}
	
	@GetMapping("/display")
	public String displayConfirmation() {
		
		return "confirm";
	}
	
	@GetMapping("bookBack")
	public String bookReturn(Books book) {
		service.deletBookById(book);
		return"bReturn";	
	}
	
	
	
	
//	@GetMapping("/home")
//	public String showStartPage() {	
//		return "choose";
//	}
	
	
}
