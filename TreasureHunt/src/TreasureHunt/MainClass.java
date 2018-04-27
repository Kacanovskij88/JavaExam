package TreasureHunt;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		MapDir map = new MapDir();
		Comp compass = new Comp();
		Player players = new Player ();
	
		map.start();
		Scanner input = new Scanner(System.in);
		
		int i=input.nextInt();
		int b = 1;
	
		if (i==1) {map.north();
		i = input.nextInt(); 
		switch(i) {
		case 1: players.lose();break;
			} 
		} 
		  else if (i==2) {
			map.east();
			i = input.nextInt();
			switch(i) {
			case 1: players.win();
			}
		} else if (i==3) {
			map.west();
			switch(i) {
			case 1: players.lose();break;
			} 	
		} else if (i==4) {
			map.south();
			switch(i) {
			case 1: players.lose(); break;
			
				} 
		}
		

		else if (i == 5) { compass.currentPosition();
			 } else if (b == 3) {
				 players.win();
			 } else if (i == 2) { players.lose();
			 }
		}		
	}
	
