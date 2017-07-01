package com.revature.service;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.revature.model.Book;
import com.revature.repository.BookRepository;
@Service
public class BookService {
	private static final Logger LOGGER = LoggerFactory.getLogger(BookService.class);

	@Autowired
	private BookRepository repository;

	
	@Transactional
	public List<Book> findAll() {
		LOGGER.debug("Retrieving the list of all users");
		return repository.findAll();
	}

	
	public Book findOne( int id)
	{
		
	return repository.findOne(id);
	}


}