package ru.job4j.inheritance;

public class Builder extends Engineer {
    private int houses;
    private int projects;
    private int construction;

    public Builder(String fullName, String fullSurname, String universityOrCollege,
                   String dayMonthYear, int quantity, boolean carrieds, int numberOfRounds) {
        super(fullName, fullSurname, universityOrCollege, dayMonthYear, quantity,
                carrieds, numberOfRounds);
    }

    public int getHouses() {

    }

    public int getProjects() {

    }

    public int getConstruction() {

    }
}