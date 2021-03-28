package ru.job4j.oop;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + "летает по воздуху.");
    }

    @Override
    public void riskOfAccident() {
        System.out.println(getClass().getSimpleName()
                + "риск аварии ниже, чем у поезда и автобуса.");
    }
}
