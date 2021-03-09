package com.company;

public class Book {

    String name;
    String author;
    int serialNumber;
    int numberOfPages;

    Book(String a, int c, int d) {
        name = a;
        serialNumber = c;
        numberOfPages = d;
    }

    Book(String a, String b, int d) {
        name = a;
        author = b;
        numberOfPages = d;
    }

    Book(String b, int c) {
        author = b;
        serialNumber = c;
    }

    Book(String a, String b, int c, int d) {
        name = a;
        author = b;
        serialNumber = c;
        numberOfPages = d;
    }

    @Override
    public String toString() {
        return name + " " + author + " " + serialNumber + " " + numberOfPages;
    }
}
