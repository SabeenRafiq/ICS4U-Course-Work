
public class Mammal extends Animal
{
    private boolean bolEatsMeat, bolHibernate;
    private String strLandOrWater;
    private byte bytMoveFactor;
    
    //construtor 
    Mammal(String strName)
    {
        //calls the animal overloaded construtor with string that represnts the name of the animal
        super(strName);
        
        //populate instace variables
        this.bolEatsMeat = false;
        this.bolHibernate = true;
        this.bytMoveFactor = 10;
        this.strLandOrWater = "Land";
    }
}
