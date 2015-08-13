package com.txiong.service;

import com.txiong.model.Book;
import com.txiong.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by thor on 8/4/15.
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;

    @Override
    public List<Book> listBooks() {
        Iterable<Book> itr = bookRepository.findAll();

        return getBooks(itr);
    }

    @Override
    public List<Book> listBooks(String firstName, String lastName) {
        Iterable<Book> itr = bookRepository.findByFirstNameAndLastName(firstName, lastName);

        return getBooks(itr);
    }

    @Override
    public List<Book> listBooks(String type) {
        Iterable<Book> itr = bookRepository.findByType(type);

        return getBooks(itr);
    }

    @Override
    public Book getBook(String title) {
        return bookRepository.findByTitle(title);
    }

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void removeBook(Book book) {
        bookRepository.delete(book);
    }

    /**
     * Helper method to create a list of books from the result.
     * @param itr The iterable book.
     * @return A list of book.
     */
    private List<Book> getBooks(Iterable<Book> itr) {
        List<Book> bookList = new ArrayList<Book>();

        for (Iterator<Book> currentItr = itr.iterator(); currentItr.hasNext();) {
            bookList.add(currentItr.next());
        }

        return bookList;
    }
}
