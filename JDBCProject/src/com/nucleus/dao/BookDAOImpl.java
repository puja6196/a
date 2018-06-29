package com.nucleus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.nucleus.connection.ConnectionSetup;
import com.nucleus.domain.Book;

public class BookDAOImpl implements BookDAO 
{

	@Override
	public void saveBook(Book book) {
		try
		{
		ConnectionSetup connectionSetup=new ConnectionSetup();
		Connection con=connectionSetup.getConnection();
		PreparedStatement pstmt=con.prepareStatement("insert into book0 values(?,?,?)");
		pstmt.setInt(1,book.getBookId() );
		pstmt.setString(2, book.getBookName());
		pstmt.setFloat(3,book.getPrice());
		pstmt.executeUpdate();
		System.out.println("saved");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public Book getBookByBookId(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

}
