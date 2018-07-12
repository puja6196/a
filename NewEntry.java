package com.nucleus.controller;

public class NewEntry 
{
	String BookId;
	String BookName;
	String Book;
	String Author;
	/*String[] Publications=new String[10];*/
	public String getBookId() {
		return BookId;
	}
	public void setBookId(String bookId) {
		BookId = bookId;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getBook() {
		return Book;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthorName(String author) {
		Author = author;
	}
	public void setBook(String book) {
		Book = book;
	}
	/*public String[] getPublications() {
		return Publications;
	}
	public void setPublications(String[] publications) {
		Publications = publications;
	}
	*/

}
