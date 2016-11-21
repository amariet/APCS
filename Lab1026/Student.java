/**
 * Amanda Torres
 * November 21, 2016
 */
public class Student
{
    private int stuID;
    private double stuGPA;
    private String firstName = "";
    private String middleName = "";
    private String lastName = "";
    
    public Student(String name, int id, double gpa)
    {
        stuID = id;
        stuGPA = gpa;
        parseUserInput(name);
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
    
    public String getStudentString()
    {
        String str = stuID + ">";
        return str.substring(0, str.indexOf(">"));
    }
    
    public void parseUserInput(String str)
    {
        if(str.indexOf(",") > -1) // checks if string has a comma
                                  // Last, First Middle scenario OR Last, First scenario
        {
            // first have to check for last name IF string has a comma
            lastName = str.substring(0, str.indexOf(",")); // start at 0 up until comma
            if(str.indexOf(" ", str.indexOf(",") + 2) > -1) // then have to check if there is a middle name (Last, First Middle)
            {
                firstName = str.substring(str.indexOf(",") + 2, str.indexOf(" ", str.indexOf(",") + 2)); // first name up until middle name
                middleName  = str.substring(str.indexOf(" ", str.indexOf(",") + 2)); // middle name code pulled from if statement
            }
            else // Last, First scenario
            {
                firstName = str.substring(str.indexOf(",") + 1); // starts at first comma plus one index - ends after last index
            }
        }
        else // if there is no comma, it must be a First Middle Last OR a First Last scenario
        {
            firstName = str.substring(0, str.indexOf(" ")); // checks first name - start at 0 up until first space
            if(str.indexOf(" ", str.indexOf(" ") + 1) > -1) // then have to check if there is a middle name (First Middle Last)
            {
                int space = str.indexOf(" ", str.indexOf(" ") + 1); // the SECOND space in the string (after middle name)
                middleName = str.substring(str.indexOf(" ") + 1, space); // starts at the beginning of middle name up until the second space
                lastName = str.substring(space + 1); // starts at the second space - ends after last index
            }
            else // if there is not middle name, it is a First Last scenario
            {
                lastName = str.substring(str.indexOf(" ") + 1); // simply starts at the first space plus one index - ends after last index
            }
        }
    }
}
