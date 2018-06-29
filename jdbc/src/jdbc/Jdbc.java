package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Jdbc 
{  
	public void signin(String email,String password)
	{	
		Connection con = null ;
		PreparedStatement pstmt = null;
		
		String email1;
		String password1;
		
		
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 con=DriverManager.getConnection("jdbc:Oracle:thin:@10.1.50.198:1521:orcl","sh","sh");
			/* pstmt = con.prepareStatement("select email from database1" );
			 ResultSet res= pstmt.executeQuery();
			 res.next();
		     name1=res.getString(1);*/
			 pstmt = con.prepareStatement("select email from database1" );
			 ResultSet res= pstmt.executeQuery();
			 res.next();
		     email1=res.getString(1);
		 
		      pstmt=con.prepareStatement("select password from database1" );
		     res=pstmt.executeQuery();
			 res.next();
			 password1= res.getString(1);
			
			
			
			 if((email.equals(email1))&& (password.equals(password1)))
			 
				System.out.println("Welcome");
			
			
			 else
			  System.out.println("retry again");
		
	
		} 
		catch (ClassNotFoundException e) 
		{
		
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();

		}
	finally
	{
		try {
			con.close();
			pstmt.close();
			
		} catch (SQLException e) 
		{
		
			e.printStackTrace();
		}
		
	}
		
	}
	public void signup(String name,String email,String password)
	{
		Connection con = null ;
		PreparedStatement pstmt = null;
		
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 con=DriverManager.getConnection("jdbc:Oracle:thin:@10.1.50.198:1521:orcl","sh","sh");
			 pstmt=con.prepareStatement("insert into database1 values(?,?,?)");
			 pstmt.setString(1,name);
			 pstmt.setString(2,email);
			 pstmt.setString(3,password);
			 
			 pstmt.executeUpdate();
			System.out.println("signup done");
			
		} 
		catch (ClassNotFoundException e) 
		{
		
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();

		}
	finally
	{
		try {
			con.close();
			pstmt.close();
		} catch (SQLException e) 
		{
		
			e.printStackTrace();
		}
		
	}
		
		
		
		
	}

public static void main(String[]args)
	   {  
	
	       Jdbc jdbc=new Jdbc();
	       Scanner sc=new Scanner(System.in);
	       System.out.println("enter the choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			
			case 1: System.out.println("SIGN UP");	
			 System.out.println("enter the name");
		       String name=sc.next();
		       System.out.println("enter the email id");
		       String email=sc.next();
		       System.out.println("enter the password");
		       String password=sc.next();
				    Jdbc j1=new  Jdbc();
				    j1.signup(name,email,password);
			        
			        break;
			case 2: System.out.println("SIGN IN");	
			 System.out.println("enter the email id");
		       String email1=sc.next();
		       System.out.println("enter the password");
		       String password1=sc.next();
		            Jdbc j2=new Jdbc();
		            j2.signin(email1,password1);
	                break; 
			
			
			}
	       
	       
          
	   }
	  

}