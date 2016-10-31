/**
 * Amanda Torres
 * October 26, 2016
 */
public class StudentList
{
    private Student[] students;

    public StudentList(int numberOfStudents)
    {
        students = new Student[numberOfStudents];
    }
    
    public void addStudent(Student stu)
    {
        int ans = -1;
        for(int i = students.length - 1; i >= 0; i--)
        {
            if(students[i] == null)
            {
                ans = i;
            }
        }
        students[ans] = stu;
    }
    
    public Student[] getStudentList()
    {
        return students;
    }
}
