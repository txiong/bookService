package com.txiong.services;

import com.txiong.model.Book;

import java.util.List;

/**
 * Created by thor on 8/4/15.
 */
public interface BookService {
    public List<Book> listBooks();

    public Book getBook(String title, String author);

    public Book createBook(Book book);

    public void removeBook(Book book);

}
