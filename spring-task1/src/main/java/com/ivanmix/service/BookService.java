package com.ivanmix.service;

import com.ivanmix.model.Book;

import java.util.List;

/**
 * Created by ivan on 06.08.2016.
 */
public interface BookService {

    public void saveBook(Book book);

    public Book findBookById(int id);

    public List<Book> findBooks();
}
