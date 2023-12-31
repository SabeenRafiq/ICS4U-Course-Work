
/**
 * Description: This class stores information about items from a Song playlist. 
 * This is a subclass to RafiqMedia
 *
 * @Sabeen Rafiq
 * @version 2021-05-28
 */
public class RafiqSong extends RafiqMedia
{
    //declare instace variables   
    private String strArtist, strGenre;
    
    //declare static varaible 
    static byte bytSongCounter;
    
    //construtor
    RafiqSong(String title, int length, String artist, String genre)
    {
        //call on super construtor to populate instance varaible in superclass
        super(title,length);
        this.strArtist = artist;
        this.strGenre = genre; 
        
        //this adds one to the counter each time a new instace of the class is created using this construtor
        bytSongCounter++;
    }
    
    //default construtor
    RafiqSong()
    {
        //call on super construtor to populate instance varaible in superclass
        super();
        this.strArtist = "Unknown";
        this.strGenre = "Unknown"; 
                
        //this adds one to the counter each time a new instace of the class is created using this construtor
        bytSongCounter++;
    }
    
    //overloaded construtor
    RafiqSong(int length)
    {
        //call on super construtor to populate instance varaible in superclass
        super(length);
        this.strArtist = "Unknown";
        this.strGenre = "Unknown"; 
        
        //this adds one to the counter each time a new instace of the class is created using this construtor
        bytSongCounter++;
    }
    
    //this toString method overrides the one in the superclass to relfect the information in this class
    @Override
    //To String method
    public String toString()
    {
        //declare variable 
        String strConjunction;
        
        //if statment to show " by " between the title and artist name unless no artist name or no title was entered
        if(this.strArtist.isEmpty() || super.getTitle().isEmpty())
        {
            strConjunction = "";
        }
        else
        {
            strConjunction = " by ";
        }
        
        //the superclass's get methods are used to get varaviles stored in it like the title and length
        //call on the getFormattedLength method to get the formatted length
        //sending in Song M:S
        return "\tTitle: " + super.getTitle() + strConjunction + this.strArtist + "\n\tLength: "
        + super.getFormattedLength("Song") + "\n\tGenre: " + this.strGenre;
    }
}
