import java.util.Scanner;

public class W4dot2 {

    public static void main(String[] args) {
	/*
	Code asks for user's name, hours worked in a pay period, hourly wage, state and federal tax
	withholding percentage then calculates net pay after subtracting
	withholding. Concludes by saying "Goodbye".
	 */

    Scanner input = new Scanner(System.in);
    System.out.print("Enter your first and last name: ");
    String name = input.nextLine();
    System.out.print("Enter the number of hours you work in a pay period: ");
    double hours = input.nextDouble();
    System.out.print("Enter your hourly wage: ");
    double wage = input.nextDouble();
    System.out.print("Enter the Federal tax withholding rate (Percentage): ");
    double fedTax = input.nextDouble();
    System.out.print("Enter the State tax withholding rate (Percentage): ");
    double stateTax = input.nextDouble();

    System.out.println("   ");
    // Calculation section
    double grossPay = (hours * wage);
    double fedWithheld = (grossPay * fedTax);
    double stateWithheld = (grossPay * stateTax);
    double totalTax = (fedWithheld + stateWithheld);
    double netPay = (grossPay - totalTax);

    System.out.println("   ");
    // Displays employee's payroll
    System.out.println("Employee's Name: " + name);
    System.out.println("Hours Worked   : " + String.format("%3.2f",hours));
    System.out.println("Hourly Rate    : $" + String.format("%3.2f",wage));
    System.out.println("Gross Pay      : $" + String.format("%3.2f",grossPay));
    System.out.println("Deductions     : ");
    System.out.println("    Federal Withholding: $" + String.format("%3.2f",fedWithheld));
    System.out.println("    State Withholding:   $" + String.format("%3.2f",stateWithheld));
    System.out.println("    Total Deductions:    $" + String.format("%3.2f",totalTax));
    System.out.println("   ");
    System.out.println("Net Pay        : $" + String.format("%3.2f",netPay));
    System.out.println("   ");
    System.out.println("Thank You for using this program! Goodbye!");
    }
}
