
/**
 * Description: This class holds information about players 
 *
 * @author: Sabeen Rafiq
 * @version: 2021-06-03
 */
public class Player
{
    //declare private instace variables 
    private String strFName, strLName;
    
    //declare variable to store the player's score
    private byte bytScore;
    
    //construtor
    Player(String f, String l)
    {
        this.strFName = f;
        this.strLName = l;
        this.bytScore = 0;
    }
    
    //construtor
    Player()
    {
        this.strFName = "Unknown";
        this.strLName = "Unknown";
        this.bytScore = 0;
    }
    
    //set methods for the instance varaibles 
    //Sets a variable to a another value passed in though parameters
    public void setFName(String f)
    {
        this.strFName = f;   
    }
    
    public void setLName(String l)
    {
        this.strLName = l;   
    }

    public void setScore(byte s)
    {
        this.bytScore = s;   
    }
    
    //get methods for the instance varaibles 
    //allows the private variables to be accesed from an outside class
    public String getFName()
    {
        return this.strFName;
    }
    
    public String getLName()
    {
        return this.strLName;
    }
    
    public byte getScore()
    {
        return this.bytScore;
    }
    
    //toString method
    //Use string.format to format the output 
    public String toString()
    {
        return String.format("\n\t %s %s - Score: %d", this.strFName, this.strLName, this.bytScore);
    }
}
