
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Student
{
    //declare instance variables for student 
    String strFName, strLName;
    byte bytAge;
    String strStudentNum;
    String strContactInfo;
    
    //create a constructor 
    Student(String f, String l, byte a, String s, String c)
    {
        //populate instance variables using parameters coming from test class
        this.strFName = f;
        this.strLName = l;
        this.bytAge = a;
        this.strStudentNum = s;
        this.strContactInfo = c;
    }
    
    //create a default constructor 
    Student ()
    {
        //poulate instance varibles with default varibles 
        this.strFName = "Unknown";
        this.strLName = "Unknown";
        this.bytAge = 0;
        this.strStudentNum = "Unknown";
        this.strContactInfo = "Unknown";
    }
    
    public String toString()
    {
        return "First Name: " + this.strFName
        +"\nLast Name: " + this.strLName
        + "\nAge: " + this.bytAge
        +"\nStudent Number: " + this.strStudentNum
        +"\nContact Info: " + this.strContactInfo        ;
    }
}
