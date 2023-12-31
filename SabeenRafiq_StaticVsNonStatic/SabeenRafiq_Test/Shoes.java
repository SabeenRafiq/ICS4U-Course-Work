
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shoes
{
    private String strType, strColour;
    static byte bytPersonCount;
    static short shrValue;
    
    //construtor 
    Shoes(String t, String c)
    {
        this.strType = t;
        this.strColour = c;
        // bytPersonCount++;
    }
    
    
    public String getColour()
    {
        return this.strColour;
    }
    
    public void setColour(String c)
    {
        this.strColour = c; 
    }
    
}
