package ru.job4j.oop;

public class AllTransports {
    public static void main(String[] args) {
        Vehicle air = new Airplane();
        Vehicle tr = new Train();
        Vehicle bs = new Bus();

        Vehicle[] vehicles = new Vehicle[] {air, tr, bs};
        for (Vehicle a : vehicles) {
            a.move();
            a.riskOfAccident();
            System.out.println("");
        }
    }
}
