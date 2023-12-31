
/**
 * Description: This class stores information about items from a Movie playlist. 
 * This is a subclass to RafiqMedia
 *
 * @Sabeen Rafiq
 * @version 2021-05-28
 */
public class RafiqMovie extends RafiqMedia
{
    //declare instace variables   
    private String strDirector, strRating;
    
    //declare static varaible 
    static byte bytMovieCounter;
    
    //construtor
    RafiqMovie(String title, int length, String director, String rating)
    {
        //call on super construtor to populate instance varaible in superclass
        super(title,length);
        this.strDirector = director;
        this.strRating = rating; 
        
        //this adds one to the counter each time a new instace of the class is created using this construtor
        bytMovieCounter++;
    }
    
    //default construtor
    RafiqMovie()
    {
        //call on super construtor to populate instance varaible in superclass
        super();
        this.strDirector = "Unknown";
        this.strRating = "Unknown"; 
        
        //this adds one to the counter each time a new instace of the class is created using this construtor
        bytMovieCounter++;
    }
    
    //overloaded constutor
    RafiqMovie(int length)
    {
        //call on super construtor to populate instance varaible in superclass
        super(length);
        this.strDirector = "Unknown";
        this.strRating = "Unknown"; 
        
        //this adds one to the counter each time a new instace of the class is created using this construtor
        bytMovieCounter++;
    }
    
    //this toString method overrides the one in the superclass to relfect the information in this class
    @Override
    //To String method
    public String toString()
    {
        //the superclass's get methods are used to get variables stored in it like the title and length
        //call on the getFormattedLength method to get the formatted length
        //sending in Movie to get H:M
        return "\tTitle: " + super.getTitle() + "\n\tLength: " 
        + super.getFormattedLength("Movie") +"\n\tRating: " + this.strRating + "\n\tDirector: " + this.strDirector;
    }
}
