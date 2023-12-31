
public class Student extends Person
{
    //instance variables
    private int intGrade;
    private float fltGPA;
    
    Student(String name, String bday, int grade, float gpa)
    {
        //call on the superclass construtor sending in info for instace variables 
        super(name, bday);
        this.intGrade = grade;
        this.fltGPA = gpa;
    }
    
    //getter methods
    public int getGrade()
    {
        return this.intGrade;
    }
    String name = super.getName();
    public float getGPA()
    {
        return this.fltGPA;
    }
}
