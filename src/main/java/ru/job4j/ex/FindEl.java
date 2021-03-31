package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            String el = value[i];
            if (el.equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("The item was not found");
        }
        return rsl;
    }

    public static void main(String[] args) {
       try {
           indexOf(new String[] {"Klara", "Ukrala", "Klarnet"}, "Klarnet");
       } catch (ElementNotFoundException e) {
           e.printStackTrace();
       }
    }
}