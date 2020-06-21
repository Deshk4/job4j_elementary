package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public  static double womanWeight(short height) {
         return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manHeight = 178;
        short womanHeight = 145;
        double man = manWeight(manHeight);
        double woman = womanWeight(womanHeight);

        System.out.println("Для " + manHeight + "см у мужчин идеальный вес " + man + " килограмм");
        System.out.println("Для " + womanHeight + "см у женщин идеальный вес " + woman + " килограмм");

    }
}
