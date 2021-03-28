package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman freshM = new Freshman();
        Student stud = freshM;
        Object obj = stud;
    }
}