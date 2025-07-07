package Calculators;

import util.InputUtil;

public class Inflation {

    public static void calculate() {
        try {
            double current, rate, time, n, i, inflation;
            System.out.println("Inflation Calculator!|\n");
            current = InputUtil.getDoubleInput("Enter the current value: ");
            rate = InputUtil.getDoubleInput("Enter the inflation rate: ");
            time = InputUtil.getDoubleInput("Enter the time in years: ");

            i = rate / (12 * 100);
            n = time * 12;

            inflation = current * (Math.pow((1 + i), n));
            System.out.println("The value after inflation is: " + String.format("%.2f", inflation));

        } catch (Exception e) {
        }
    }

}
