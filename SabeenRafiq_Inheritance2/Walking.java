
/**
 * Write a description of class Walking here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Walking extends Shoes
{
    private boolean bolGoreTex;
    
    Walking(String b, double s, boolean g)
    {
        super(b,s);
        this.bolGoreTex=g;
    }
    
    Walking()
    {
        super();
        this.bolGoreTex= false;
    }
}
