package exp10;
import java.io.*;
public class read_write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader f1 = new FileReader("D:\\32364\\exp10.txt");
			FileWriter f2 = new FileWriter("D:\\32364\\exp10_2.txt");
			
			int c;
			while((c = f1.read()) != -1) {
				System.out.println((char)c);
				f2.append((char)c);
			}
			System.out.println();
			f1.close();
			f2.close();
			System.out.println("File reading and writing successful");
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}