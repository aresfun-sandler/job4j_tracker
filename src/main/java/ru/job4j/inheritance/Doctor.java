package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String diagnosis;
    private String treatment;
    private boolean hospitalize;

    public Doctor(String fullName, String fullSurname, String universityOrCollege,
                  String dayMonthYear, String nameDiag, String medications, boolean consent) {
        super(fullName, fullSurname, universityOrCollege, dayMonthYear);
        this.diagnosis = nameDiag;
        this.treatment = medications;
        this.hospitalize = consent;
    }

    public String getDiagnosis() {

    }

    public String getTreatment() {

    }

    public boolean isHospitalize() {

    }
}