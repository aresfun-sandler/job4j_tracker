package ru.job4j.inheritance;

public class Engineer extends Profession {
    private int blueprints;
    private boolean repairs;
    private int inspection;

    public Engineer(String fullName, String fullSurname, String universityOrCollege,
                    String dayMonthYear, int quantity, boolean carrieds, int numberOfRounds) {
        super(fullName, fullSurname, universityOrCollege, dayMonthYear);
        this.blueprints = quantity;
        this.repairs = carrieds;
        this.inspection = numberOfRounds;
    }

    public int getBlueprints() {

    }

    public boolean isRepairs() {

    }

    public int getInspection() {

    }
}
