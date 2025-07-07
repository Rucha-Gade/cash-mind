
package Calculators;

import util.InputUtil;

public class CAGR {
    public static void calculate(){
        try {
            double P, M, n, CAGR;
            System.out.println("CAGR Calculator!\n");
            P = InputUtil.getDoubleInput("Enter the Initial Value: ");
            M = InputUtil.getDoubleInput("Enter the Final Value: ");
            n = InputUtil.getDoubleInput("Enter the Number of Years: ");

            CAGR = ((Math.pow((M/P), (1/n))) - 1) * 100;

            System.out.println("CAGR is: " + String.format("%.2f", CAGR));

        } catch (Exception e) {
        }
    }

}
