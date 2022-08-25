package com.example.spring.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.spring.mongodb.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
