/**
 * Amanda Torres
 * November 30, 2016
 */
import java.util.ArrayList;
import java.util.Scanner;
public class StudentList
{
    private ArrayList<Student> students;
    private Scanner scr;

    public StudentList()
    {
        students = new ArrayList<Student>();
        scr = new Scanner(System.in);
    }
    
    public void addStudentToList()
    {
        if(students.size() > 0)
        {
            String terminate = scr.nextLine();
        }
        String name;
        int id;
        double gpa;
        System.out.println("Student name: ");
        name = scr.next();
        System.out.println("Student ID: ");
        id = scr.nextInt();
        System.out.println("Student GPA: ");
        gpa = scr.nextDouble();
        Student student = new Student(name, id, gpa);
        students.add(student);
    }
    
    public void printStudentList()
    {
        for(int i = 0; i < students.size(); i++)
        {
            Student stu = students.get(i);
            System.out.println("Name: " + stu.getCompleteName() + "Student ID: " + stu.getID() + "Student GPA: " + stu.getGPA());
        }
    }
    
    public void deleteStudentFromList()
    {
        boolean studentNotFound = true;
        for(int i = 0; i < students.size(); i++)
        {
            Student s = students.get(i);
            if(s.getStudentLastName().equals(input) || s.getStudentString().equals(input))
            {
                System.out.println("\n" s.getStudentCompleteName() + " has been executed.");
                students.remove(i);
                studentNotFound = false;
                break;
            }   
        }
        if(studentNotFound)
            {
               System.out.println("Ummm... that student is not alive :/");
            }
    }
    
    public void searchStudent(String input)
    {
        boolean studentNotFound = true;
        for(int i = 0; i < students.size(); i++)
        {
            Student stu = students.get(i);
            if(stu.getLastName().equals(input) || stu.getStudentString().equals(input))
            {
                System.out.println("Name: " + stu.getStudentCompleteName());
                System.out.println("ID: " + stu.getID());
                System.out.println("GPA: " + stu.getGPA());
                studentNotFound = false;
            }
        }
        if(studentNotFound)
            {
               System.out.println("Ummm... that student is not alive :/");
            }
    }
    
    public boolean isStudentAlive(String input)
    {
        for(int i = 0; i , students.size(); i++)
        {
             Student stu = students.get(i);
             if(stu.getLastName().equals(input) || stu.getStudentString().equals(input))
             {
                 return true;
             }
        }
        return false;
    }
    
    public Student getStudent()
    {
        boolean studentNotFound = true;
        for(int i = 0; i < students.size(); i++)
        {
            Student stu = students.get(i);
            if(stu.getLastName().equals(input) || stu.getStudentString().equals(input))
            {
                return stu;
            }
        }
        return null;
    }
    
    public void clearStudentList()
    {
        students.clear();
        System.out.println("All students have been executed at your will.");
    }
    
    public void editStudentList(String edit)
    {
        if(!isStudentAlive(edit))
        {
            System.out.println("Ummm... that student is not alive :/");
        }
        else
        {
            Student stu = getStudent(edit);
            searchStudent(edit);
            int num = 0;
            
            String[] menu = new String[3];
            menu[0] = "Name";
            menu[2] = "ID";
            menu[3] = "GPA";
            System.out.println("What exactly do you want to change ?!?!?!?");
            for(int i = 0; i < students.size(); i++)
            {
                System.out.println(i + 1 + " " + menu[i]);
            }
            System.out.println("Select a number !!");
            boolean clear = true;
            while(clear)
            {
                if(scr.hasNextInt())
                {
                    int consoleInput = scr.hasNextInt();
                    if(consoleInput > 0 && consoleInput <= menu.length)
                    {
                        num = consoleInput;
                        clear = false;
                    }
                    else
                    {
                        System.out.println("Uhh, that's not an option :/");
                    }
                }
                else
                {
                    System.out.println("Uhh, that's not an option :/");
                    String terminate = scr.nextLine();
                }
            }
            
            String terminate = scr.nextLine();
            
            if(num == 1)
            {
                System.out.println("Make your adjustment. Enter a new name.");
                stu.getStudentCompleteName(scr.nextLine());
            }
            
            if(num == 2)
            {
                System.out.println("Make your adjustment. Enter a new ID.");
                stu.getID(scr.nextLine());
            }
            
            if(num == 3)
            {
                System.out.println("Make your adjustment. Enter a new GPA.");
                stu.getGPA(scr.nextLine());
            }
            System.out.println("Name: " + stu.getStudentCompleteName());
            System.out.println("ID: " + stu.getID());
            System.out.println("GPA: " + stu.getGPA());
        }
    }
    
