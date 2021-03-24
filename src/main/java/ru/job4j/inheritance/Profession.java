package ru.job4j.inheritance;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    public Profession(String fullName, String fullSurname, String universityOrCollege,
                      String dayMonthYear) {
        this.name = fullName;
        this.surname = fullSurname;
        this.education = universityOrCollege;
        this.birthday = dayMonthYear;
    }

    public String getName() {

    }

    public String getSurname() {

    }

    public String getEducation() {

    }

    public String getBirthday() {

    }
}