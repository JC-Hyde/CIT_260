import java.util.Scanner;

public class W2dot2 {

    public static void main(String[] args) {

	// This app calculates for tipping

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        double subtotalTax = subtotal * .032;
        double gratuity = gratuityRate * .01 ;
        double tip = subtotal * gratuity;
        double total = subtotal + subtotalTax + tip;

        System.out.println("Subtotal: $" + String.format("%.2f",subtotal));
        System.out.println("Tax 3.2%: $" + String.format("%.2f",subtotalTax));
        System.out.println("Gratuity: $" + String.format("%.2f",tip));
        System.out.println("Total: $" + String.format("%.2f",total));
    }
}
