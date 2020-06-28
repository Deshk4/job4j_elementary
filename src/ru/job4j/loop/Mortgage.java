package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double totalForYear = (amount / 100 * percent) + amount;
        while (totalForYear >= 0) {
            totalForYear = totalForYear - salary;
            year++;
            totalForYear = (totalForYear / 100 * percent) + totalForYear;
        }
        return year;
    }
}
