package com.ivanmix.configuration;

import com.ivanmix.repository.DBBookRepository;
import com.ivanmix.service.BookService;
import com.ivanmix.service.BookServiceImpl;
import com.ivanmix.repository.XmlBookReposiory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.ivanmix")
@PropertySource("application.properties")
public class AppConfiguration {

}
