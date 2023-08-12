
//Take an input starting point and ending point for the range (Example: 1 to 9 ). 
//Find out the even numbers from the given range and create a new number by combining each even digit. 
//And check that this new number whichever will be created is palindrome or not.

import java.util.Scanner;
public class contest_1 {
	public static int getReverse(int num) {
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

	public static void main(String[] args) {
		Scanner obj= new Scanner(System.in);
		
		int sp,ep;
		int count=0;
		System.out.println("Enter starting point: ");
		sp=obj.nextInt();
		
		System.out.println("Enter ending point: ");
		ep=obj.nextInt();
		
		int n=ep-sp+1;
		
		int[] arr = new int[n];
		
		for(int i=sp;i<=ep;i++) {
			if(i%2==0) {
				arr[count]=i;
				count++;
			}
		}
		
		System.out.print("new_number=");
		for(int i=0;i<count;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		
		int num = 0;
        for (int i = 0; i < count / 2; i++) {
            if (getReverse(arr[i]) != arr[count - i - 1]) {
                num++;
            }
        }

        if (num == 0) {
            System.out.println("New number is a palindrome");
        } 
        else{
            System.out.println("New number is not a palindrome");
        }
    }
}