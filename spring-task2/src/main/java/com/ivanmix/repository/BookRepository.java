package com.ivanmix.repository;

import com.ivanmix.model.Book;

import java.util.List;

/**
 * Created by ivan on 06.08.2016.
 */
public interface BookRepository {
    public void saveBook(Book book);
    public Book findBookById(int id);
    public List<Book> findBooks();
}
