
/**
 * The informatoin about a persosn
 *
 * @author Sabeen
 * @version april 30 2121
 */
public class Person
{
    //delcare instance variables for person
    private String strFName,strLName;
    private byte bytAge;
    
    //create a constructor 
    Person(String f, String l, byte a)
    {
        //poulate the instance varaibles 
        this.strFName = f;
        this.strLName = l;
        this.bytAge = a;
    }
    
    Person(String f, String l)
    {
        //poulate the instance varaibles 
        this.strFName = f;
        this.strLName = l;
    }
    
    Person()
    {
        //poulate the instance varaibles 
        this.strFName = "Unknown";
        this.strLName = "Unknown";
        this.bytAge = 0;
    }
    
    //set method for first name 
    public void setFName(String newFName)
    {
        //updateing instance variables  with new name
        this.strFName = newFName;
    }
    
    //get method for first name 
    public String getFName()
    {
        return this.strFName;
    }
    
    //equals method to compare objects
    public boolean equals(Person p)
    {
        return (p.strFName.equalsIgnoreCase(this.strFName) 
        && p.strLName.equalsIgnoreCase(this.strLName)
        && p.bytAge == this.bytAge);
    }

    
    //to string method to output instance variables 
    public String toString()
    {
        return "First Name: " + this.strFName
        +"\nLast Name: "+this.strLName 
        + "\nAge: "+this.bytAge
        +"\n";
    }

}
