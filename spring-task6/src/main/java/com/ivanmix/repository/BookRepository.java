package com.ivanmix.repository;

import com.ivanmix.model.Book;

import java.util.List;

public interface BookRepository {
    public void saveBook(Book book);
    public Book findBookById(int id);
    public List<Book> findBooks();
}
