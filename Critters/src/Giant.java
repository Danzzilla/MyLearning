/**
 * @author Daniel
 *
 * constructor-
 * 	-
 * 
 * getColor-
 * 	-gray
 * 
 * toString-
 * 	-fee for 6 moves
 *  -fie for 6 moves
 *  -foe for 6 moves
 *  -fum for 6 moves
 *  -repeat
 *  
 * getMove-
 * 	-infect if enemy in front
 * 	-otherwise hop if possible
 * 	-otherwise turn right
 */
import java.awt.Color;

public class Giant extends Critter {
	
	int nameCount = 0;
	int moves = 0;
	
	public Giant() {
		
	}
	
	public Color getColor() {
		return Color.gray;
	}
	
	public String toString() {
		if(nameCount%4 == 0) {
			return "fee";
		}
		if(nameCount%4 == 1) {
			return "fie";
		}
		if(nameCount%4 == 2) {
			return "foe";
		}
		else {  //(nameCount%4 == 3)
			return "fum";
		}
	}
	
	public Action getMove(CritterInfo info) {
		moves++;
		if((moves%6 == 0) && (moves != 0)) {
			nameCount++;
		}
		
		if(info.getFront() == Neighbor.OTHER) {
			return Action.INFECT;
		}
		else if(info.getFront() == Neighbor.EMPTY){
			return Action.HOP;
		}
		else {
			return Action.RIGHT;
		}
	}
}
