package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int coupleOne = first > second ? first : second;
        return coupleOne > third ? coupleOne : third;

    }

    public static void main(String[] args) {
        int result = max(10, 22, 8);
        System.out.println(result);
    }
}
