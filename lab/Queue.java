package exp8;
import java.util.*;
public class Queue extends Q implements q_interface {
	public void no_of_ele() {
		System.out.println(count); 
	}
	
	public boolean isFull() {
		if(count == size) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(count == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void enqueue() {
		Scanner obj = new Scanner(System.in); 
		if (isFull() == true) { 
		   System.out.println("Queue is full, can't add element"); 
		} 
		else { 
		   rear++; 
		   System.out.println("Enter the element to be added in queue"); 
		   arr[rear] = obj.nextInt(); 
		   count++; 
		} 
	}
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue empty. Can not delete elements");
		}
		else {
			int ele = arr[front];
			System.out.println(ele+" removed");
			front++;
			count--;
		}
	}
	
	public void display(){
		System.out.println("Displaying the queue: "); 
		for(int i = front; i <= rear; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	} 
}