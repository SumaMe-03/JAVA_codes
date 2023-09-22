import java.util.*;
import java.util.Arrays;
import java.util.Collections;
class string_sort{
	Scanner obj = new Scanner(System.in);
	
	int size=5;
	String[] names = new String[size];
	
	string_sort(){
		System.out.println("Enter 5 string values: ");
	}
	
	void get_data() {
		for(int i=0;i<names.length;i++) {
			names[i]=obj.nextLine();
		}
	}
	
	void display() {
		for(String value:names) {
			System.out.print(value+" ");
		}
		System.out.println();
	}
	
	void sort() {
		String temp;
	    for (int i = 0; i < size - 1; i++) {
	        for (int j = 0; j < size - i - 1; j++) {
	            if (names[j].compareTo(names[j+1])>0) {
	                temp = names[j];
	                names[j] = names[j + 1];
	                names[j + 1] = temp;
	            }
	        }
	    }
	    System.out.println("Sorted array is: ");
	    display();
	}
	
	void reverse() {
		System.out.println("Reverse sorted Array: ");
		for(int i=size-1;i>=0;i--) {
			System.out.print(names[i]+" ");
		}
		System.out.println();
	}
}

public class exp_5_b {
	public static void main(String[] args){
		
		string_sort names = new string_sort();
		
		names.get_data();
		
		names.display();
		
		names.sort();
		
		names.reverse();
		
		System.out.println("Using In-built sort function: ");
		
		Arrays.sort(names.names); 
        System.out.println("Sorted names:"); 
        for (String name : names.names) {
            System.out.println(name);
        }
	}
}
