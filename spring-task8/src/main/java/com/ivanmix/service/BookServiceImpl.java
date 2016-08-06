package com.ivanmix.service;

import com.ivanmix.model.Book;
import com.ivanmix.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    //@Inject
    @Autowired
    @Qualifier("dBBookRepository")
	private BookRepository repository;

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
