package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student alex = new Student();
        alex.setFullName("Алексей Алексеевич Иванов");
        alex.setGroup(4);
        alex.setAdmission(new Date());
        System.out.println("ФИО:" + alex.getFullName() + ". Группа: " + alex.getGroup()
                + ". Дата поступления: " + alex.getAdmission());
    }
}