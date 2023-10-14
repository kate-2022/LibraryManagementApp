package ks.m5s.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ks.m5s.model.Books;
import ks.m5s.model.Librarian;
import ks.m5s.model.Student;
import ks.m5s.service.IBookLendingService;
import ks.m5s.service.IRegistrationService;

@Controller
@RequestMapping("/lib")
public class LibraryControl {

	@Bean
	public LocalDate getDate() {
		return LocalDate.now();
	}
	
	@Autowired
	private IBookLendingService bookOrga; 
	
	@Autowired
	private IRegistrationService reg;
	

	@GetMapping("/home")
	public String showStartPage() {	
		return "choose";
	}
	
	@GetMapping("/studReg")
	public String registerStudent(Student student) {	
		System.out.println("Implementation class is :: " + reg.getClass().getName());
		String result= reg.registerStudent();		
		return result;
	}
	
	@GetMapping("/studRegConf")
	public String studRegConfirmation() {		
		return "studRegConf";
	}
	
	@GetMapping("/librReg")
	public String registerLibrarian(Librarian librarian){
		String outcome = reg.registerLibrarian();
		return outcome;
		}
	
	@GetMapping("/libRegConf")
	public String libRegConfirmation() {		
		return "libRegConf";
	}
	
	public String safeBook() {
		return "/safe";
	}
	
	@PostMapping ("/safe")
	public String safeBookToCatalouge(Map<String, Object> model, @ModelAttribute("safeBook") Books book) {
		System.out.println("Implementation class is :: " + bookOrga.getClass().getName());
		bookOrga.safeBookToCatalouge(book);
		System.out.println("LibraryControl.safeBookToCatalogue");
		System.out.println(book);
		model.put("book", book);
		return("bookSafe");
		
	}
	
	@GetMapping("/display")
	public String displayCatalogue () {	
		List<Books> books =bookOrga.displayCatalogue();
		for(Books elem: books) System.out.println(books);
		return"list displayed";
	}
	
	
}
