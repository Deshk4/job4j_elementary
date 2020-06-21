package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {

        int inRU = 120;
        int expectedDollar = 2;
        int outDollar = rubleToDollar(inRU);
        boolean passedRU = expectedDollar == outDollar;
        System.out.println("120 rubles are 2 dollar. Test result: " + passedRU);

        int intEuro = 140;
        int expectedEuro = 2;
        int outEuro = rubleToEuro(intEuro);
        boolean passerEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are 2 euro. test result: " + passerEuro);

        int euro = rubleToEuro(5000);
        int dollar = rubleToDollar(5000);

        System.out.println("5000 рублей это " + euro + " евро");
        System.out.println("5000 рублей это " + dollar + " доллар(ов)");

    }
}
