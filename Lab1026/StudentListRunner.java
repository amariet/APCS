/**
 * Amanda Torres
 * November 21, 2016
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
            
            if(nums == 3)
            {
                System.out.print("Delete a student ! Enter a last name or an ID: ");
                sl.deleteStudentFromList(scr.nextLine());
            }
            
            if(nums == 4)
            {
                System.out.print("Edit a student ! Enter a last name or an ID: ");
                sl.editStudentList(scr.nextLine());
            }
            
            if(nums == 5)
            {
                sl.deleteStudentList();
            }
            
            if(nums == 6)
            {
                System.out.print("Search for a student ! Enter a last name or an ID: ");
                sl.SearchStudent(scr.nextLine());
            }
            
            if(nums == 7)
            {
                sl.filterSearchStudentList();
            }
            String s = scr.nextLine();
            nums = menuNumber();
        }
    }

    public static int menuNumber()
    {
        Scanner scr = new Scanner(System.in);
        String[] menu = new String[7];
        menu[0] = "Add a student !";
        menu[1] = "Print Student List !";
        menu[2] = "Delete Student !";
        menu[3] = "Edit a Student !";
        menu[4] = "Delete Student List !";
        menu[5] = "Search for a Student !";
        menu[6] = "Filter Students !";
        
        System.out.println("Choose an option from the menu by typing its corresponding number or type 'quit' to quit :( !");
        for(int i = 0; i < menu.length; i++)
        {
            System.out.println(i + 1 + " " + menu[i]);
        }
        boolean clear = true;
        while(clear)
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
