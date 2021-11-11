/**
 * This class is made to work with the AnimalClient File
 * @author DanielSvirida
 * @version 1
 * 
 */
package animals;
import java.util.*;

public class Animal {
	
	private int x;
	private int y;
	private String name;
	private int MaxSpeed;
	
	public Animal() {
		x = 0;
		y = 0;
		name = "unknown";
		MaxSpeed = 2;
	}
	
	public Animal(int dx, int dy, String dName, int dSpeed) {
		x = dx;
		y = dy;
		name = dName;
		MaxSpeed = dSpeed;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public String toString() {
		return "["+name+"] ("+x+", "+y+")";
	}
	
	public boolean touching(Animal x) {
		if((this.x == x.getX()) && (this.y == x.getY())) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void move() {
		Random rand = new Random();
		
		int leftRight = rand.nextInt(MaxSpeed - 1) + 1;
		int upDown = rand.nextInt(MaxSpeed - 1) + 1;
		
		if((x + leftRight) > 10) {
			x -= leftRight;
		}
		else if((x - leftRight) < -10){
			x += leftRight;
		}
		else {
			int sign = rand.nextInt(1);
			
			if (sign == 0) {
				x += leftRight;
			}
			else {
				x -= leftRight;
			}
		}
		
		if((y + upDown) > 10) {
			y -= upDown;
		}
		else if((y - upDown) < -10){
			y += upDown;
		}
		else {
			int sign = rand.nextInt(1);
			
			if (sign == 0) {
				y += upDown;
			}
			else {
				y -= upDown;
			}
		}
	}
}
