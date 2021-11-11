/**
 * @author Daniel
 *
 * constructor-
 *  -starts out with green color
 *  
 * getColor-
 * 	-changes color after every direction change
 * 		- random color between (red, green, yellow, orange, pink, and cyan)
 * 
 * toString-
 * 	- "G"
 * 
 * getMove-
 * 	-if enemy in front, infects
 * 	-otherwise turns toward nearby enemy
 * 	-otherwise hops if possible
 *  -otherwise turns left
 * 
 */

import java.util.Random;
import java.awt.Color;

public class Gator extends Critter {
	
	Random rand = new Random();
	boolean colorChange = false;
	Color storedColor;
	int moves = 0;
	
	public Gator() {
		storedColor = Color.green;
	}
	
	public Color getColor() {
		if(colorChange == true) {
			int numColor = rand.nextInt(6);
			
			if(numColor == 0) {
				storedColor = Color.red;
				colorChange = false;
			}
			if(numColor == 1) {
				storedColor = Color.green;
				colorChange = false;
			}
			if(numColor == 2) {
				storedColor = Color.yellow;
				colorChange = false;
			}
			if(numColor == 3) {
				storedColor = Color.orange;
				colorChange = false;
			}
			if(numColor == 4) {
				storedColor = Color.pink;
				colorChange = false;
			}
			if(numColor == 5) {
				storedColor = Color.cyan;
				colorChange = false;
			}
		}
		
		return storedColor;
	}
	
	public String toString() {
		return "G";
	}
	
	public Action getMove(CritterInfo info) {
		moves++;
		
		if(info.getFront() == Neighbor.OTHER) {
			return Action.INFECT;
		}
		else if(info.getFront() == Neighbor.EMPTY) {
			return Action.HOP;
		}
		else if(info.getRight() == Neighbor.OTHER) {
			colorChange = true;
			return Action.RIGHT;
		}
		else if(info.getLeft() == Neighbor.OTHER) {
			colorChange = true;
			return Action.LEFT;
		}
		else if(info.getFront() == Neighbor.EMPTY) {
			return Action.HOP;
		}
		else {
			colorChange = true;
			return Action.LEFT;
		}
	}
	
}
