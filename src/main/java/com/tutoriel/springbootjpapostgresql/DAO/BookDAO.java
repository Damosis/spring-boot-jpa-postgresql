package com.tutoriel.springbootjpapostgresql.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tutoriel.springbootjpapostgresql.models.Book;

@Repository
public interface BookDAO extends CrudRepository<Book, Long> {
	
}
