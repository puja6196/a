package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
class Connection1
{    public Connection getConnection()
   {
	try 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.1.50.198.1521:orcl","sh","sh");
		
		
	} 
	catch (ClassNotFoundException e) 
	{
	
		e.printStackTrace();
	}
	catch(SQLException e)
	{
		e.printStackTrace();

	}
	return null;
	
   }
}

public class JDBCDemo 
{
	public static void main(String[] args)
	{  
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		
		case 1: System.out.println("SIGN UP");			
			    SignUp signUp=new  SignUp();
		        signUp.newUser();
		        break;
		case 2: System.out.println("SIGN IN");			
	            SignIn signIn=new  SignIn();
                signIn.existingUser();
                break; 
		
		
		}
		
		
	}


}
