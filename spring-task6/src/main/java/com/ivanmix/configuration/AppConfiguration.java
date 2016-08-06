package com.ivanmix.configuration;

import com.ivanmix.repository.DBBookRepository;
import com.ivanmix.repository.XmlBookReposiory;
import com.ivanmix.service.BookService;
import com.ivanmix.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    @Bean
    @Qualifier("dBBookRepository")
    public DBBookRepository dbBookRepository(){
        return new DBBookRepository();
    }

    @Bean
    @Qualifier("xmlBookReposiory")
    public XmlBookReposiory xmlBookReposiory(){
        return new XmlBookReposiory();
    }

    @Bean
    public BookService bookService(){
        return new BookServiceImpl();
    }
}
