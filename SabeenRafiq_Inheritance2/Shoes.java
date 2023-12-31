
/**
 * Write a description of class Shoes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shoes
{
    private String strBrand;
    private double dblSize;
    
    //create construtor
    Shoes(String b, double s)
    {
        this.strBrand = b;
        this.dblSize = s;
    }
    
    //default construtor
    Shoes()
    {
        this.strBrand = "Unknown";
        this.dblSize = 0.0;
    }
    
    public String getBrand()
    {
        return  this.strBrand;
    }
}
