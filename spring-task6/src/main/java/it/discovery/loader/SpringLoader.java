package it.discovery.loader;

import java.util.List;

import it.discovery.configuration.AppConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import it.discovery.model.Book;
import it.discovery.service.BookService;

public class SpringLoader {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class)) {
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
