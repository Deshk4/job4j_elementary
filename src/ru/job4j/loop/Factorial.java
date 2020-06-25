package ru.job4j.loop;

public class Factorial {
    public static int cal(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n == 0) {
            sum = 1;
            } else if (n == 1) {
                sum = 1;
            }
            sum = sum * i;
        }

        return sum;
    }
}
