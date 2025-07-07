
package Calculators;

import util.InputUtil;

public class CompoundInterest {
    public static void calculate(){
        double principal, rate, rateInDecimal, time, timeInYears, n, compound_interest;
        //n = number of times interest is compounded in a year
        try {
            System.out.println("Compound Interest Calculator!\n");
            principal = InputUtil.getDoubleInput("Enter the Principal Amount: ");
            rate = InputUtil.getDoubleInput("Enter the Rate of Interest: ");
            time = InputUtil.getDoubleInput("Enter the Time (in months): ");
            n = InputUtil.getDoubleInput("Enter the number of times interest is compounded in a year: ");

            timeInYears = time / 12.0;
            rateInDecimal = rate / 100.0;

            compound_interest = principal * (Math.pow(1 + rateInDecimal/n, n * timeInYears)) - principal;
            System.out.println("The Compound Interest is: " + String.format("%.2f", compound_interest));
        } catch (Exception e) {
        }
    }

}
