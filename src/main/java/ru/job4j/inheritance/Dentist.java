package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private boolean examination;
    private int teeth;
    private int filling;

    public Dentist(String fullName, String fullSurname, String universityOrCollege,
                   String dayMonthYear, String nameDiag, String medications, boolean consent) {
        super(fullName, fullSurname, universityOrCollege, dayMonthYear, nameDiag,
                medications, consent);
    }

    private boolean isExamination() {

    }

    private int getTeeth() {

    }

    private int getFilling() {

    }
}