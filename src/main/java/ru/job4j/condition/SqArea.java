package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double rsl = h * l;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(15, 33);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
