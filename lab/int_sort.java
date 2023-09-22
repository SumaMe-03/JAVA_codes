import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
class array{
	int size=5;
	Scanner obj = new Scanner(System.in);
	
	Integer[] arr= new Integer[size];
	
	array(){
		System.out.println("Enter 5 elements of array: ");
	}
	
	void get_data() {
		for(int i=0;i<size;i++) {
			System.out.println("Enter "+(i+1)+" th element of array: ");
			arr[i]=obj.nextInt();
		}
	}
	
	void display() {
		System.out.print("The array is: ");
		for(int value:arr) {
			System.out.print(value+" ");
		}
		System.out.println();
	}
	
	void sort() {
	    int temp;
	    for (int i = 0; i < size - 1; i++) {
	        for (int j = 0; j < size - i - 1; j++) {
	            if (arr[j] > arr[j + 1]) {
	                temp = arr[j];
	                arr[j] = arr[j + 1];
	                arr[j + 1] = temp;
	            }
	        }
	    }
	    System.out.println("Sorted array is: ");
	    display();
	}
	
	void reverse() {
		System.out.println("Reverse sorted Array: ");
		for(int i=size-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
public class exp5_a {
	public static void main(String[] args){
		array ar1= new array();
		
		ar1.get_data();
		ar1.display();
		
		ar1.sort();
		
		ar1.reverse();
		
		Arrays.sort(ar1.arr); 
	    System.out.println("Sorted array using Arrays.sort(): ");
	    for (int value : ar1.arr) {
	       System.out.print(value + " ");
	    }
	    System.out.println();
	}
}
