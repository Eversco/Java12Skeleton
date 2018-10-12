import java.io.*;
import java.util.Scanner;

class PowerTable {
    public static void main(String[] args) {
        // Get filename and create the file
        PrintWriter out = null; // identifier
        Scanner scan = new Scanner(System.in);
        String fileName = ""; // empty name

        System.out.print("Enter Filename-->");
        try {
            fileName = scan.next(); // insert name

            // create the PrintWriter and enable automatic flushing
            out = new PrintWriter(new BufferedWriter(new FileWriter(fileName)), true); // combining outcomes
        } catch (IOException iox) { // catch mistakes
            System.out.println("Error in creating file");
            return;
        }

        // Write out the table.
        int value = 1;
        System.out.println("Power\tValue");
        for (int pow = 0; pow <= 20; pow++) { // give limit in content
            out.print(pow); 
            out.print('\t');
            out.println(value);
            value = value * 2;
        }
        out.close();

    }
}