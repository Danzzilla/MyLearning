package management;

/**
 * @author Josh Archer (linted by Daniel Svirida)
 * @version 1
 * Object that stores an employees pay amount
 */
public class PayCalculator
{
    private double payAmount;
    private String employeeFullName;

    //constants for calculatePay()
    private static final int FULL_TIME_HOURS = 40;
    private static final double OVERTIME_MODIFIER = 0.5;

    /**
     * Constructs PayCalculator Object
     * @param payAmount amount the employee is paid
     * @param employeeFullName employee's full name
     */
    public PayCalculator(double payAmount, String employeeFullName)
    {
        this.payAmount = payAmount;
        this.employeeFullName = employeeFullName;
    }

    /**
     * Calculates pay of the employee
     * @param salaried whether the employee is salaried or not
     * @param hours number of hours worked
     * @return returns the amount to be paid to the employee
     */
    public double calculatePay(boolean salaried, int hours)
    {
        if (salaried)
        {
            return payAmount;
        }
        else
        {
            double total = hours * payAmount;

        if (hours > FULL_TIME_HOURS)
            {
                total += hours * (OVERTIME_MODIFIER * payAmount);
            }

            return total;
        }
    }

    /**
     * @return The employees name and their pay amount
     */
    @Override
    public String toString(){
        return employeeFullName + ": $" + payAmount;
    }
}