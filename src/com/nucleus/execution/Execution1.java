package com.nucleus.execution;
import com.nucleus.DAO.DAOInterface;
import com.nucleus.domain.CustomerMaster;
import com.nucleus.implementation.DAOImplementation;

public class Execution1 
{
   public static void main(String[]args)
   {
   DAOInterface daoImplementation=new DAOImplementation();

   CustomerMaster customerMaster=new CustomerMaster();
	      daoImplementation.readFile1(customerMaster);
	  
	   
	   
	   }
	   
	   
	
   }
	
	

