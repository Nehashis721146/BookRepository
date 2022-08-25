package com.example.spring.mongodb.rcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.mongodb.model.Book;
import com.example.spring.mongodb.service.BookService;

@RestController
public class BookController {
 
	@Autowired
	private BookService bookService ;
	
	
	
	@PostMapping
	public ResponseEntity<Book> storeBook(@RequestBody Book book){
		return new ResponseEntity<Book>(bookService.storeBook(book),HttpStatus.ACCEPTED);
	}
	
	@GetMapping
	public ResponseEntity<List<Book>> findAll(){
		return new ResponseEntity<List<Book>>(bookService.findAll(),HttpStatus.ACCEPTED);
	}
	@DeleteMapping
	public ResponseEntity<String> delete(@RequestBody Book book){
		bookService.delete(book);
		return new ResponseEntity<String>("Record deleted",HttpStatus.ACCEPTED);		
	}

}
