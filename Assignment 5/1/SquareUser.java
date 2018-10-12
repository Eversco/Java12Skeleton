import java.util.*;

public class SquareUser {

    public static void main(String[] a) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        boolean goodData = false; // start with thedata as a false

        while (!goodData) {
            System.out.print("Enter an integer: ");
            try { // try means processing something
                num = scan.nextInt();
                goodData = true;
            }

            catch (InputMismatchException ex) { // catch occurs after try and process a function. Input Mismatch Exception takes out the bad data
                System.out.println("You entered bad data.");
                System.out.println("Please try again.\n"); // goodData remains false if whats entered is not accpeted
                String flush = scan.next();
            }
        }

        System.out.println("The square of " + num + " is " + num * num); //squares the whats is put in and print out.

    }
}