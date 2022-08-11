package com.codingdojo.java.bookclub.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.java.bookclub.models.Book;
import com.codingdojo.java.bookclub.models.User;


@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

	List<Book> findAll();
}
