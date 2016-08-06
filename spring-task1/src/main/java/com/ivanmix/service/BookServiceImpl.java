package com.ivanmix.service;

import java.util.List;

import com.ivanmix.model.Book;
import com.ivanmix.repository.DBBookRepository;

public class BookServiceImpl {
	private final DBBookRepository repository =
			new DBBookRepository();
	
	public BookServiceImpl() {
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
