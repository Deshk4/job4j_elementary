package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        float[] prices = new float[40];
        String[] names = new String[4];

        names[0] = "Nikoay";
        names[1] = "Petr";
        names[2] = "Yura";
        names[1] = "Evgeniy";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);


    }
}
