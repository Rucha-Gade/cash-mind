package Calculators;

import util.InputUtil;

public class TaxImpact {

    public static void calculate() {
        try {
            double gain, time, tax, finalgain, holdingperiod;
            char choice;

            System.out.println("Tax Impact on Capital Gain Calculator!\n");
            gain = InputUtil.getDoubleInput("Enter the Gain Amount: ");

            choice = InputUtil.getCharacterInput("Enter 'M' if holding period is in months. Enter 'Y' if holding period is in years: ");
            // character input is already converted to lower case in Input Util class.
            switch (choice) {
                case 'm' -> {
                    time = InputUtil.getIntegerInput("Enter the number of months: ");
                    holdingperiod = time / 12.0;
                    if (holdingperiod <= 1) {
                        tax = gain * 0.15;
                        finalgain = gain - tax;
                        System.out.println("Short Term Capital Gain: " + String.format("%.2f", tax));
                        System.out.println("Final Gain After Tax: " + String.format("%.2f", finalgain));
                    } else {
                        System.out.println("The holding period is greater than 12 months. ");
                    }
                }

                case 'y' -> {
                    if (gain < 100000) {
                        System.out.println("Tax is 0");
                        System.out.println("Final Gain After Tax: " + gain);
                    } else {
                        tax = (gain - 100000) * 0.10;
                        finalgain = gain - tax;
                        System.out.println("Long Term Capital Gain: " + String.format("%.2f", tax));
                        System.out.println("Final Gain After Tax: " + String.format("%.2f", finalgain));
                    }
                }

                default -> {
                    System.out.println("Invalid choice. Please enter 'M' or 'Y'.");
                }
            }

        } catch (Exception e) {
        }
    }
}
