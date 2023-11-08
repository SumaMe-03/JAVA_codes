//factorial, prime, sum and avg

package practice;
import java.util.*;

public class exp1{
	public static void prime(int n) {
		int currnum =2;
		int currprime =2;
		int status =1;
		if(n>1) {
			System.out.println("First "+n+" prime numbers are: ");
		}
		while(currprime<=n+1) {
			for(int i = 2; i*i<=currnum;i++) {
				if(currnum%i==0) {
					status =0;
					break;		
				}
			}
			if(status!=0) {
				System.out.print(currnum);
				System.out.println();
				currprime++;
			}
			status=1;
			currnum++;
		}
	}
	
	public static int fact(int n) {
		  if (n == 0) {
		    return 1;
		  } else {
		    return n * fact(n - 1);
		  }
	}

	
	public static void sum_avg() {
		int sum =0;
		float avg;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		avg = (float)sum/10;
		
		System.out.println("Sum: "+sum);
		System.out.println("Avg: "+avg);
	}
	
	public static void main(String[] args) {
		prime(50);
		System.out.println("Factorial: "+fact(5));
		sum_avg();
	}
}