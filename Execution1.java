package com.nucleus.execution;
import java.util.Scanner;

import com.nucleus.DAO.DAOInterface;
import com.nucleus.domain.CustomerMaster;
import com.nucleus.implementation.DAOImplementation;

public class Execution1 
{
   public static void main(String[]args)
   {      DAOInterface daoImplementation=new DAOImplementation();
          CustomerMaster customerMaster=new CustomerMaster();
          
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter the choice");
	      String choice=sc.next();
	      if(choice=="F")
	      {  
	    	  System.out.println("File level Rejection");
	    	  
	    	  
	      }
	      if(choice.equalsIgnoreCase("R"))
	      {
	    	  System.out.println("Record Level Rejection");
	    	  daoImplementation.readFile1(customerMaster);
	    	  
	    	  
	    	  
	      }
	      else
	      {
	    	  System.out.println("You have made the wrong choice ");
	    	  
	    	  
	      }
	      sc.close();
	      }
	   
	    
	   
	
   }
	
	

