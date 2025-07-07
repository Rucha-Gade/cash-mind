package Calculators;

import util.InputUtil;

public class SIP {

    public static void calculate() {
        try {
            double M, P, n, i, rate;
            // P = monthly investment amount
            // M = amount received upon maturity
            // n = number of months of investment/ number of payments done
            // i = monthly interest rate/ periodic of interest

            System.out.println("SIP Calculator!\n");

            boolean continueSIP = true;
            while (continueSIP) {
                System.out.println("1. To calculate the value upon maturity.");
                System.out.println("2. To calculate the monthly investments to reach your maturity amount.");
                System.out.println("3. To calculate the time required to reach the level of maturity.");
                System.out.println("0. Exit. ");
                int choice = InputUtil.getIntegerInput("Enter your choice: ");

                switch (choice) {
                    case 1 -> {
                        P = InputUtil.getDoubleInput("Enter the monthly SIP investment amount: ");
                        n = InputUtil.getIntegerInput("Enter the Time (in months): ");
                        rate = InputUtil.getDoubleInput("Enter the Annual Interest rate: ");

                        i = rate / (12 * 100);

                        M = P * ((Math.pow(1 + i, n) - 1) / i) * (1 + i);
                        System.out.println("The amount received upon maturity is: " + String.format("%.2f", M));
                    }

                    case 2 -> {
                        M = InputUtil.getDoubleInput("Enter the Target Maturity Value: ");
                        n = InputUtil.getIntegerInput("Enter the Time (in months): ");
                        rate = InputUtil.getDoubleInput("Enter the Annual Interest rate: ");

                        i = rate / (12 * 100);

                        P = M / (((Math.pow(1 + i, n) - 1) / i) * (1 + i));
                        System.out.println("The monthly SIP investment amount is: " + String.format("%.2f", P));
                    }

                    case 3 -> {
                        P = InputUtil.getDoubleInput("Enter the monthly SIP investment amount: ");
                        M = InputUtil.getDoubleInput("Enter the Target Maturity Value: ");
                        rate = InputUtil.getDoubleInput("Enter the Annual Interest rate: ");

                        i = rate / (12 * 100);

                        n = Math.log((M * i) / (P * (1 + i)) + 1) / Math.log(1 + i);
                        System.out.println("The time required to reach the level of maturity is: " + Math.round(n) +" months or " + Math.round((n/12)) + " years.");
                    }

                    case 0 -> {
                        System.out.println("Exiting. . . ");
                        return;
                    }

                    default ->{
                        System.out.println("Invalid choice. Please try again.");
                    }
                }
            }
        } catch (Exception e) {
        }
    }

}
