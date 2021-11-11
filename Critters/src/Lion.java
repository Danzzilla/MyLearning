/**
 * @author DanielSvirida
 *
 * constructor-
 * 	-
 * 
 * getColor-
 * 	-randomly picks one of three colors (red, green and blue)
 * 	-uses that color for three moves, then randomly picks 
 * 		another of those three colors
 * 
 * toString-
 * 	-returns "L"
 * 
 * getMove- 
 * 	-always infect if enemy is in front
 * 	-otherwise if a wall is in front or to the right, turns left
 * 	-otherwise if a fellow lion is in front, turn right
 * 	-otherwise, hop
 */
import java.util.Random;
import java.awt.Color;

public class Lion extends Critter{
	
	Random rand = new Random();
	int moves = 0;
	Color storedColor;
	
	public Lion() {
		
	}
	
	public Color getColor() {
		if(moves%3 == 0) {
			int numColor = rand.nextInt(3);
			
			if(numColor == 0) {
				storedColor = Color.red;
			}
			if(numColor == 1) {
				storedColor = Color.green;
			}
			if(numColor == 2) {
				storedColor = Color.blue;
			}
		}
		
		return storedColor;
	}
	
	public String toString() {
		return "L";
	}
	
	public Action getMove(CritterInfo info) {
		moves++;
		
		if(info.getFront() == Neighbor.OTHER) {
			return Action.INFECT;
		}
		else if((info.getFront() == Neighbor.WALL) || (info.getRight() == Neighbor.WALL)) {
			return Action.LEFT;
		}
		else if(info.getFront() == Neighbor.SAME) {
			return Action.RIGHT;
		}
		else {
			return Action.HOP;
		}
	}
}
