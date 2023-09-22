//Program to print the last character of the each word of the given sentence. 
//e.g. Input=Fundamentals of JAVA Programming 
//Output=sfag
import java.util.*;
public class contest2_3 {
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		String str=obj.nextLine();
		String[] arr=str.split(" ");
		
		//int count=arr.length;
		String str1=new String("");
		
		for(String value:arr) {
			char c=value.charAt(value.length()-1);
			str1+=c;
		}
		System.out.println(str1.toLowerCase());
	}
}
