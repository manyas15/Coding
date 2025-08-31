//package com.example.Library;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
@Component
public class BookServiceImpn implements BookService {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: ");
    }
    public List<Book> getAllBooks() {
        return books;
    }
}