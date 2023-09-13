package exp7;
import java.util.*;
import exp7.*;
public class Main {

	public static void main(String[] args) {
		int ch;
		Scanner obj = new Scanner(System.in);
		System.out.println("1. Cricket");
		System.out.println("2. Football");
		System.out.println("3. Hockey");
		
		System.out.println("____ENTER_SPORT____: ");
		ch = obj.nextInt();
		
		switch(ch) {
		case 1: Cricket_player ck = new Cricket_player();
				ck.get_data();
				System.out.println();
				ck.show_data();
				break;
				
		case 2: Football_player fb = new Football_player();
				fb.get_data();
				System.out.println();
				fb.show_data();
				break;
				
		case 3: Hockey_player hk = new Hockey_player();
				hk.get_data();
				System.out.println();
				hk.show_data();
				break;
				
		default: System.out.println("Enter a valid choice");
		}
	}
}