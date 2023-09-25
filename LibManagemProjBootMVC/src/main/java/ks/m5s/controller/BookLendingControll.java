package ks.m5s.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks.m5s.model.Books;
import ks.m5s.service.IBookLendingService;


@Controller
@RequestMapping("/book")
public class BookLendingControll {
	
	@Autowired
	private IBookLendingService service;
	
	// private Boolean bookOut;
	
	@GetMapping("/search")
	public String findABook(Map<String, Object> model, @ModelAttribute ("bTrack") Books book) {
		System.out.println("Implementation class is :: " + service.getClass().getName());
	       		model.put("bookId", book);
	       		model.put("booName", book);
	       		model.put("authorLastName", book);
	       		model.put("authorFirstName", book);
	       		model.put("ayeraOfPublication", book);
		return "bookSearch";
	}
    
	@PostMapping("/search")
	public String bookCheckout(Map<String, Object> map, @ModelAttribute("bLend") Books booking) {
		System.out.println("Implementation class is :: " + service.getClass().getName());
 		map.put("bookId", booking);
   		map.put("booName", booking);
   		map.put("authorLastName", booking);
   		map.put("authorFirstName", booking);
   		map.put("ayeraOfPublication", booking);
		
		return "bCheckOut";
	}
}
