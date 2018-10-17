import java.io.*;
import java.util.Scanner;

class CreditWriter {
    public static void main(String[] args) {
        // Get filename and create the file
        BufferedReader writer = null;
        PrintWriter out = null;
        Scanner scan = new Scanner(System.in);
        String fileName = "";

        System.out.print("Enter Filename-->");
        try {
            fileName = scan.nextLine();
            // create the PrintWriter and enable automatic flushing
            out = new PrintWriter(new BufferedWriter(new FileWriter(fileName)), true);

        } catch (IOException iox) {
            System.out.println("Error in creating file");
            return;
        }
        out.println("Name\tAge\tCredit"); // file content
        while (true) {
            String name;
            int age, con;
            float credit;
            System.out.print("Enter name: ");
            name = scan.nextLine();
            System.out.print("Enter age: ");
            age = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter Credit: ");
            credit = scan.nextFloat();
            scan.nextLine();
            out.println(name + "\t" + age + "\t" + credit);
            System.out.print("Enter 0 if you wish to continue and 1 to end.");
            con = scan.nextInt();
            scan.nextLine();
            if (con == 1) { // stop program depending on user's choice
                break;
            }

        }
        out.close();
        // Write out the table.

    }
}