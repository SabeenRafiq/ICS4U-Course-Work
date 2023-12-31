
/**
 * Write a description of class Running here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Running extends Shoes
{
    private double weight;
    
    Running(String b, double s, double w)
    {
        super(b,s);
        this.weight = w;
    }    
    
    Running()
    {
        super();
        this.weight = 0.0;
    }
    
}
