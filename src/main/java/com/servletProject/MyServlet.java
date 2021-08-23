package com.servletProject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
@WebServlet("/my")
public class MyServlet extends HttpServlet {

	private static final long serialVersionUID = -5125395801333170414L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service...");
		super.service(req, resp);
	}

	@Override 
	protected void doGet(HttpServletRequest req, HttpServletResponse
	  resp) throws ServletException, IOException { 
		// System.out.println("doget");
	  
	  resp.setContentType("text/html"); PrintWriter pw = resp.getWriter();
	  
	  pw.println("<html><body>"); pw.println("Welcome to servlet");
	  pw.println("</body></html>");
	  
	  
	  String name = req.getParameter("name"); pw.println("<HTML>");
	  pw.println("<HEAD><TITLE>Hello, " + name + "</TITLE></HEAD>");
	  pw.println("<BODY>"); pw.println("Hello, " + name);
	  pw.println("</BODY></HTML>");
	  
	  
	  pw.println("<HEAD><TITLE>Hello</TITLE></HEAD>"); pw.println("<BODY>");
	  pw.println("Hello"); pw.println("<input type=\"text\" name=\"username\"/>");
	  pw.println("</BODY></HTML>");
	  
	  
	  pw.close();
	    
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("dopost....");
	}
}

/*
 * private static final long serialVersionUID = 1861227452784320290L;
 * 
 * @Inject private MyService myService;
 */
	/*
	 * RequestDispatcher rd = req.getRequestDispatcher("index.html");
	 * rd.forward(req, resp);
	 */
	  // req.sendRedirect("something.html"); }


	/*
	 * @Override protected void doGet(HttpServletRequest req, HttpServletResponse
	 * resp) throws ServletException, IOException { RequestDispatcher rd =
	 * req.getRequestDispatcher("src/main/WEB-INF/myfile.html"); rd.include(req,
	 * resp); }
	 */

	/*
	 * protected void service(HttpServletRequest request, HttpServletResponse
	 * response)
	 * 
	 * throws ServletException, IOException {
	 * response.getWriter().println("Service: " + myService.doStuff()); }
	 */

