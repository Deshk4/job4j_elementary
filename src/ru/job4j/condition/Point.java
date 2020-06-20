package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2){
        int brk1 = x2 - x1;
        int brk2 = y2 - y1;
        double powBrk1 = Math.pow(brk1,2);
        double powBrk2 = Math.pow(brk2,2);
        double sumPowBrk = powBrk1 + powBrk2;
        double squareSum = Math.sqrt(sumPowBrk);
        return squareSum;
    }

    public static void main(String[] args) {
        double result = distance(2,3,4,5);
        System.out.println("Result (2, 3) to (4, 5) " + result);
    }
}
