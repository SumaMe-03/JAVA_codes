package exp8;
import java.util.*;
public class Q {
	public int arr[];
	public int front, rear, size, count, capacity;
	
	Q(){
		System.out.println("Enter the size of Queue: ");
		Scanner obj = new Scanner(System.in);
		
		size = obj.nextInt();
		
		arr = new int[size];
		front = 0;
		rear = -1;
		count = 0;
		capacity = size;
	}
}