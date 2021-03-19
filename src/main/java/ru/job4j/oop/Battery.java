package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int indicator) {
        this.load = indicator;
    }

    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery battery1 = new Battery(77);
        Battery battery2 = new Battery(10);
        System.out.println("First battery: " + battery1.load
                +
                ". Second battery: " + battery2.load);
        battery1.exchange(battery2);
        System.out.println("After operation. First battery: " + battery1.load
                +
                ". Second battery: " + battery2.load);
    }
}