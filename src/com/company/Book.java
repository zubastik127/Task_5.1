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

    public static void main(String[] args) {

        Book[] book = new Book[5];
        book[0] = new Book("Над пропастью во ржи", 12, 256);
        book[1] = new Book("А.С. Пушкин", 17);
        book[2] = new Book("Архипелаг Гулаг", "А. И. Солженицын", 10, 1352);
        book[3] = new Book("Над кукушкиным гнездом", 15, 423);
        book[4] = new Book("Манюня", "Н.Ю. Абгарян", 354);

        Book myBook = Reader.choiceBook(book);

        Reader.readBook(myBook);

        Reader.bookRating(myBook);
    }
}
