import java.util.*;

public class test {

	public static void main(String[] args) {
		printstars(9);
	}
	
	public static void printstars(int n) {
		System.out.println("*");
		if(n > 0) printstars(n-1);
	}
	
}
