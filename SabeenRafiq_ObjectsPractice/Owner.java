
/**
 * Write a description of class Owner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Owner
{
    //delcare instance variables 
    String strFName;
    String strLName;
    int intContactInfo;
    
    //create a construtor 
    Owner (String f, String l, int c)
    {
        this.strFName = f;
        this.strLName = l;
        this.intContactInfo = c;        
    }
    
    //create default construtor 
    Owner ()
    {
        this.strFName = "Unknown";
        this.strLName = "Unknown";
        this.intContactInfo = 0;     
        
    }
    
    public String toString()
    {
        return "First Name of Owner: "+ this.strFName + "Last Name of Owner: "+this.strLName + "Contact info: "+this.intContactInfo;
    }
    
    public boolean equals (Owner o)
    {
        return o.intContactInfo == 0;
    }
    
}
