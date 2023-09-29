//For given input string produce the output string with 
//replacing character 'a' with '@' as per their number of occurrence. 
//e.g. i/p= Java application o/p= J@v@@@@@pplic@@@@tion
//J@v@@@@@pplic@@@@tion
import java.util.*;
public class contest3_2 {
	public static void main(String[] args) {
		 Scanner obj = new Scanner(System.in);
	        String str = new String();
	        str = obj.nextLine();
	        StringBuilder new_str = new StringBuilder();
	        
	        int count =0;
	        
	        str = str.replaceAll(" ","");
	        
	        for(int i=0;i<str.length();i++) {
	            if(str.charAt(i)=='a'){
	                count++;
	                for(int j=0;j<count;j++){
	                    new_str.append('@');
	                }
	            }
	            else {
	                new_str.append(str.charAt(i));
	            }
	        }
	        System.out.println(new_str.toString());
	}
}