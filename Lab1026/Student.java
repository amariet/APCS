/**
 * Amanda Torres
 * October 26, 2016
 */
public class Student
{
    private int stuID;
    private double stuGPA;
    private String firstName;
    private String middleName;
    private String lastName;
    
    public Student(int id, double gpa, String name)
    {
        stuID = id;
        stuGPA = gpa;
        firstName = name;
    }
    
    public String getCompleteName()
    {
        return lastName + ", " + firstName + " " + middleName;
    }
    
    public void setFirstName(String name)
    {
       firstName = name;
    }
    
     public void setMiddleName(String name)
    {
       middleName = name;
    }
    
     public void setLastName(String name)
    {
       lastName = name;
    }
    
    public String getFirstName()
    {
        return firstName;
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