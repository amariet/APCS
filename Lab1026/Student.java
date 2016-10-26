/**
 * Amanda Torres
 * October 26, 2016
 */
public class Student
{
    private int stuID;
    private double stuGPA;
    private String stuName;

    public Student(int id, double gpa, String name)
    {
        stuID = id;
        stuGPA = gpa;
        stuName = name;
    }
    
    public void setName(String name)
    {
        stuName = name;
    }
    
    public String getName()
    {
        return stuName;
    }
    
    public void setGPA(double gpa)
    {
        stuGPA = gpa;
    }
    
    public double getGPA()
    {
        return stuGPA;
    }
    
    public void setID(int id)
    {
        stuID = id;
    }
    
    public int getID()
    {
        return stuID;
    }
}
