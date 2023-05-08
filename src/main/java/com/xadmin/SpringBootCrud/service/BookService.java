package com.xadmin.SpringBootCrud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.SpringBootCrud.bean.Book;
import com.xadmin.SpringBootCrud.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	public BookRepository bookRepo;

	public List<Book> getAllBook()
	{
		List<Book> books = new ArrayList<>();
		bookRepo.findAll().forEach(books::add);
		return books;
	}

	public void addBook(Book book) {
		bookRepo.save(book);
		
	}

	public void updateBook(String id, Book book) {
		bookRepo.save(book);
		
	}

	public void deleteBook(String id) {
		bookRepo.deleteById(id);
		
	}
}
