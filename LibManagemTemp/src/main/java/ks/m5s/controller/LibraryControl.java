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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ks.m5s.model.Books;
import ks.m5s.model.Catalouge;
import ks.m5s.model.Librarian;
import ks.m5s.model.Student;
import ks.m5s.service.EmailValidator;
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
	
	
	private Logger logger = LoggerFactory.getLogger(LibraryControl.class);

	// log 6-12 + log 100-103
	
	@GetMapping("/home")
	public String showStartPage() {	
		return "home";
	}
	
	@GetMapping("/studReg")
	public String registerStud(@ModelAttribute ("studReg")Student student) {	
		System.out.println("Implementation class of IRegistrationService is :: " + reg.getClass().getName());	
		logger.info("registerStudent() _GetMapping method was called - log 6 ");
		return "studReg";
	}
	
	
	@PostMapping("/studReg")
	public String registerStudent(@ModelAttribute ("studReg")Student student) {	
		logger.info("entering registerStudent() _PostMapping method - log 7a");
		String eMail= student.getEMail();
		System.out.println(eMail);
		//boolean check=EmailValidator.isValid(eMail);
		//if (check)
		reg.registerStudent(student);		
		logger.info("leaving registerStudent() _PostMapping method - log 7b");
		return "studRegConf";
	}
	
	
	@GetMapping("/libReg")
	public String registerLib(@ModelAttribute ("libReg")Librarian librarian){
		System.out.println("Implementation class of IRegistrationService is :: " + reg.getClass().getName());
		logger.info("registerLibrarian() _GetMapping method was called - log 8");
		return "libReg";
		}
	
	@PostMapping("/libReg")
	public String registerLibrarian(@ModelAttribute ("libReg")Librarian librarian){
		logger.info("entering registerLibrarian() _PostMapping method - log 9a");
		String email= librarian.getEMail();
		System.out.println(email);
//		boolean check=EmailValidator.isValid(email);
//		if (check)
		reg.registerLibrarian(librarian);
		logger.info("leaving registerLibrarian() _PostMapping method- log 9b");
		return "libRegConf";
		}
	
	@GetMapping("/studLog")
	public String studentLogIn(@ModelAttribute ("studLog") Student stud) {
		logger.info("studentLogIn()_GetMapping method was called - log 100");
		return "studLogIn";
	}
	
	@PostMapping("/studLog")
	public String studLogin(@ModelAttribute ("studLog") Student stud) {  //Map<String, Object> map,
//		map.put("enrolNo", stud.getEnrolNo());
//		map.put("password",stud.getPassword());
//		System.out.println("Map is going to be printed: "+ map);		
		logger.info("studLogin()_PostMapping method was called - log 101");
		return"chooseStud";  
	}
	
	@GetMapping("/libLog")
	public String librarianLogIn(@ModelAttribute("libLog") Librarian lib) {
		logger.info("librarianLogIn()_GetMapping method was called - log 102");
		return "libLogIn";
	}
	
	@PostMapping("/libLog")
	public String libLogin(@ModelAttribute ("libLog") Librarian lib) {
		logger.info("libLogin()_PostMapping method was called -log 103");
		
		return"chooseLib";
	}
	
	@GetMapping("/safe")
	public String safeBook(@ModelAttribute("safeB") Books book) {
		logger.info("safeBook() _GetMapping method was called - 10");
		return "bookSafe";
	}
	
	@PostMapping ("/safe")
	public String safeBookToCatalouge(Map<String, Object> model, @ModelAttribute("safeB") Books book) {
		System.out.println("Implementation class of IBookLendingService is :: " + bookOrga.getClass().getName());
		bookOrga.safeBookToCatalouge(book);
		logger.info("entering LibraryControl.safeBookToCatalogue()_PostMapping method - log 11a");
		System.out.println(book);
		model.put("book", book);
		logger.info("leaving LibraryControl.safeBookToCatalogue()_PostMapping method - log 11b");
		return("confirmSafe");
		
	}
	
	@GetMapping("/display")
	public String displayCatalogue (@ModelAttribute("safeB") Catalouge catalogue) {	
		Catalouge books = bookOrga.displayCatalogue();
		List <Books> booky = catalogue.establishCatalouge();
		booky.forEach(System.out::println);
		logger.info("displayCatalogue()_GetMapping method was called - log 12");
		return"list displayed";
	}
	
	
}
