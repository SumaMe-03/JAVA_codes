package exp10;
import java.io.*;
//import java.util.*;
public class file_create {

	public static void main(String[] args) {
		try {
			File f1 = new File("D:\\32364\\exp10.txt");
			
			if(f1.createNewFile()) {
				System.out.println("File creation successful");
			}
			else {
				System.out.println("File exists");
			}
		}
		catch(IOException e) {
			System.out.println("Error during file creation");
			e.printStackTrace();
		}
	}
}