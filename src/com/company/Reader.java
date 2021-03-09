package com.company;

import java.util.Random;

public class Reader {

    public static Book choiceBook(Book[] book) {
        Random random = new Random();
        return book[random.nextInt(5)];
    }

    public static void readBook(Book book) {
        System.out.println(book);
    }

    public static void bookRating(Book book) {

        Random random = new Random();

        int a = 0;
        int count = 0;

        if (book.name == null) {
            count = count - random.nextInt();
        } else {
            a = book.name.replaceAll(" ", "").length();
        }

        if (book.author == null) {
            count = count - random.nextInt();
        } else {
            a = a + book.author.replaceAll(" ", "").length();
        }

        if (book.serialNumber == 0) {
            count = count - random.nextInt();
        } else {
            a = a - book.serialNumber;
        }

        if (book.numberOfPages == 0) {
            count = count - random.nextInt();
        } else {
            a = a + book.numberOfPages;
        }

        int rating = a + count;

        System.out.println(rating);

    }
}
