package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + "передвигается по рельсам.");
    }

    @Override
    public void riskOfAccident() {
        System.out.println(getClass().getSimpleName()
                + "риск аварии выже, чем у самолёта, но ниже, чем у автобуса.");
    }
}