package com.ivanmix.configuration;

import com.ivanmix.repository.DBBookRepository;
import com.ivanmix.service.BookService;
import com.ivanmix.service.BookServiceImpl;
import com.ivanmix.repository.XmlBookReposiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

@Configuration
@ComponentScan("com.ivanmix")
@Import(PropertySourceConfig.class)
public class AppConfiguration {

}
