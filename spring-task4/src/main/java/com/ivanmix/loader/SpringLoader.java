package com.ivanmix.loader;

import java.util.List;

import com.ivanmix.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ivanmix.model.Book;

public class SpringLoader {
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml")) {
			
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
