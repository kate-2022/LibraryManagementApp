package lib.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lib.StudentServiceFactory.StudentServiceFactory;
import lib.model.Student;
import lib.service.IStudentService;
import lib.util.HibernateUtil;



@WebServlet(urlPatterns = {"/control/*"},loadOnStartup = 1)
public class ControllerServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	static {
		HibernateUtil.startUp();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	private void doProcess(HttpServletRequest request, HttpServletResponse response){
		
		IStudentService stdService = StudentServiceFactory.getStudentService();
		
		System.out.println("Request URI : " + request.getRequestURI());
		System.out.println("Path info : " + request.getPathInfo());
		
		if (request.getRequestURI().endsWith("register")) {
			Integer enrollNo = Integer.parseInt(request.getParameter("enrollmentNo"));
			String lastName = request.getParameter("lastName");
			String firstName = request.getParameter("firstName");
			Long dob = Date.parse(request.getParameter("doB"));
			
			Student student = new Student();
			student.setEnrollmentNo(enrollNo);
			student.setLastName(lastName);
			student.setFirstName(firstName);
			student.setDoB(null);
			
			String status = stdService.addStudent(student);
			
			//...
			
			
		}
	}
}
