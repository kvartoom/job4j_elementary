package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 210;
        float expected = 3;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("210 rubles are 3. Test result : " + passed);
        in = 300;
        expected = 5;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("300 rubles are 5. Test result : " + passed);
    }

}