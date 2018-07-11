package pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
//@WebServlet("/S1")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String email;
	String contactp;
public void init()
{
//	ServletConfig servletConfig=getServletConfig();
//	email=servletConfig.getInitParameter("email");
//	//ServletContext servletContext=getServletContext();
//	contactp=servletConfig.getInitParameter("contactperson");
}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out=response.getWriter();
	
//		/*ServletConfig servletConfig=getServletConfig();
//		email=servletConfig.getInitParameter("email");*/
//		out.println("Email: "+email);
//		out.println("Contact Person: "+contactp);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}











