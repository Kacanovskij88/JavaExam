package TreasureHunt;

public class Comp {

	
	
	static int[] east = {0};
	
	static int[] south = {0};
	
	static int[] north = {0};
	
	static int[] west = {0};
	
	public void position() {
	
		
		if((north [0] == 1) && (east [0] == 1)) {
		System.out.println("You are on the place");
		}
	}
	
			public void currentPosition() {
			System.out.println(north[0] + "\n"+ east[0]);
			}
		}
