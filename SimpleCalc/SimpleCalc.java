
/**
 * Write a description of class SimpleCalc here.
 * 
 * Amanda Torres 
 * @version (a version number or a date)
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
    
