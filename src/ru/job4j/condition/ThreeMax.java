package ru.job4j.condition;

public class ThreeMax {
    public static int max(int first, int second, int third) {
        int result = third;
        if (first >= second && first >= third) {
            result = first;
        }
        if (second > first && second > third) {
            result = second;
        }
        return result;
    }

    public static void main(String[] args) {
        int rsl = max(9, 10, 60);
        System.out.println(rsl);
    }
}