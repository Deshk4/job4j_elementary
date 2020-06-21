package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = rubleToEuro(5000);
        int dollar = rubleToDollar(5000);

        System.out.println("5000 рублей это " + euro + " евро");
        System.out.println("5000 рублей это " + dollar + " доллар(ов)");

    }
}
