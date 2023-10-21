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
	
	// log 1-5
	
	@GetMapping("/search")
	public String findABook(@ModelAttribute ("bTrack") Books book) {
		System.out.println("Implementation class is :: " + service.getClass().getName());
		System.out.println("findABook() _GetMapping method was called - log1a");
		return "bookSearch";
	}
	
	@PostMapping("/search")
	public String findBook(@ModelAttribute ("bTrack") Books book) {
		System.out.println("Implementation class is :: " + service.getClass().getName());
		System.out.println("findABook() _PostMapping method was called - log1b");
		return "saving";
	}
    
	@GetMapping("/lend")
	public String bookCheck(Map<String, Object> map, @ModelAttribute("bTrack") Books book) {
		System.out.println("bookCeckout() _GetMapping method was called - log2");
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
		System.out.println("bookCeckout() _PostMapping method was called - log3a");
 		map.put("bookId", book);
   		map.put("booName", book);
   		map.put("authorLastName", book);
   		map.put("authorFirstName", book);
   		map.put("yearOfPublication", book);
   		service.bookCheckOut(student, book);
   		System.out.println("bookCeckout() _PostMapping method was called - log3b");
		return "bCheckOut";
	}
	
	@GetMapping("/display")
	public String displayConfirmation() {	
		System.out.println("displayConfirmation() _GetMapping method was called - log4");
		return "confirm";
	}
	
	@GetMapping("bookBack")
	public String bookReturn(Integer id) {
		service.deletBookById(id);
		System.out.println("bookReturn() _GetMapping method was called - log5");
		return"bReturn";	
	}
	
	
}
