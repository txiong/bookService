package com.txiong.services;

import com.txiong.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by thor on 8/4/15.
 */
@Service
public class BookServiceImpl implements BookService {
    @Override
    public List<Book> listBooks() {
        return null;
    }

    @Override
    public Book getBook(String title, String author) {
        return null;
    }

    @Override
    public Book createBook(Book book) {
        return null;
    }

    @Override
    public void removeBook(Book book) {

    }
}
