package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac ? true : false;
    }

    public static void main(String[] args) {
        boolean trgl = exist(3, 3, 5);
        System.out.println("Треугольник существует: " + trgl);
    }
}
