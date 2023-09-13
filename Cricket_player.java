package exp7;
import exp7.*;

public class Cricket_player extends Player{
	
	int runs;
	int matches;
	float run_rate;
	int wickets;
	float strike_rate;
	int ch;
	
	public void get_data() {
		super.get_data();
		
		System.out.println("____Select your position___");
		System.out.println("1. Batsman");
		System.out.println("2. Bowler");
		System.out.println("3. Keeper batsman");
		this.ch= obj.nextInt();
		
		switch(ch){
		case 1: System.out.println("Total Runs: ");
		        this.runs=obj.nextInt();
		        System.out.println("Total Matches: ");
		        this.matches=obj.nextInt();
		        System.out.println("Run rate: ");
		        this.run_rate=obj.nextFloat();
		        break;
		        
		case 2: System.out.println("Total Wickets: ");
        		this.wickets=obj.nextInt();
        		System.out.println("Total Matches: ");
		        this.matches=obj.nextInt();
		        System.out.println("Strike rate: ");
		        this.strike_rate=obj.nextFloat();
		        break;
		        
		case 3: System.out.println("Total Runs: ");
        		this.runs=obj.nextInt();
        		System.out.println("Total Matches: ");
		        this.matches=obj.nextInt();
		        System.out.println("Total Wickets: ");
		        this.wickets=obj.nextInt();
		        System.out.println("Run rate: ");
		        this.run_rate=obj.nextInt();
		        break;
		        
		 default: System.out.println("Enter a valid option");
		}
	}
	
	public void show_data() {
		super.show_data();
		
		switch(ch){
		case 1: System.out.println("Total Runs: "+runs);
		        System.out.println("Total Matches: "+matches);
		        System.out.println("Run rate: "+run_rate);
		        break;
		        
		case 2: System.out.println("Total Wickets: "+wickets);
        		System.out.println("Total Matches: "+matches);
		        System.out.println("Strike rate: "+strike_rate);
		        break;
		        
		case 3: System.out.println("Total Runs: "+runs);
        		System.out.println("Total Matches: "+matches);
		        System.out.println("Total Wickets: "+wickets);
		        System.out.println("Run rate: "+run_rate);
		        break;
		        
		default: System.out.println();
		}
	}
}