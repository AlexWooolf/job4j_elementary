package ru.job4j.array;

public class Salary {
    public static int calculate(int[] hours) {
        int salary = 0;
        for (int i = 0; i < 5; i++) {
            if (hours[i] > 8) {
                salary = salary + 8 * 10 + 15 * (hours[i] - 8);
            } else {
                salary = salary + hours[i] * 10;
            }
        }
        for (int i = 5; i < 7; i++) {
            if (hours[i] > 8) {
                salary = salary + 8 * 20 + 30 * (hours[i] - 8);
            } else {
                salary = salary + hours[i] * 20;
            }
        }
        return salary;
    }
}