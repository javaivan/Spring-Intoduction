package com.ivanmix.loader;

import java.util.List;

import com.ivanmix.model.Book;
import com.ivanmix.service.BookServiceImpl;

public class BootstrapLoader {

	public static void main(String[] args) {
		BookServiceImpl service = new BookServiceImpl();
		Book book = new Book();
		book.setName("Introduction into Spring");
		book.setPages(100);
		book.setYear(2016);
		service.saveBook(book);

		List<Book> books = service.findBooks();
		System.out.println(books);
	}

}
