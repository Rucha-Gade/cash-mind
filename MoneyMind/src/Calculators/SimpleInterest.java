package Calculators;
import util.InputUtil;

public class SimpleInterest {

    public static void calculate() {
        try {
            double principal, rate, simple_interest, timeInYears, rateInDecimal;
            int time;
            System.out.println("Simple Interest Calculator!\n");
            principal = InputUtil.getDoubleInput("Enter Principal Amount: ");
            rate = InputUtil.getDoubleInput("Enter Rate of Interest: ");
            time = InputUtil.getIntegerInput("Enter Time Period (in months): ");

            timeInYears = time / 12.0;
            rateInDecimal = rate / 100.0;

            simple_interest = principal * rateInDecimal * timeInYears;
            System.out.println("Simple Interest: " + String.format("%.2f" , simple_interest));
        } catch (Exception e){}
    }
}
