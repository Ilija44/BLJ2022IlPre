package org.example;

import java.io.File;
import java.time.LocalDate;
import java.util.Comparator;

public class Book implements Comparable<Book> {

    private int pages;

    private String title;

    private LocalDate RealeaseDate;

    public Book(int pages, String title, LocalDate realeaseDate) {
        this.pages = pages;
        this.title = title;
        RealeaseDate = realeaseDate;
    }


    public static void sort(Comparator<Book> comparing) {
    }

    public void printInfo() {
        String info = "Title: " + title + "\nPages: " + pages + "\nRelease Date: " + RealeaseDate;
        System.out.println("*********************************");

        System.out.println(info);
    }


    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getRealeaseDate() {
        return RealeaseDate;
    }

    public void setRealeaseDate(LocalDate realeaseDate) {
        RealeaseDate = realeaseDate;
    }

    @Override
    public int compareTo(Book other) {
        int titleComparison = title.compareTo(other.title);
        if (titleComparison != 0) {
            return titleComparison;
        }
        int releaseDateComparison = RealeaseDate.compareTo(other.RealeaseDate);
        if (releaseDateComparison != 0) {
            return releaseDateComparison;
        }
        return Integer.compare(pages, other.pages);
    }
}
