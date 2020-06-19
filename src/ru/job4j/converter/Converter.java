package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value){
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value){
        int rsl = value / 60;
        return rsl;
    }
    public static void main(String[] args) {
        int euro = rubleToEuro(5000);
        int dollar = rubleToDollar(5000);

        System.out.println("5000 рублей это " + euro + " евро");
        System.out.println("5000 рублей это " + dollar + " доллар(ов)");

    }
}
