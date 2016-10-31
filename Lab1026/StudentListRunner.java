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
        StudentList sl = new StudentList(3);
        String ans = "";
        String myString;
        int myInt;
        double myDouble; 
        Student student;
        int quit = 0;
        while(quit == 0)
        {
            System.out.print("Choose an option from the menu by typing its corresponding number.");
            System.out.println("Add a student (1)");
            System.out.println("Quit (0)");
            ans = scr.next();
            if(ans.equals("1"))
            {
                System.out.println("What is the student's name?");
                myString = scr.next();
                System.out.println("What is the student's ID?");
                myInt = scr.nextInt();
                System.out.print("What is the student's GPA?");
                myDouble = scr.nextDouble();
                //Student stu = new Student(myString, myInt, myDouble);
                //sl.addStudent(stu);
            }
            else if(ans.equals("2"))
            {
                Student stuList = sl.getStudentList();
                for(int i = 0; i < stuList.length - 1; i++)
                {
                    System.out.println("Name: " + stuList[1].getName());
                    System.out.println("ID: " + stuList[2].getID());
                    System.out.println("GPA: " + stuList[3].getGPA());
                }
            }
            else if(ans.equals("0"))
            {
                quit = -1;
            }
        }
    }
}
