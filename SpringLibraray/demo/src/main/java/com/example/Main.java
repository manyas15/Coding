package com.example;

import java.awt.print.Book;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext AppConfig.class;
        BookService bookService = context.getBean(BookService.class);

        Book book1 = new Book("Learning C", "Alex", 1);
        Book book2 = new Book("Learning Java", "Brian", 2);
        bookService.addBook(book1);
        bookService.addBook(book2);

        System.out.println("All books: ");
        bookService.getAllBooks().forEach(System.out::println);
    }
}