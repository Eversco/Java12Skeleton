import java.io.*;
import java.util.Scanner;


class CreateFile {
    public static void main(String[] args) {

        // Get filename and create the file
        BufferedWriter writer = null; // make variable
        FileWriter filewriter = null;
        Scanner scan = new Scanner(System.in);
        String fileName = ""; //empty name
        System.out.print("Enter Filename-->");

        try {
            fileName = scan.next(); // scan input
            filewriter = new FileWriter(fileName); //store input
            writer = new BufferedWriter(filewriter);// buffered writer makes it faster
        } catch (IOException iox) {
            System.out.println("Error in creating file");
            return;
        }

        // Write the file.
        try { // content
            writer.write("Behold her, single in the field,\n");
            writer.write("Yon solitary Highland Lass!\n");
            writer.write("Reaping and singing by herself;\n");
            writer.write("Stop here, or gently pass!\n");
            writer.write("Never gonna give you up. Never gonna let you down. Never gonna run around and desert you.");
            writer.close();
        } catch (IOException iox) {
            System.out.println("Problem writing " + fileName);
        }
    }
}