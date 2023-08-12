//Take an input number N from the user and display the numbers which are 
//fully divisible by 3 and 6 from the given range 1 to N and find out the summation of that numbers. 
//After that divide the summation result by 5 & display the reminder value.

import java.util.Scanner;
public class contest_2 {

	public static void main(String[] args) {
		int N;
		int sum=0;
		int count=0;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("N= ");
		N=obj.nextInt();
		int[] arr=new int[N];
		
		for(int i=1;i<=N;i++) {
			if(i%6==0){
				arr[count]=i;
				count++;
			}
		}
		
		System.out.println("Numbers fully divisible by 3 and 6 are: ");
		for(int i=0;i<count;i++) {
			System.out.println(arr[i]+' ');
			sum+=arr[i];
		}
		
		System.out.println(" Summation_Result= "+sum);
		
		System.out.println(" Remainder = "+sum%5);
	}
}