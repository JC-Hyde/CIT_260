public class W5dot1 {
    // Converts Imperial pounds to Metric kilograms
    public static void main(String[] args) {
	// 1 kilogram (kilo) equals 2.2 pounds (lbs)
        final double lbsToKilo = 2.2;
        System.out.println("Kilograms          Pounds");
        System.out.println("---------          ------");

        // Index starts at 1 and ends at 16
        // Prints a table showing kilos to pounds
        // Calculates odd integers from 1 to 15
        // Ends with the message "Goodbye!"

        for (int i = 1; i < 16; i++) {
            if (i % 2 != 0) {
                double result = i * lbsToKilo;

                System.out.println(i + "                  " + Math.round(result * 10) / 10.0);
            }
        }
        System.out.println("Goodbye!");
    }
}
