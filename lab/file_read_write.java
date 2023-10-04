package exp10;
import java.util.*;
import java.io.*;
public class file_read_write {

	public static void main(String[] args) {
		File f1 = new File("D:\\32364\\exp10.txt");
		Scanner obj;
		try {
			obj = new Scanner(f1);
			while(obj.hasNextLine()) {
				String data = obj.nextLine();
				System.out.println(data);
			}
		} 
		catch (FileNotFoundException e1) {
			System.out.println("File not found");
			e1.printStackTrace();
		}
	}
}