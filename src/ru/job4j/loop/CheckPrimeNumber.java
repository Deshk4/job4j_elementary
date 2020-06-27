package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        for (int i = 2; i <= number; i++) {
       if ((number % i) == 0) {
           prime = false;
           break;
       }
       prime = true;
        }
        return prime;
    }

    public static void main(String[] args) {
        boolean what = check(5);
        System.out.println(what);
    }
}
