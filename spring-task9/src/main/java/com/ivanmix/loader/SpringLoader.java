package com.ivanmix.loader;

import java.util.List;

import com.ivanmix.model.Book;
import com.ivanmix.service.BookService;
import com.ivanmix.configuration.AppConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringLoader {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext()) {
			context.getEnvironment().setActiveProfiles("dev");
			context.register(AppConfiguration.class);
			context.refresh();

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
