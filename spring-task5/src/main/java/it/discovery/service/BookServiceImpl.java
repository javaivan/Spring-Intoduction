package it.discovery.service;

import it.discovery.model.Book;
import it.discovery.repository.BookRepository;
import it.discovery.repository.DBBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	@Qualifier("xmlBookReposiory")
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
