package com.ivanmix.service;

import com.ivanmix.model.Book;
import com.ivanmix.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository repository;

	public BookRepository getRepository() {
		return repository;
	}

	public void setRepository(BookRepository repository) {
		this.repository = repository;
	}

	public BookServiceImpl() {
		System.out.println("Using db repository");
	}
	public BookServiceImpl(BookRepository repository) {
		this.repository = repository;
		System.out.println("Using db repository");
	}
	
	public void saveBook(Book book) {
		repository.saveBook(book);
	}
	
	public Book findBookById(int id) {
		return repository.findBookById(id);
	}

	public List<Book> findBooks() {
		return repository.findBooks();
	}
}
