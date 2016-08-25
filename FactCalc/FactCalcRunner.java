
/**
 * Amanda Torres
 * August 25, 2016
 */
public class FactCalcRunner
{

    public static void main (String[] args)
    {
        FactCalc myNumber = new FactCalc(5);
        System.out.println("The factorial of " + myNumber.call() + " is: " + myNumber.factorial());
    }
}
