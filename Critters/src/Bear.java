/**
 * @author DanielSvirida
 * 
 * constructor-
 * 	-creates a bear object
 * 		-stores if polar bear or not in a field
 * 
 * getColor-
 * 	-should randomly choose between white (polar bear) and black
 * 
 * toString-
 * 	-should alternate between slash and backslash on each move
 * 
 * getMove-
 * 	-always infect if an enemy is in front
 * 	-hop if possible
 * 		-if not, turn left
 */

import java.awt.Color;

public class Bear extends Critter {
	
	int moves = 0;
	boolean polarBear;
	
	public Bear(boolean polar) {
		polarBear = polar;
	}
	
	public Color getColor(){
		if(polarBear == true) {
			return Color.white;
		}
		else {
			return Color.black;
		}
	}
	
	public String toString() {
		if (moves%2 == 0) {
			return "/";
		}
		else {
			return"\\";
		}
	}
	
	public Action getMove(CritterInfo info) {
		moves++;
		
		if(info.getFront() == Neighbor.OTHER) {
			return Action.INFECT;
		}
		else if(info.getFront() == Neighbor.EMPTY){
			return Action.HOP;
		}
		else {
			return Action.LEFT;
		}
	}
}
