package management;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Josh Archer (linted by Daniel Svirida)
 * @version 1
 * Manages the pay calculator and outputs how much the employee is to be payed
 */
public class PayManager
{
    private static final int HOURS_PAD = 12;

    /**
     * Manager
     * @param args command arguments
     */
    public static void main(String[] args)
    {
        String name;

        //run a second test
        try (Scanner console = new Scanner(System.in)) {
            for(int i = 0; i < 3; i++){
                //enter a name
                System.out.print("Enter a name: ");
                name = console.nextLine();

                //get a pay rate and print the pay
                System.out.print("Enter a payrate: ");
                double payRate = console.nextDouble();
                console.nextLine();

                //enter an amount of hours
                System.out.print("Enter # of hours: ");
                int hours = console.nextInt();
                console.nextLine();

                //pad hours by 12
                hours += HOURS_PAD;

                PayCalculator calculator = new PayCalculator(payRate, name);
                double pay = calculator.calculatePay(false, hours);

                System.out.println("Pay: $" + pay);
                System.out.println();
            }
        }
        catch (InputMismatchException ex)
        {
            System.out.println("InputMismatchException");
        }
        catch (Exception ex)
        {
            System.out.println("Error!");
        }
    }
}