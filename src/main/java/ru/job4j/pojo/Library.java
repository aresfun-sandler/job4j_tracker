package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 200);
        Book book2 = new Book("Orpheus", 320);
        Book book3 = new Book("Brush, feather and poison", 124);
        Book book4 = new Book("Sun and steel", 167);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int i = 0; i < books.length; i++) {
            Book bks = books[i];
            System.out.println(bks.getName() + " - " + bks.getNumberOfPages());
        }
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (int i = 0; i < books.length; i++) {
            Book bks = books[i];
            System.out.println(bks.getName() + " - " + bks.getNumberOfPages());
        }
        for (int i = 0; i < books.length; i++) {
            Book bks = books[i];
            if (bks.getName().equals("Clean code")) {
                System.out.println(bks.getName() + " - " + bks.getNumberOfPages());
            }
        }
    }
}