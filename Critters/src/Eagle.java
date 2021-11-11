/** @author Daniel Svirida */

import java.awt.Color;

public class Eagle extends Critter {
	/** Used by other functions to determine if there needs to be a color change */
	boolean colorChange = false;
	
	/** Stored color */
	Color storedColor;
	
	/** Counts amount of moves done */
	int moves = 0;
	
	/** Returns the displayed character for the critter 
	 *  @return character
	 */
	public String toString() {
		return "E";
	}
	
	/** 
	 * Returns the displayed color for the critter character
	 * @return color
	 */
	public Color getColor() {
		if(colorChange == true) {
			if (storedColor == Color.orange) {
				storedColor = Color.gray;
				colorChange = false;
			}else if (storedColor == Color.gray) {
				storedColor = Color.orange;
				colorChange = false;
			}
		}
		
		return storedColor;
	}
	
	/**
	 * Returns what action the critter is to do
	 * @return action
	 */
	public Action getMove(CritterInfo info) {
		moves++;
		
		if(info.getFront() == Neighbor.OTHER) {
			return Action.INFECT;
		}
		else if(info.getRight() == Neighbor.OTHER) {
			if(info.getRightDirection() != Direction.WEST) {
				return Action.INFECT;
			}
			else {
				return Action.HOP;
			}
		}
		else if(info.getLeft() == Neighbor.OTHER) {
			if(info.getLeftDirection() != Direction.EAST) {
				return Action.INFECT;
			}
			else {
				return Action.HOP;
			}
		}
		else if(info.getBack() == Neighbor.OTHER) { 
			if(info.getBackDirection() != Direction.NORTH) {
				return Action.INFECT;
			}
			else {
				return Action.HOP;
			}
		}
		else if(info.getFront() == Neighbor.EMPTY) {
			return Action.HOP;
		}
		else if((info.getFront() == Neighbor.SAME) || (info.getFront() == Neighbor.WALL)) {
			return Action.RIGHT;
		}
		else {
			return Action.HOP;
		}
	}
}
