/**
 * Amanda Torres
 * October 26, 2016
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
}