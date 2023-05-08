package ks.m5s.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import ks.m5s.model.BookCatalogue;
import ks.m5s.service.BookStatus;

@Controller
public class BookLendingManagement {
	
	@GetMapping("/checkOut")
	public String getABook(@ModelAttribute ("bookTrack") BookCatalogue book) {
		return "bookSearch";
	}
    
	@PostMapping("/checkOut")
	public String bookCheckout(Map<String, Object> map, @ModelAttribute("bookLend") BookStatus booking) {
		return "bCheckOut";
	}
}
