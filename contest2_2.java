//Write a JAVA code to manipulate the given string as per the following condition 
//A) Single digit number replaced by previous character repeated by that number of times.
import java.util.Scanner;
public class contest2_2 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		String str = obj.next();
		String str1="";
		
		for(int i=0; i<str.length(); i++) {
			char c=str.charAt(i);
			if(Character.isDigit(c)){
				char s=str.charAt(i-1);
				int num=Character.getNumericValue(c);
				for(int j=0;j<num;j++) {
					str1+=s;
				}
			}
			else {
				str1+=c;
			}
		}
		System.out.println(str1);
	}
}