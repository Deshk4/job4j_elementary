package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2){

        double powBrk1 = Math.pow(x2 - x1,2);
        double powBrk2 = Math.pow(y2 - y1,2);
        double squareSum = Math.sqrt(powBrk1 + powBrk2);

        return squareSum;
    }

    public static void main(String[] args) {
        double result = distance(2,3,4,5);
        System.out.println("Result (2, 3) to (4, 5) " + result);
    }
}
