package com.company;

import java.util.Random;

public class Reader {

    public static Book choiceBook(Book[] book) {
        Random random = new Random();
        int a = random.nextInt(5);
        return book[a];
    }

    public static void readBook(Book book) {
        System.out.println(book);
    }

    public static void bookRating(Book book) {

        Random random = new Random();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        int count = 0;

        if (book.name == null) {
            count = count - random.nextInt();
        } else {
            a = book.name.replaceAll(" ", "").length();
        }

        if (book.author == null) {
            count = count - random.nextInt();
        } else {
            b = book.author.replaceAll(" ", "").length();
        }

        if (book.serialNumber == 0) {
            count = count - random.nextInt();
        } else {
            c = book.serialNumber;
        }

        if (book.numberOfPages == 0) {
            count = count - random.nextInt();
        } else {
            d = book.numberOfPages;
        }

        int rating = a + b - c + d + count;

        System.out.println(rating);

    }
}
