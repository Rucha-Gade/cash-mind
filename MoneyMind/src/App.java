import Calculators.AbsoluteReturn;
import Calculators.CAGR;
import Calculators.CompoundInterest;
import Calculators.Inflation;
import Calculators.LoanEMI;
import Calculators.SIP;
import Calculators.SimpleInterest;
import Calculators.StockReturn;
import Calculators.TaxImpact;
import util.InputUtil;

public class App {

    public static void main(String[] args) {

        boolean continueApp = true;

        do {
            System.out.println("\n =============================== ");
            System.out.println("        Money Calculator         ");
            System.out.println("     Calculate and Grow Wealth   ");
            System.out.println(" =============================== ");

            System.out.println();
            System.out.println("1. Calculate Simple Interest");
            System.out.println("2. Calculate Compound Interest");
            System.out.println("3. Calculate SIP Returns");
            System.out.println("4. Calculate CAGR");
            System.out.println("5. Calculate Absolute Return");
            System.out.println("6. Calculate Loan EMI");
            System.out.println("7. Calculate Inflation Impact");
            System.out.println("8. Calculate Stock Return");
            System.out.println("9. Calculate Tax Impact on Returns");
            System.out.println("0. Exit");
            System.out.println("--------------------------------");

            int choice = InputUtil.getIntegerInput("Enter your choice: ");

            switch (choice) {
                case 1 -> SimpleInterest.calculate();
                case 2 -> CompoundInterest.calculate();
                case 3 -> SIP.calculate();
                case 4 -> CAGR.calculate();
                case 5 -> AbsoluteReturn.calculate();
                case 6 -> LoanEMI.calculate();
                case 7 -> Inflation.calculate();
                case 8 -> StockReturn.calculate();
                case 9 -> TaxImpact.calculate();
                case 0 -> {
                    System.out.println("Exiting the application...");
                    continueApp = false;
                }
                default -> System.out.println("Invalid choice. Please choose a valid option.");
            }

            if (continueApp) {
                boolean validInput = false;
                while (!validInput) {
                    char again = InputUtil.getCharacterInput(
                            "\nEnter y/Y if you want to continue on the application. Enter n/N if you want to exit the application: "
                    );
                    switch (Character.toLowerCase(again)) {
                        case 'n' -> {
                            System.out.println("Exiting the application...");
                            continueApp = false;
                            validInput = true;
                        }
                        case 'y' -> {
                            continueApp = true;
                            validInput = true;
                        }
                        default -> System.out.println("Invalid input. Please enter 'y' or 'n' only.");
                    }
                }
            }

        } while (continueApp);
    }
}
