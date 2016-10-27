/**
 * Amanda Torres
 * October 25, 2016
 */
import java.util.Scanner;

public class Lab1025
{
    public Lab1025()
    {
    }

    public static void main(String[] args)
    {
        String ans = "";
        Scanner scr = new Scanner(System.in);
        while(!ans.equals("quit"))
        {
            System.out.print("Type a word or \"quit\" to quit   ");
            ans = scr.nextLine();
            System.out.print("You said: " + ans + "\n");
        }
    }
    
    public static void partTwo()
    {
        Scanner scr = new Scanner(System.in);
        System.out.print("Type a string: ");
        String ans = scr.nextLine();
        if(ans.indexOf("awesome") != -1)
        {
            System.out.println("This is an \"awesome\" string.");
        }
        else
        {
            System.out.println("This is not an \"awesome\" string.");
        }
    }
}