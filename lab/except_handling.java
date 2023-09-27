import java.util.*;

class number {
	int a, b, size, result;
	int[] arr;
	Scanner obj = new Scanner(System.in);
	
	number(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	number(int a){
		this.size = a;
		arr = new int[size];
	}
	
	void action() {
		try {
			result = a/b;
			System.out.println("division of numbers: "+result);
			
			result = a+b;
			System.out.println("Addition of numbers: "+result);
			
			result = a-b;
			System.out.println("Subtraction of numbers: "+result);
		}
		
		catch(ArithmeticException e) {
			System.out.println("Exception Encountered");
			System.out.println(e);
			
			result = a+b;
			System.out.println("Addition of numbers: "+result);
			
			result = a-b;
			System.out.println("Subtraction of numbers: "+result);
		}
		
		finally{
			result = a*b;
			System.out.println("Multiplication: "+result);
		}
		
		System.out.println("All exceptions have been handled");
	}
	
	void arr() {
		try {
			System.out.println("Enter position of the array: ");
			int i = obj.nextInt();
			System.out.println("Enter value: ");
			arr[i] = obj.nextInt();
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		finally {
			for(int i = 0; i<size; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println(" ");
		}
	}
}

public class except_handling {
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		int ch;
		
		do {
			System.out.println("_____OPTIONS____");
			System.out.println("1. Arithematic Operation");
			System.out.println("2. Array Creation");
			System.out.println(" ");
			System.out.println("Enter choice: ");
			ch = obj.nextInt();
			switch(ch) {
			case 1: System.out.println("Enter first number: ");
					int a = obj.nextInt();
					System.out.println("Enter second number: ");
					int b = obj.nextInt();
					number num1 = new number(a, b);
					num1.action();
					break;
					
			case 2: System.out.println("Enter the size of array: ");
			 		int size = obj.nextInt();
			 		number n2 = new number(size);
			 		n2.arr();
			 		break;
			 		
			default: System.out.println("Enter valid option");
			 		 break;
			}
		}
		while(ch!=0);
	}
}