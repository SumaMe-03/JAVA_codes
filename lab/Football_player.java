package exp7;
import exp7.*;

public class Football_player extends Player {
	
	String team;
	int goals;
	int matches;
	int trophies;
	
	public void get_data() {
		super.get_data();
		
		System.out.println("Team Name:  ");
		this.team = obj.next();
		
		System.out.println("Goals:  ");
		this.goals = obj.nextInt();
		
		System.out.println("Matches:  ");
		this.matches = obj.nextInt();
		
		System.out.println("Trophies:  ");
		this.trophies = obj.nextInt();
	}
	
	public void show_data() {
		super.show_data();
		
		System.out.println("Team : "+team);
		System.out.println("Goals : "+goals);
		System.out.println("Matches : "+matches);
		System.out.println("Trophies : "+trophies);
	}
}
