package com.txiong.service;

import com.txiong.model.Book;

import java.util.List;

/**
 * Created by thor on 8/4/15.
 */
public interface BookService {
    public List<Book> listBooks();

    public List<Book> listBooks(String firstName, String lastName);

    public List<Book> listBooks(String type);

    public Book getBook(String title);

    public Book createBook(Book book);

    public void removeBook(Book book);

}
