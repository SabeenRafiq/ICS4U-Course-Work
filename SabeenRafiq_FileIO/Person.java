
/**
 * This stores information about a person
 *
 * @author Sabeen
 * @version 10th May 2021
 */
public class Person
{
    //instace varaiblese 
    private String strFName, strLName;
    private byte bytAge;
    static byte bytPersonCount = 0;

    //construtor 
    Person(String f, String l, byte a)
    {
        this.strFName = f;
        this.strLName = l;
        this.bytAge = a; 
        bytPersonCount++;
    }
    
    //default construtor 
    Person()
    {
        this.strFName = "Unknown";
        this.strLName = "Unknown";
        this.bytAge = 0;  
        bytPersonCount++;
    }
    
    //overload a method to only take in age and set name to default 
    Person(byte a)
    {
        this.strFName = "Unknown";
        this.strLName = "Unknown";
        this.bytAge = a; 
        bytPersonCount++;
    }
    
    //get methods for instance varaibles to send value back to test class 
    public String getFName()
    {
        return this.strFName;
    }
    
    public String getLName()
    {
        return this.strLName;
    }
    
    public byte getAge()
    {
        return this.bytAge;
    }
    
    //set method to update instance varibles with updated values from test class
    public void setFName(String f)
    {
        this.strFName = f; 
    }
    
    public void setLName(String l)
    {
        this.strLName = l; 
    }
    
    public void setAge(byte a)
    {
        this.bytAge = a; 
    }

    //toString method to ouput instance variables in a statement
    public String toString()
    {
        return "First Name: "+ this.strFName +
        "\nLast Name: " + this.strLName
        +"\nAge: " + this.bytAge +
        "\n";
    }
}
