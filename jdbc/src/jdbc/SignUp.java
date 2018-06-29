package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

class SignUp 
{  
	

	public void newUser()
	{  
		String email = null;
	    String password=null;
		Connection1 connection1=new  Connection1();  
	    Connection	con1=connection1.getConnection();
		PreparedStatement pstmt=null;
		Scanner sc=new Scanner(System.in);
		email=sc.next();
		password=sc.nextLine();
		try {
			pstmt = con1.prepareStatement("insert into database values(?,?)");
			pstmt.setString(1,email);
			pstmt.setString(2,password);
			pstmt.executeUpdate();
			
		} catch (SQLException e1) {

			e1.printStackTrace();
		}
	
		
	
		
	}

}
 class SignIn 
 { 
		 public void existingUser()
	 {   
		 Connection1 connection2=new  Connection1();  
	    Connection  con2=connection2.getConnection();
		 String email;
		String email1;
	     String password;
	     String password1;
	  
		 PreparedStatement pstmt=null;
		try
		{
			 pstmt = con2.prepareStatement("select email from database2" );
			 ResultSet res= pstmt.executeQuery();
			 res.next();
		     email1=res.getString(1);
		     pstmt=con2.prepareStatement("select password from database2" );
		     res=pstmt.executeQuery();
			 res.next();
			 password1= res.getString(2);
		       
		} 
		catch (SQLException e)
		{

			e.printStackTrace();
		}
		
			
			
			
			
			
		 
	 }
 }
