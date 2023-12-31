
/**
 * Write a description of class Animal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Animal
{
    //decalre instanse varaibles 
    String strGroup, strAnimalName;
    byte bytAge;
    
    //create a construtor 
    Animal (String g, String n, byte a)
    {
        this.strGroup = g;
        this.strAnimalName = n;
        this.bytAge = a;        
    }
    
    //create default construtor 
    Animal ()
    {
        this.strGroup = "Unknown";
        this.strAnimalName = "Unknown";
        this.bytAge = 0;
        
    }
    
    public String toString()
    {
        return "Group: "+ this.strGroup + "Name: "+this.strAnimalName + "Age: "+this.bytAge;
    }
    
    public boolean equals (Animal a)
    {
        return a.bytAge == 0;
    }
    
}
