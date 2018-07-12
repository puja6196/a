package com.nucleus.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nucleus.Domain.DAO;
import com.nucleus.Domain.DAOImpl;
import com.nucleus.execution.CRUDExecution;


@WebServlet("/CS")
public class CRUDServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		String BookId=request.getParameter("BookId");
		out.println("gdtagdyageFYEWFG");
		
		
		
	}

	protected void doNewEntry(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{  
		PrintWriter out=response.getWriter();
		NewEntry newEntry=new NewEntry();
		String BookId=request.getParameter("BookId");
	    String BookName=request.getParameter("BookName");
	    String Author=request.getParameter("Author");
	    
	    String Book=request.getParameter("Book");
	   
	    out.println(BookId);
	  	out.println(BookName);
	  	 
	  	out.println(Author);
	
		out.println(Book);
	    /*String[] Publications = request.getParameterValues("Publications");
	    List<String> list =  Arrays.asList(Publications); 
	    out.println(list);*/
	    newEntry.setBookId("BookId");
	    newEntry.setBookId("BookName");
	    newEntry.setAuthorName("Author");
	    newEntry.setBook("Book");
	   DAO daoImpl=new DAOImpl();
	   daoImpl.saveBook(newEntry);
	    
        out.println("new book entry");
	   
	    
	  	
	  	
		
	}
    public CRUDServlet() 
    {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doNewEntry(request,response);
		doDelete(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

}
