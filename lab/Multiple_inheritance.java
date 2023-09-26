package exp8;
import java.util.*;
public class Multiple_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue(); 
		   
		  int choice; 
		  Scanner obj = new Scanner(System.in); 
		   
		  do{
			  System.out.println(" ");
			  System.out.println("Enter your choice: ");
			  System.out.println("1. Enqueue");
			  System.out.println("2. Dequeue");
			  choice = obj.nextInt();
			  
			  switch(choice){
			  	case 1: q.enqueue(); 
			  		    q.display(); 
			  		    break; 
		     
			  	case 2: q.dequeue(); 
			  			q.display();
			  			break; 
		    
			  	default: System.out.println("Invalid choice"); 
			  			break; 
			  	} 
		  } 
		  while(choice != 0);
	}
}