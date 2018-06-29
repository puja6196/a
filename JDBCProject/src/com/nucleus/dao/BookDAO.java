package com.nucleus.dao;

import com.nucleus.domain.Book;

public interface BookDAO 
{
public void saveBook(Book book);
public Book getBookByBookId(int bookId);
}
