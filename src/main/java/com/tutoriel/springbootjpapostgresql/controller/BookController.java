package com.tutoriel.springbootjpapostgresql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutoriel.springbootjpapostgresql.models.Book;
import com.tutoriel.springbootjpapostgresql.service.BookService;


@RestController
@RequestMapping(path = "/api/books")
public class BookController {

	
	@Autowired
	private BookService bookService;
	
	@GetMapping(path = "/")
	public List<Book> getBooks(){
		return bookService.getBooks();
	}
	
	@PostMapping(path = "/")
	public Book saveBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}
	
	@GetMapping(path = "/{id}")
	public Book getBookByID(@PathVariable Long id) {
		return bookService.getBookByID(id);
	}
	
	@PutMapping(path = "/{id}")
	public Book updateBook(@PathVariable Long id,@RequestBody Book book) {
		return bookService.updateBook(id, book);
	}
	
	@DeleteMapping(path = "/{id}")
	 public void deleteBookByID(@PathVariable Long id) {
		  bookService.deleteByID(id);
	 }
	 
	@DeleteMapping(path = "/")
	 public void deleteBooks() {
		 bookService.deleteBooks();
	 }
}
