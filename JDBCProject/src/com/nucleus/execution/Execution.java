package com.nucleus.execution;

import com.nucleus.dao.BookDAO;
import com.nucleus.dao.BookDAOImpl;
import com.nucleus.domain.Book;

public class Execution {

	public static void main(String[] args) {
	
Book book=new Book();
book.setBookId(101);
book.setBookName("Head First");
book.setPrice(800f);
BookDAO bookDAO=new BookDAOImpl();
bookDAO.saveBook(book);
	}

}
