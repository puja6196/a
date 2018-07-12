package com.nucleus.Domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



import com.nucleus.Connection.ConnectionSetup;
import com.nucleus.controller.NewEntry;

public class DAOImpl implements DAO
{   ConnectionSetup connectionSetup=new  ConnectionSetup();
Connection con= connectionSetup.getConnection();	

	
	public void saveBook(NewEntry newEntry)
	{  
		
		  PreparedStatement pstmt=null;
			try {
				 pstmt = con.prepareStatement("insert into pujabuk values(?,?,?,?)");
				 pstmt.setString(1,newEntry.getBookId());
				 pstmt.setString(2,newEntry.getBookName() );
				 pstmt.setString(3,newEntry.getAuthor());
				 pstmt.setString(4,newEntry.getBook() );
				 pstmt.executeUpdate();
		         System.out.println("hellllllllllllooooooo");
			}
			catch (SQLException e) 
			{
	           
				e.printStackTrace();
			}
			finally
			{
				try {
					connectionSetup.closeConnection(); 
					pstmt.close();
				} catch (SQLException e) {

					e.printStackTrace();
				}
				
	
		
	}

}
}