package com.txiong.controller;

import com.txiong.model.Book;
import com.txiong.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by thor on 8/9/15.
 */
@RestController
@RequestMapping(value = "/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Book> listBooks() {
        return bookService.listBooks();
    }

    @RequestMapping(value = "/author/{firstName}/{lastName}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Book> listBook(@PathVariable("firstName") String firstName,
                              @PathVariable("lastName") String lastName) {
        return bookService.listBooks(firstName, lastName);
    }

    @RequestMapping(value = "/type/{type}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Book> listBook(@PathVariable("type") String type) {
        return bookService.listBooks(type);
    }

    @RequestMapping(value = "/title/{title}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public Book getBook(@PathVariable("title") String title) {
        return bookService.getBook(title);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeBook(@RequestBody Book book) {
        bookService.removeBook(book);
    }
}
