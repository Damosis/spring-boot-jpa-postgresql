package com.tutoriel.springbootjpapostgresql.service;

import java.util.List;

import com.tutoriel.springbootjpapostgresql.models.Book;

public interface BookService {
	
	List<Book> getBooks();
	
	Book saveBook(Book book);
	
	Book getBookByID(Long id);
	
	Book updateBook(Long id,Book book);
	
	void deleteByID(Long id);
	
	void deleteBooks();

}
