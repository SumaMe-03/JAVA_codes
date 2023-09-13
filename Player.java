package exp7;
import java.util.*;

public class Player {

	String name;
	String gender;
	int age;
	String city;
	String nation;
	String level;
	
	Scanner obj = new Scanner(System.in);
	public void get_data() {
		System.out.println("Name: ");
		this.name = obj.next(); 
		System.out.println("Gender: ");
		this.gender = obj.next();
		System.out.println("Age: ");
		this.age = obj.nextInt();
		System.out.println("City: ");
		this.city = obj.next();
		System.out.println("Country: ");
		this.nation = obj.next();
		System.out.println("Level (Int/Nat/Domes/Reg/Dst): ");
		this.level = obj.next();
	}
	
	public void show_data() {
		System.out.println("_______PLAYER DATA_______");
		
		System.out.println("Name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("Age : "+age);
		System.out.println("City : "+city);
		System.out.println("Country : "+nation);
		System.out.println("Level : "+level);
	}
}