package com.kodilla.collections.adv.Immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private static List<Book> books = new ArrayList<>();

    public static Book createBook(String title, String author) {

        Book book = new Book(title, author);

        System.out.println(books.contains(book));
        if (!books.contains(book)) {
            books.add(book);
        }
        return book;
    }

    public static List<Book> getBooks() {
        return books;
    }
}