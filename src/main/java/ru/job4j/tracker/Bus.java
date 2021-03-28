package ru.job4j.tracker;

public class Bus implements Transport {

    @Override
    public void ride() {

    }

    @Override
    public void passengers(int quantity) {

    }

    @Override
    public double refuel(double fuel) {
        return fuel * 4.45;
    }
}