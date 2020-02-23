public class W8dot2 {

    public static void main(String[] args) {
	// write your code here
        java.util.Date date = new java.util.Date();

        for (long i = 10; i <= 100000000000L; i *=10) {
            date.setTime(i);
            System.out.println(date.toString());
        }
     }
}
