package com.ivanmix.loader;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ivanmix.model.Book;
import com.ivanmix.service.BookService;

public class SpringLoader {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("it.discovery")) {
			BookService service = context.getBean(BookService.class);
			Book book = new Book();
			book.setName("Introduction into Spring");
			book.setPages(100);
			book.setYear(2016);
			service.saveBook(book);
			List<Book> books = service.findBooks();
			System.out.println(books);
		}
	}
}
