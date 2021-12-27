package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float eur = value / 70;
        return eur;
    }

    public static float rubleToDollar(float value) {
        float dlr = value / 60; /* формула перевода рублей в доллары. */
        return dlr;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollars = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollars + " dollars.");
    }
}

