package com.xadmin.SpringBootCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.SpringBootCrud.bean.Book;
import com.xadmin.SpringBootCrud.service.BookService;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/allBooks")
    public List<Book> getAllBooks() {
        return bookService.getAllBook();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addBook")
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/book/{id}")
    public void updateBook(@PathVariable String id, @RequestBody Book book) {
        bookService.updateBook(id, book);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/book/{id}")
    public void deleteBook(@PathVariable String id) {
        bookService.deleteBook(id);
    }


}
