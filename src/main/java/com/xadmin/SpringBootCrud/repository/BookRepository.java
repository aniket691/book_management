package com.xadmin.SpringBootCrud.repository;

import org.springframework.data.repository.CrudRepository;

import com.xadmin.SpringBootCrud.bean.Book;

public interface BookRepository extends CrudRepository<Book,String> {
	

}
