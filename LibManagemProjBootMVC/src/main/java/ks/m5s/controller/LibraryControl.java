package ks.m5s.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jmx.export.annotation.ManagedAttribute;
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
	

	// log 6-12 + log 100-103
	
	@GetMapping("/home")
	public String showStartPage() {	
		return "entry";
	}
	
	@GetMapping("/studReg")
	public String registerStud(@ModelAttribute ("studReg")Student student) {	
		System.out.println("Implementation class of IRegistrationService is :: " + reg.getClass().getName());	
		System.out.println("registerStudent() _GetMapping method was called - log6");
		return "studReg";
	}
	
	@PostMapping("/studReg")
	public String registerStudent(@ModelAttribute ("studReg")Student student) {	
		System.out.println("registerStudent() _PostMapping method was called - log 7a");
		reg.registerStudent(student);		
		System.out.println("registerStudent() _PostMapping method was called - log 7b");
		return "studRegConf";
	}
	
	
	@GetMapping("/libReg")
	public String registerLib(@ModelAttribute ("libReg")Librarian librarian){
		System.out.println("Implementation class of IRegistrationService is :: " + reg.getClass().getName());
		System.out.println("registerLibrarian() _GetMapping method was called - log8");
		return "libReg";
		}
	
	@PostMapping("/libReg")
	public String registerLibrarian(@ModelAttribute ("libReg")Librarian librarian){
		System.out.println("registerLibrarian() _PostMapping method was called - log 9a");
		reg.registerLibrarian(librarian);
		System.out.println("registerLibrarian() _PostMapping method was called - log 9b");
		return "libRegConf";
		}
	
	@GetMapping("studLog")
	public String studentLogIn(@ModelAttribute ("studLog") Student stud) {
		System.out.println("studentLogIn()_GetMapping method was called - log 100");
		return "studLogIn";
	}
	
	@PostMapping("studLog")
	public String studLogin(Map<String, Object> map, @ModelAttribute ("studLog") Student stud) {
		map.put("enrolNo", stud.getEnrolNo());
		map.put("password",stud.getPassword());
		System.out.println("Map is going to be printed: "+ map);		
		System.out.println("studLogin()_PostMapping method was called - log 101");
		return"";  // what .jsp to return
	}
	
	@GetMapping("libLog")
	public String librarianLogIn(@ModelAttribute("libLog") Librarian lib) {
		System.out.println("librarianLogIn()_GetMapping method was called - log 102");
		return "libLogIn";
	}
	
	@PostMapping("libLog")
	public String libLogin(@ModelAttribute ("libLog") Librarian lib) {
		System.out.println("libLogin()_PostMapping method was called - log 103");
		
		return"chooseInd";
	}
	
	@GetMapping("/safe")
	public String safeBook(@ModelAttribute("safeB") Books book) {
		System.out.println("safeBook() _GetMapping method was called - log 10");
		return "bookSafe";
	}
	
	@PostMapping ("/safe")
	public String safeBookToCatalouge(Map<String, Object> model, @ModelAttribute("safeB") Books book) {
		System.out.println("Implementation class of IBookLendingService is :: " + bookOrga.getClass().getName());
		bookOrga.safeBookToCatalouge(book);
		System.out.println("LibraryControl.safeBookToCatalogue()_PostMapping method was called - log 11a");
		System.out.println(book);
		model.put("book", book);
		System.out.println("LibraryControl.safeBookToCatalogue()_PostMapping method was called - log 11b");
		return("confirmSafe");
		
	}
	
	@GetMapping("/display")
	public String displayCatalogue (@ModelAttribute("safeB") Books book) {	
		List<Books> books =bookOrga.displayCatalogue();
		for(Books elem: books) System.out.println(books);
		System.out.println("displayCatalogue()_GetMapping method was called - log 12");
		return"list displayed";
	}
	
	
}
