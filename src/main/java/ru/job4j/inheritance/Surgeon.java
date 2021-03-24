package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private boolean examination;
    private boolean anesthetize;
    private int operate;

    public Surgeon(String fullName, String fullSurname, String universityOrCollege,
                   String dayMonthYear, String nameDiag, String medications, boolean consent) {
        super(fullName, fullSurname, universityOrCollege, dayMonthYear, nameDiag,
                medications, consent);
    }

    private boolean isExamination() {
    return isExamination();
    }

    private boolean isAnesthetize() {
    return  isAnesthetize();
    }

    private int getOperate() {
    return getOperate();
    }
}