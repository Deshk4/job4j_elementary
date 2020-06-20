package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c){

        double p = (a + b + c) / 2;
        double S = Math.sqrt(p * (p-a) * (p-b) *(p-c));

        return S;
    }

    public static void main(String[] args) {
        double result = area(13,14,15);
        System.out.println(result);
    }
}
