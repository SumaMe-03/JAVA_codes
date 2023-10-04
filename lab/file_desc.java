package exp10;
import java.io.*;

public class file_desc {
	public static void main(String[] args) {
		try {
			File f1 = new File("D:\\\\32364\\\\exp10.txt");
			System.out.println("File name: " + f1.getName());
			System.out.println("File Path: " + f1.getPath());
			System.out.println("Absolue Path: " + f1.getAbsolutePath());
			System.out.println("Parent: " + f1.getParent());
			
			System.out.println(f1.exists()?"File exists":"File not found");
			System.out.println(f1.canRead()?"Readable":"Not Readable");
			System.out.println(f1.canWrite()?"Write":"Not write");
			System.out.println(f1.isDirectory()?"Directory":"Not Directory");
			System.out.println("File length: "+f1.length());
		}
		
		catch(FileNotFoundException e){
			System.out.println("File not found");
			e.printStackTrace();
		}
	}

}
