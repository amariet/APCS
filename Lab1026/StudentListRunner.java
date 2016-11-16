/**
 * Amanda Torres
 * October 26, 2016
 */
import java.util.Scanner;
import java.util.Arrays;
public class StudentListRunner
{
    public static void main(String[] args)
    {
        Scanner scr = new Scanner(System.in);
        StudentList sl = new StudentList();
        int nums = menuNumber();
        String ans = "";
        while(nums != -1)
        {   

            if(nums == 1)
            {
                sl.addStudentToList();
                System.out.print("\n");
            }

            if(nums == 2)
            {
                System.out.println("Student List !");
                sl.printStudentList();
                System.out.print("\n");
            }

            if(nums > 2)
            {
                System.out.print("I haven't gotten that far yet, you're just going to have to wait :/ \n");
                System.out.print("\n");
            }
            String s = scr.nextLine();
            nums = menuNumber();
        }
    }

    public static int menuNumber()
    {
        Scanner scr = new Scanner(System.in);
        String[] menu = new String[3];
        menu[0] = "Add a student !";
        menu[1] = "Print Student List !";
        menu[2] = "Delete Student !";
        
        System.out.println("Choose an option from the menu by typing its corresponding number or just type 'quit' to quit :( !");
        for(int i = 0; i < menu.length; i++)
        {
            System.out.println(i + 1 + " " + menu[i]);
        }
        boolean ayylmao = true;
        while(ayylmao)
        {
            if(scr.hasNext("quit"))
            {
                return -1;
            }
            else if(scr.hasNextInt())
            {
                int num = scr.nextInt();
                if(num > 0 && num <= menu.length)
                {
                    return num;
                }
                else
                {
                    System.out.println("Uhh, that's not an option :/");
                    return -1;
                }
            }
            else
            {
                System.out.println("Uhh, that's not an option :/");
                String terminate = scr.nextLine();
            }
        }
        return -1;
    }
}
