/**
 * Amanda Torres
 * October 26, 2016
 */
public class StudentList
{
    private Student[] students;

    public StudentList(int numberOfStudents)
    {
        students = new Student(numberOfStudents);
    }
    
    public void addStudent(Student s, int index,)
    {
        students[index] = s;
    }
}
