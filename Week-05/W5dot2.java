public class W5dot2 {

    public static void main(String[] args) {

        System.out.println("This program displays all of the numbers from");
        System.out.println("100 to 1000 that are divisible by both 5 and 6.");
        System.out.println("-----------------------------------------------");
        // Counting loop
        int count = 100;
        // Begins index at 100 and ends at 1000
        for (int i = 100; i <= 1000; i++) {
            // Determines if integer is divisible by 5 or 6
            if (i % 5 == 0 && i % 6 == 0) {
                count++;
                // Limits output to 10 numbers per line
                if (count % 10 == 0) {
                    System.out.println(i);
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
