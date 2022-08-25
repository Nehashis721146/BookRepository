package com.example.spring.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.mongodb.model.Book;
import com.example.spring.mongodb.repository.BookRepository;

@Service
public class BookService {
 
	@Autowired
	private BookRepository bookRepository;

	public Book storeBook(Book book) {
		return bookRepository.save(book);
	}
	public List<Book> findAll() {
		return bookRepository.findAll();
	}
	public void delete(Book book) {
		bookRepository.delete(book);
		
	}
	

}

