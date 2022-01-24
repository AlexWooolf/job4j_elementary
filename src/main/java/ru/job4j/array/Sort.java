package ru.job4j.array;

public class Sort {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 6, 4};
        for (int k : array1) {
            for (int j = 0; j < array1.length; j++) {
                if (k == array2[j]) {
                    System.out.println(k);
                }
            }
        }
    }
}

