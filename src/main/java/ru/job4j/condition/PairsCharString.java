package ru.job4j.condition;

public class PairsCharString {
    public static boolean check(String l, String r) {
        int length1 = l.length();
        int length2 = r.length();
        boolean result = (l.equals(r) && l.equals("")) || (l.charAt(0) == r.charAt(length2 - 1) && l.charAt(length1 - 1) == r.charAt(0));
        return result;
    }
}

