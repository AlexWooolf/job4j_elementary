package ru.job4j.loop;

public class Abbreviation {
    public static void main(String[] args) {
        String s = "Chief Executive Officer";
        String[] words = s.split(" ");
        String[] letter = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            StringBuilder word = new StringBuilder(words[i]);
            word.delete(1, word.length());
            String result = word.toString();
            letter[i] = result;
        }
        String abbreviation = "";
        for (String value : letter) {
            abbreviation = abbreviation + value;
        }
        System.out.println(abbreviation);
    }
}

