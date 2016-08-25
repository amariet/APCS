
/**
 * Amanda Torres
 * August 25, 2016
 */
public class FactCalc
{
    private int n;
    
    public FactCalc()
    {
        int n = 12
    }

    public int factorial()
    {
        int number = n;
        int result  = 1;
        while (number > 0)
        {
            result = result * number;
            number --;
        }
        return result;
    }
    public int call()
    { 
        return n;
    }
}
