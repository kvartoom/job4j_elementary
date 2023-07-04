package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double bc, double ac) {
        return (ab + bc > ac) && (ac + bc > ab) && (ab + ac > bc);
    }

    public static void main(String[] args) {
        boolean result = exist(5, 6, 12);
        System.out.println(result);
    }
}
