package practice;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class exp10 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        try {
            // Create a new file named "file1.txt"
            File f1 = new File("file1.txt");
            if (f1.createNewFile()) {
                System.out.println("File created successfully: " + f1.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Open file "file2.txt" in write mode
            FileWriter f2 = new FileWriter("file2.txt");

            // Prompt the user to enter the file contents
            System.out.println("Enter the file contents:");
            String str = obj.nextLine();

            // Write the user-entered content to the file
            f2.write(str);

            // Close the file
            f2.close();

            // Inform the user that the content is written successfully
            System.out.println("Successfully written");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Read the contents of file "file2.txt"
            FileReader f3 = new FileReader("file2.txt");

            // Create a StringBuilder to store the file contents
            StringBuilder sb = new StringBuilder();

            // Read characters from the file until the end
            int ch;
            while ((ch = f3.read()) != -1) {
                sb.append((char) ch);
            }

            // Close the file
            f3.close();

            // Convert the StringBuilder to a String
            String fileContents = sb.toString();

            // Open file "file5.txt" in append mode
            FileWriter f4 = new FileWriter("file5.txt", true);

            // Write the contents of file "file2.txt" to file "file5.txt"
            f4.write(fileContents);

            // Close the file
            f4.close();

            // Inform the user that the file reading and writing are successful
            System.out.println("File reading and writing successful");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO error: " + e.getMessage());
        }
    }
}
