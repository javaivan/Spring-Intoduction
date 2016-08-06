package com.ivanmix.repository;

import com.ivanmix.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Qualifier("dBBookRepository")
public class DBBookRepository implements BookRepository {

	@Autowired
	private Environment enc;

	private final Map<Integer, Book> books = new HashMap<>();

	private int counter = 0;

	private final String server = "localhost";

	private String db;

	@PostConstruct
	public void init() {
		this.db = enc.getProperty("db.jdbc.url");
		System.out.println("Started DBBookRepository repository with server:" + server + " and database: " + db );
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Shutting down repository ... ");
	}
	
	public void saveBook(Book book) {
		if (book.getId() == 0) {
			counter++;
			book.setId(counter);
		}
		
		books.put(book.getId(), book);

		System.out.println("Saved book " + book);
	}
	
	public Book findBookById(int id) {
		return books.get(id);
	}

	public List<Book> findBooks() {
		return new ArrayList<>(books.values());
	}
}
