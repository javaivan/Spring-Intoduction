package com.ivanmix.service;

import java.util.List;

import com.ivanmix.model.Book;

public interface BookService {
	public void saveBook(Book book);
	
	public Book findBookById(int id);

	public List<Book> findBooks();
}
