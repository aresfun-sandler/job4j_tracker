package ru.job4j.stream;

public class Patient {
    private String name;
    private String surname;
    private byte age;
    private String diagnosis;
    private boolean hospitalization;

    static class Builder {
        private String name;
        private String surname;
        private byte age;
        private String diagnosis;
        private boolean hospitalization;

        Builder buildName(String name) {
            this.name = name;
            return this;
        }

        Builder buildSurname(String surname) {
            this.surname = surname;
            return this;
        }

        Builder buildAge(byte age) {
            this.age = age;
            return this;
        }

        Builder buildDiagnosis(String diagnosis) {
            this.diagnosis = diagnosis;
            return this;
        }

        Builder buildHospitalization(boolean hospitalization) {
            this.hospitalization = hospitalization;
            return this;
        }

        Patient build() {
            Patient patient = new Patient();
            patient.name = name;
            patient.surname = surname;
            patient.age = age;
            patient.diagnosis = diagnosis;
            patient.hospitalization = hospitalization;
            return patient;
        }
    }

    public static void main(String[] args) {
        Patient patient = new Builder().buildName("Антон")
                .buildSurname("Геннадевьич")
                .buildAge((byte) 44)
                .buildDiagnosis("Коронавирусная инфекция")
                .buildHospitalization(true)
                .build();
        System.out.println(patient);
    }
}