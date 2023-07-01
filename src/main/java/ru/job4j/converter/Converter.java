package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 210;
        float expected = 3;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("210 rubles are 3. Test result : " + passed);
        float in1 = 300;
        float expected1 = 5;
        float out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("300 rubles are 5. Test result : " + passed1);
    }

}
