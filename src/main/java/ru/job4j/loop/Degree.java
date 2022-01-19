package ru.job4j.loop;

public class Degree {
    public static void main(String[] args) {
        int rsl = 1;
        int a = 2;
        int n = 3;
        for (int i = 1; i <= n; i++) {
            rsl = rsl * a;
        }
        System.out.println(rsl);
    }
}