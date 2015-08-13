package com.txiong.repository;


import com.txiong.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by thor on 8/9/15.
 */

public interface BookRepository extends CrudRepository <Book, Long> {
    public Book findByTitle(String title);

    public List<Book> findByType(String type);

    public List<Book> findByFirstNameAndLastName(String firstName, String lastName);
}
