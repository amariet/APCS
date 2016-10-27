/**
 * Amanda Torres
 * October 26, 2016
 */
import java.util.Scanner;
public class StudentListRunner
{
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
        String[] menu = new String[1];
        StudList studList = new StudList(3);
        menu[0] = "Add a student";
        String ans = "";
        System.out.print("Choose an option from the menu by typing its corresponding number.");
        while(ans.equals("quit"))
        {
            System.out.print();
            ans = scr.next
        }
    }
}
