package ks.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
	}
}
