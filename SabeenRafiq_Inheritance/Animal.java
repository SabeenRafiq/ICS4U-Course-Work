
public class Animal
{
    private int intNumLegs, intMoveFactor;
    private String strName, strLocation;
    
    //construtor 
    Animal(int num, String name, String loc, int move)
    {
        this.intNumLegs = num; 
        this.strName = name;
        this.strLocation = loc; 
        this.intMoveFactor = move;
    }
    
    //default construtor 
    Animal()
    {
        this.intNumLegs = 0; 
        this.strName = "Unknown"; 
        this.strLocation = "Unknown"; 
        this.intMoveFactor = 0;
    }
    
    //overloaded construtor 
    Animal(String n)
    {
        this.intNumLegs = 0; 
        this.strName = n; 
        this.strLocation = "Unknown"; 
        this.intMoveFactor = 0;
    }
}
