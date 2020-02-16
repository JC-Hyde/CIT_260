import java.util.Scanner;

public class W4dot1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Asks user for input
        System.out.print("Enter a hexadecimal digit: ");
        String hex = input.nextLine();

        // Checks to ensure hexadecimal is one character length
        if (hex.length() != 1) {
            System.out.print("Please use a single hexadecimal character.");
            System.exit(1);
        }

        char digit = hex.charAt(0);
        /*
        Informs user character needs to be upper case if character
        entered is lowercase
        */
        if (digit>= 'a' && digit <= 'f'){
            System.out.println("Please use capital letters A - F or numbers 0 - 9 for hexadecimal characters.");
        }
        // Checks to see if entered character is letter A - F or number 0 - 9
        if ((digit >= 'A' && digit <= 'F') || (digit >= '0' && digit <= '9')){
            System.out.print("The Binary value is ");
            switch(digit){
                case '0': System.out.println("0000");
                    break;
                case '1': System.out.println("0001");
                    break;
                case '2': System.out.println("0010");
                    break;
                case '3': System.out.println("0011");
                    break;
                case '4': System.out.println("0100");
                    break;
                case '5': System.out.println("0101");
                    break;
                case '6': System.out.println("0110");
                    break;
                case '7': System.out.println("0111");
                    break;
                case '8': System.out.println("1000");
                    break;
                case '9': System.out.println("1001");
                    break;
                case 'A': System.out.println("1010");
                    break;
                case 'B': System.out.println("1011");
                    break;
                case 'C': System.out.println("1100");
                    break;
                case 'D': System.out.println("1101");
                    break;
                case 'E': System.out.println("1110");
                    break;
                case 'F': System.out.println("1111");
                    break;
            }
        }
        else
            System.out.println(digit + " is not a hexadecimal digit.");
    }
}
