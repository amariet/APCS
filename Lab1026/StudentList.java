/**
 * Amanda Torres
 * October 26, 2016
 */
public class StudentList
{
    private Student[] students;
    private Student[] list;

    public StudentList(Student stu1, Student stu2, Student stu3)
    {
        students = new Student[](stu1, stu2, stu3);
    }
    
    public int length()
    {
        return students.length;
    }
    
    public Student getStudentList(int num)
    {
        return students[num];
    }
    
    public void addStudent(Student student)
    {
        list = new Student[list.length + 1];
        for(int i = 0; i < list.length; i++)
        {
            list[i] = students[i];
        }
        list[students.length] = student;
        students = list;
    }
    
    public void delete(int deleteStudentList)
    {
        list = new Student[list.length - 1];
        for(int i = 0; i < deleteStudentList.length; i++)
        {
            list[i] = students[i];
        }
        for(int = deleteStudentList.length; i < list.length; i++)
        {
            list[i] = students[i];
        }
        students = list;
    }
    
    public void print()
    {
        for(int i = 0; i < students.length; i++)
        {
            System.out.println("Name: " + students[i].getName());
            System.out.println("ID: " + students[i].getID());
            System.out.println("GPA: " + students[i].getGPA());
        }
    }
}
