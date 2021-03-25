package com.kodilla.collections.adv.Immutable.special.homework;

import java.util.Objects;

public class Book {
    private String author;
    private String title;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return author.equals(book.author) &&
                title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }

    public Book(String author, String title){
        this.author = author;
        this.title = title;


    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