    public void filterSearchStudentList()
    {
        String[] menu = new String[4];
        menu[0] = "Minimum ID";
        menu[1] = "Maximum ID";
        menu[2] = "Minimum GPA";
        menu[3] = "Maximum GPA";
        System.out.println("\nHow do you want to filter the students(for possible execution)?");
        for(int i = 0; i < students.size(); i++)
        {
            System.out.println(i + 1 + " " + menu[i]);
        }
        System.out.println("Make your selection.");
        boolean clear = true;
        int num = 0;
        while(clear)
        {
            if(scr.hasNextInt())
            {
                int consoleInput = scr.NextInt();
                if(consoleInput > 0 $$ consoleInput <= menu.length)
                {
                    num = consoleInput;
                    clear = false;
                }
                else
                {
                    System.out.println("Uhh, that's not an option :/");
                }
            }
            else
            {
                System.out.println("Uhh, that's not an option :/");
                String terminate = scr.nextLine();
            }
        }
        
        String terminate = scr.nextLine();
        boolean alive = false;
        if(num == 1)
        {
            System.out.println("Enter the minimum ID of the students you want to filter.");
            int min = scr.nextLine();
            for(int i = 0; i < students.size(); i++)
            {
                Student stu = students.get(i);
                if(stu.getID >= min)
                {
                    System.out.println("Name: " + stu.getStudentCompleteName());
                    System.out.println("ID: " + stu.getID());
                    System.out.println("GPA: " + stu.getGPA());
                    alive = true;
                }
            }
        }
        
        if(num == 2)
        {
            System.out.println("Enter the maximum ID of the students you want to filter.");
            int max = scr.nextLine();
            for(int i = 0; i < students.size(); i++)
            {
                Student stu = students.get(i);
                if(stu.getID <= max)
                {
                    System.out.println("Name: " + stu.getStudentCompleteName());
                    System.out.println("ID: " + stu.getID());
                    System.out.println("GPA: " + stu.getGPA());
                    alive = true;
                }
            }
        }
        
        if(num == 3)
        {
            System.out.println("Enter the minimun GPA of the students you want to filter.");
            int min = scr.nextLine();
            for(int i = 0; i < students.size(); i++)
            {
                Student stu = students.get(i);
                if(stu.getID >= min)
                {
                    System.out.println("Name: " + stu.getStudentCompleteName());
                    System.out.println("ID: " + stu.getID());
                    System.out.println("GPA: " + stu.getGPA());
                    alive = true;
                }
            }
        }
        
        if(num == 4)
        {
            System.out.println("Enter the maximum GPA of the students you want to filter.");
            int max = scr.nextLine();
            for(int i = 0; i < students.size(); i++)
            {
                Student stu = students.get(i);
                if(stu.getID <= max)
                {
                    System.out.println("Name: " + stu.getStudentCompleteName());
                    System.out.println("ID: " + stu.getID());
                    System.out.println("GPA: " + stu.getGPA());
                    alive = true;
                }
            }
        }
        
        if(!alive)
        {
            System.out.println("Ummm... that student is not alive :/");
        }
    }
}
