import java.util.Scanner;

public class W3dot2 {

    public static void main(String[] args) {
	// Code tells you the number of days in a month in a given year. Calculates for Leap Year
        Scanner input = new Scanner(System.in);

        System.out.print("Ender the month: ");
        int month = input.nextInt();
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        // Leap Year calculation
        boolean isLeapYear = (year %4 == 0 && year % 100 != 0) || (year% 400 == 0);

        switch (month) {

            case 1:
                System.out.println("January " + year + " has 31 days.");
                break;
            case 2:
                System.out.println("February " + year + " has " + ((isLeapYear) ? "29 days" : "28 days"));
                break;
            case 3:
                System.out.println("March " + year + " has 31 days.");
                break;
            case 4:
                System.out.println("April " + year + " has 30 days.");
                break;
            case 5:
                System.out.println("May " + year + " has 31 days.");
                break;
            case 6:
                System.out.println("June " + year + " has 30 days.");
                break;
            case 7:
                System.out.println("July " + year + " has 31 days.");
                break;
            case 8:
                System.out.println("August " + year + " has 31 days.");
                break;
            case 9:
                System.out.println("September " + year + " has 30 days.");
                break;
            case 10:
                System.out.println("October " + year + " has 31 days.");
                break;
            case 11:
                System.out.println("November " + year + " has 31 days.");
                break;
            case 12:
                System.out.println("December " + year + " has 31 days.");
                break;
        }

    }
}
