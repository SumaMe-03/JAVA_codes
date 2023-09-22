//Write a JAVA program to create an integer array with elements (2,3,4,1,4,5). 
//Divide this array into two parts from the specific element of the considered array 
//where sum of the elements of both divided arrays is equal. 
//Print that specific element value from the consider array. 
//e.g. 1 in this case should be printed as sum of both int arrays(2,3,4) and (4,5) is 9
//import java.util.*;
public class contest2_1 {
	public static void main(String[] args) {
		int[] arr= {2,3,4,1,4,5};
		
		int sum1=0;
		int sum2=0;
		
		for(int i=0;i<arr.length;i++) {
			sum1=sum1+arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			
			sum1-=arr[i];
			
			if(sum1==sum2) {
				System.out.println(arr[i]);
				break;
			}
			sum2+=arr[i];
		}
	}
}
