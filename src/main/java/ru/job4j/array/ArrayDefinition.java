package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Sergei";
        names[1] = "Oleg";
        names[2] = "Alex";
        names[3] = "Vlad";
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}