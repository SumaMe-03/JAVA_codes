//WAP to count the occurrence of characters in a string
//print new string with the character and no. of times it occurs
//Eg: input: aaaabbbbcdefggghhh
//output: a4b4c1d1e1f1g3h3

import java.util.*;

class Check{
	public void Occurrence(String str){
		
		int len = str.length();
		Integer count  = 0;
		StringBuilder Ans = new StringBuilder("");
		char c = str.charAt(0);
		for(int i=0; i<len-1;i++) {
			
			if(str.charAt(i)==c) {
				count++;
			}
			else {
				Ans.append(c).append(count);
				c = str.charAt(i);
				count = 1;
			}
		}
		Ans.append(c).append(count);
		System.out.println(Ans.toString());
		
	}
}

public class mastercard_q2{
	public static void main(String args[]) {
		Scanner obj = new Scanner(System.in);
		String str = obj.nextLine();
		
		Check c1 = new Check();
		c1.Occurrence(str);
	}
}