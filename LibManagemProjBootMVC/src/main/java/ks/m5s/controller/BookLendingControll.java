package ks.m5s.controller;

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
	
	@GetMapping("/checkOut")
	public String findABook(Map<String, Object> model, @ModelAttribute ("bookTrack") Books book) {
		return "bookSearch";
	}
    
	@PostMapping("/checkOut")
	public String bookCheckout(Map<String, Object> map, @ModelAttribute("bookLend") Books booking) {
		return "bCheckOut";
	}
}
