package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int resultX = x2 - x1;
        int resultY = y2 - y1;
        int powX = (int) Math.pow(resultX, 2);
        int powY = (int) Math.pow(resultY, 2);
        int powXY = powY + powX;
        double rsl = Math.sqrt(powXY);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
