import java.util.Scanner;

public class W6dot1 {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

        // Asks user for initial investment input
        System.out.println("\nPlease enter a positive money value for your investment.");
        System.out.print("Amount Invested: ");
        double invested = input.nextDouble();

        // Asks user for interest rate input
        System.out.println("\nPlease enter a positive interest rate value.");
        System.out.print("Annual Interest Rate: ");
        double annualInterest = input.nextDouble();

        // Monthly interest rate calculation
        double monthlyInterest = (annualInterest / 12) / 100;

        //Output to columns
        System.out.println("\nBased on your initial investment and interest value: ");
        System.out.println("\nYears     Future Value");

        //Calculation of future investment growth
        for(int i = 1; i <= 10; i++)  {
            System.out.printf( i + "\t\t   $%8.2f\n", futureInvestmentValue(invested, monthlyInterest, i));
            }
            System.out.println("\nGoodbye, and thanks for using!");
        }

        public static double futureInvestmentValue(double invested, double monthlyInterest, int years) {
        return invested * Math.pow(1 + monthlyInterest, years * 12);
    }
}
