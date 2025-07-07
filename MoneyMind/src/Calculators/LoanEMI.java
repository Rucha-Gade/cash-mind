package Calculators;

import util.InputUtil;

public class LoanEMI {

    public static void calculate() {
        try {
            double loan, rate, i, tenure, EMI, n;
            System.out.println("Loan EMI Calculator!\n");
            loan = InputUtil.getDoubleInput("Enter the Loan Amount: ");
            rate = InputUtil.getDoubleInput("Enter the Interest Rate: ");
            tenure = InputUtil.getDoubleInput("Enter the Tenure in Years: ");

            i = rate / (12 * 100);
            n = tenure * 12;

            EMI = (loan * i * (Math.pow((1 + i), n))) / ((Math.pow((1 + i), n)) - 1);
            System.out.println("The EMI is: " + String.format("%.2f", EMI));

        } catch (Exception e) {
        }
    }
}
