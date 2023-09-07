package org.math;

import static org.math.MathConstants.negate;

public class Main {
    public static void main(String[] args) {
        double someNumber = 42.0;
        double negatedNumber = negate(someNumber);

        System.out.println("PI: " + MathConstants.PI);
        System.out.println("E: " + MathConstants.E);
        System.out.println("Отрицательное число: " + negatedNumber);
    }
}