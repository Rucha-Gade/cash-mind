
package Calculators;

import util.InputUtil;


public class AbsoluteReturn {
    public static void calculate(){
        try {
            double current, initial, absolute_return;
            System.out.println("Absolute Return Calculator!\n");
            current = InputUtil.getDoubleInput("Enter the current value of the investment: ");
            initial = InputUtil.getDoubleInput("Enter the initial value of the investment: ");

            absolute_return = ((current / initial) - 1) * 100;
            System.out.println("The absolute return is: " + String.format("%.2f", absolute_return) + "%");

        } catch (Exception e) {
        }
    }
}
