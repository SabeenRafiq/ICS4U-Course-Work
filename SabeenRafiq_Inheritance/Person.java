
public class Person
{
    // instance variables 
    private String strName, strBirthday;
    
    //construtor 
    Person(String n, String b)
    {
        this.strName = n;
        this.strBirthday = b;
    }
    
    //default construtor 
    Person()
    {
        this.strName = "Unknown";
        this.strBirthday = "Unknown";
    }
    //getter methods
    public String getName()
    {
        return this.strName;
    }
    
    public String getBirthday()
    {
        return this.strBirthday;
    }
    
    //toString method
    public String toString()
    {
        return "Name: "+this.strName+"\nBirthday:" + this.strBirthday;
    }
}
