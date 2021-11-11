package Exam.first;

//Write a program that takes in file Exam2.txt and  


/* Q1 
Start class that has following 
a. Read the array [10, 22, 15, 1, 5, 17, 17, 11, 7, -4, 6, 7] within main
b. Write and call a function methodQ1() from main() and pass down the array 
c. Sort the array and ask the user to pick a number from 1 - lengh of array and 
e. Return this number to the main and report what element is there at that index AFTER SORTING
*/
import java.util.*;
import java.io.*;

public class ClassExam2
{
	public static void main(String[] args) throws FileNotFoundException
	{
		int[] array1 = {10, 22, 15, 1, 5, 17, 17, 11, 7, -4, 6, 7};                          //assigned array
    
		System.out.println("Pick a number between 1 and "+array1.length);                    //prompts user
		Scanner input = new Scanner(System.in);                                              //receives user input
		int n = input.nextInt();                                                             //users answer caught in variable n
		System.out.println("The integer at that index is "+methodQ1(array1, n));             //tells user what integer is at that index
    
		methodQ2();                                                                          //runs methodQ2
		methodQ3();                                                                          //runs methodQ3
    }
 
	public static int methodQ1(int[] array, int n)
	{
		Arrays.sort(array);                                                                  //sorts array from least to greatest
		return array[n-1];                                                                   //returns integer at the index that the user picked
	}
//======================================================================================

/* Q2 Within same class, write a void method methodQ2() and call from main() to 
a. Read the lines of employee records file Exam2.txt
b. Display on screen for each employee"Kim ID #897 worked for total ____ hours, and for _____ days." 
c. Also list in same line display on screen how much employee should be paid based on 15$/hr rate
Hint: You will have to throw exception for files AT THIS METHOD
*/
	public static void methodQ2() throws FileNotFoundException
	{
		Scanner input = new Scanner(new File("Exam2.txt"));                                  //reads text file
		PrintStream Out = new PrintStream(new File("Exam2-2.txt"));                          //printstream that prints to Exam2-2.txt
    
		while(input.hasNextLine())                                                           //runs while Exam2.txt has a next line
		{ 
			String line = input.nextLine();                                                  //stores line of text from Exam2.txt in variable
			Scanner lineScan = new Scanner(line);                                            //scans the line
       
			int id = lineScan.nextInt();                                                     //Id from the line stored in variable id
			String name = lineScan.next();                                                   //stores name from the line
			double sum = 0.0;                                                                //initiates variable where total hours will be stored
			int count = 0;                                                                   //initiates variable where amount of days worked will be stored
			while(lineScan.hasNextDouble())                                                  //runs while the line has a record of the worker working
			{
				sum = sum + lineScan.nextDouble();                                           //adds the number of hours worked to the total number of hours
				count++;                                                                     //counts a single day every time a day's hours recorded
			}
       
			System.out.println(name+" (ID#"+id+") worked for a total of "+sum+                
					" hours, and for "+count+" days. Pay: "+(sum*15));                       //tells user in program about the workers hours worked, days, and how much to pay
			Out.println(name+" "+id+" "+sum+" "+count+" "+(sum*15));                         //prints that information in a text file
		}
	}
    

//======================================================================================

/* Q3 Next from within same class write a void method methodQ3() and call it from the main() that
a. Writes all the records from Q#2 to a file called output.txt
b. Replace the employee name in the written file with string "[confidential]"
Hint: You will have to throw exception for files AT THIS METHOD
*/
 
	public static void methodQ3() throws FileNotFoundException
	{
		Scanner input = new Scanner(new File("Exam2-2.txt"));                                //scans the information in Exam2-2.txt
		PrintStream Out = new PrintStream(new File("output.txt"));                           //printstream outputting to output.txt
    
		while(input.hasNextLine())                                                           //runs while Exam2-2.txt has a next line
		{
			String line = input.nextLine();                                                  //stores line of text from Exam2.txt in variable
			Scanner lineScan = new Scanner(line);                                            //scans the line
       
			String name = lineScan.next();                                                   //stores name from the line (we wont use it but we still need to scan it to pass it)
			int id = lineScan.nextInt();                                                     //Id from the line stored in variable id
			name = "[confidential]";                                                         //redeclares name as confidential
			double sum = lineScan.nextDouble();                                              //total hours worked stored in sum
			int count = lineScan.nextInt();                                                  //number of days worked stored in count
			double pay = lineScan.nextDouble();                                              //workers pay stored in pay
                
			Out.println(name+" (ID#"+id+") worked for a total of "+sum+
					" hours, and for "+count+" days. Pay: "+(pay));                          //prints this in output.txt
		}
	}
}
    