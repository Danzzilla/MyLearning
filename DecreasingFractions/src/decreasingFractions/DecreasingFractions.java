package decreasingFractions;

public class DecreasingFractions {
	
	public static double sequenceSum(double x){
		if(x < 1){
			System.out.println("Error: must be larger than one");
			return -1;
		}
		else{                                                             //had a logic error here
			double i = 1;
			double sum = 0;
			
			while (sum < x){
				sum = sum + (1/i);
				//System.out.print(" "+sum);                              //switched between commenting out
				System.out.print("1/"+ (int)i);                           //these two to find error
				i++;                                                      //the problem is it doesnt update the sum
				if((sum + (1/i)) <= x) {                                  //solved when changed int i to a double instead of an int on line 11
					System.out.print(" + ");                              //the problem happened because on line 16 it divides an int by a
				}                                                         //larger int, causing it to equal 0, and causing the sum not to update
			}                                                             
			System.out.println(" = "+sum);                                
			return sum;                                                   
		}
	}
	
	public static void main(String[] args){
		System.out.println(sequenceSum(0.5)+"\n");  
		System.out.println(sequenceSum(1.5)+"\n");
	    System.out.println(sequenceSum(2.0)+"\n");
	    System.out.println(sequenceSum(7.0)+"\n");
	}
}
