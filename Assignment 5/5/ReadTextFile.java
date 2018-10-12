import java.io.*;


class ReadTextFile {
    public static void main(String[] args) {
        String fileName = "Dad"; // file's name
        String line;

        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            line = in.readLine(); // make the variable = the content
            while (line != null) // continue until end of file
            {
                System.out.println(line); // print out
                line = in.readLine();
            }
            in.close();
        } catch (IOException iox) { // catch error
            System.out.println("Problem reading " + fileName);
        }
    }
}