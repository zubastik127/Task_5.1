package com.company;

public class Main {

    public static void main(String[] args) {

        Book[] book = new Book[5];
        book[0] = new Book("Над пропастью во ржи", 12, 256);
        book[1] = new Book("А.С. Пушкин", 17);
        book[2] = new Book("Архипелаг Гулаг", "А. И. Солженицын", 10, 1352);
        book[3] = new Book("Над кукушкиным гнездом", 15, 423);
        book[4] = new Book("Манюня", "Н.Ю. Абгарян", 354);

        Reader reader = new Reader();

        Book myBook = Reader.choiceBook(book);

        Reader.readBook(myBook);

        Reader.bookRating(myBook);

    }
}
