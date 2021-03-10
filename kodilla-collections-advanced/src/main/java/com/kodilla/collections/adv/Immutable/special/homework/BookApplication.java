package com.kodilla.collections.adv.Immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book1 = BookManager.createBook("Wiedzmin" ,"Andrzej Sapkowski");
        Book book2 = BookManager.createBook("W pustyni i w puszczy", "Henryk Sienkiewicz");
        Book book3 = BookManager.createBook("Wiedzmin" ,"Andrzej Sapkowski");
        System.out.println(book1.equals(book3));
    }
}
