package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {

        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return area;
    }

    public static void main(String[] args) {
        double result = area(13, 14, 15);
        System.out.println("Площадь треугольника = " + result);
    }
}
