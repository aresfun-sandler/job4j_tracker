package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private boolean offer;
    private int programs;
    private int experience;

    public Programmer(String fullName, String fullSurname, String universityOrCollege,
                      String dayMonthYear, int quantity, boolean carrieds, int numberOfRounds) {
        super(fullName, fullSurname, universityOrCollege, dayMonthYear, quantity,
                carrieds, numberOfRounds);
    }

    public boolean isOffer() {

    }

    public int getPrograms() {

    }

    public int getExperience() {

    }
}