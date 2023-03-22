package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {


        ArrayList<Book> books = new ArrayList<>();
        Book Book1 = new Book(300, "Der Pakt", LocalDate.of(2022, 4, 10));
        Book Book2 = new Book(250, "RAF Camora Biografie", LocalDate.of(2019, 5, 10));
        Book Book3 = new Book(150, "Der Pate", LocalDate.of(2012, 4, 7));

        books.add(Book1);
        books.add(Book2);
        books.add(Book3);
        Book.sort(Comparator.comparing(Book::getPages));
        Book.sort(Comparator.comparing(Book::getRealeaseDate));
        Book.sort(Comparator.comparing(Book::getTitle));
        for (Book book : books) {
            book.printInfo();

        }
        System.out.println("*********************************");
    }
}
