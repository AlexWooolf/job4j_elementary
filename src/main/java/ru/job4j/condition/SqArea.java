package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        return (p / ((k + 1) * 2)) * (p / ((k + 1) * 2)) * k;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}