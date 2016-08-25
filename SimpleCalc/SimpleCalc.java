
/**
 * Amanda Torres 
 * August 23, 2016
 */
public class SimpleCalc
{
    private int FirstNumber;
    private int secondNumber;

    public SimpleCalc(int a, int b )
    {
        FirstNumber = a;
        secondNumber= b;
    }

    public int add()
    {
        return FirstNumber + secondNumber;
    }
    public int subtract()
    {
        return FirstNumber - secondNumber;
    }
    public int mult()
    {
        return FirstNumber * secondNumber;
    }
    public int div()
    {
        return FirstNumber / secondNumber;
    }
    public boolean isGreater ()
    {
        return FirstNumber >= secondNumber;
    }
}
    
