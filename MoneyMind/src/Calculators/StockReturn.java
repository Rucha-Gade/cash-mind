
package Calculators;

import util.InputUtil;

public class StockReturn {
    public static void calculate(){
        try  {
            double buy, sell, number, profit;
            int choice;
            System.out.println("Stock Return Calculator!\n");
            do {
                System.out.println();
                System.out.println("1. Calculate Profit/ Loss Amount: ");
                System.out.println("2. Calculate Absolute Return: ");
                System.out.println("3. Calculate CAGR: ");
                System.out.println("0. Exit.");
                System.out.print("Enter your choice: ");
                choice = InputUtil.getIntegerInput("Enter your choice: ");

                switch(choice) {
                    case 1 -> {
                        buy = InputUtil.getDoubleInput("Enter the Buying Price: ");
                        sell = InputUtil.getDoubleInput("Enter the Selling Price: ");
                        number = InputUtil.getDoubleInput("Enter the Number of Shares: ");

                        profit = (sell - buy) * number;
                        System.out.println("Profit/Loss Amount: " + String.format("%.2f", profit));
                    }

                    case 2 -> {
                        AbsoluteReturn.calculate();
                    }

                    case 3 -> {
                        CAGR.calculate();
                    }

                    case 0 -> {
                        System.out.println("Exiting...");
                        return;
                    }

                    default -> {
                        System.out.println("Invalid choice. Please choose a valid option.");
                    }
                }

            } while (choice != 0);
        } catch (Exception e) {
        }
    }

}
