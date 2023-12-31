
/**
 * Description: This class stores infomation about media. This is a superclass. 
 *
 * @Sabeen Rafiq
 * @version 2021-05-28
 */
public class RafiqMedia
{
    //Declare instace variabes
    private String strTitle;
    private int intLength;
    
    //construtor
    RafiqMedia(String title, int length)
    {
        this.strTitle = title;
        this.intLength = length;
    }
    
    //default construtor
    RafiqMedia()
    {
        this.strTitle = "Unknown";
        this.intLength = 0;
    }
    
    //overloaded method
    RafiqMedia(int length)
    {
        this.strTitle = "Unknown";
        this.intLength = length;
    }
    
    //getter methods
    public String getTitle()
    {
         return this.strTitle;   
    } 
    
    public int getLength()
    {
         return this.intLength;   
    }
    
    //method to calcuate the length in hours, minutes and seconds
    public String getFormattedLength(String strMediaType)
    {
        //declare variables
        int intHours,intMinutesWithHours, intMinutes;
        byte bytSeconds, bytDecPlacesSec, bytDecPlacesMin;
        String strSeconds,strMinutes;
        
        //calculate hours 
        intHours = (int)(this.intLength/(60*60));
        
        //calculate minutes when shown with hours
        intMinutesWithHours = (int)((this.intLength % (60*60))/60);
        
        //calculate minutes
        intMinutes = (int)(this.intLength/60);
        
        //store intMinutes as a string by using the valueOf string method and passing in intMinutes
        strMinutes = String.valueOf(intMinutesWithHours);
        
        //Check how many digits there are by checking the length of strSeconds and storing it as bytDecPlaces
        //only needed when ouptting minutes with hours, not minutes with seconds
        bytDecPlacesMin = (byte) (strMinutes.length());
        
        //calcuate seconds 
        bytSeconds = (byte)(this.intLength % 60);
        
        //store bytSeconds as a string by using the valueOf string method and passing in bytSeconds
        strSeconds = String.valueOf(bytSeconds);
        
        //Check how many digits there are by checking the length of strSeconds and storing it as bytDecPlaces
        bytDecPlacesSec = (byte) (strSeconds.length());
        
        //return the correctly formatted length based on what string is entered 
        //(the string represents the type of formatting nessecary)
        if (strMediaType.equalsIgnoreCase("movie"))
        {            
            //If there is only one digit in the minutes, then there will be a zero added in front, else there will not
            if(bytDecPlacesMin == 1)
            {
                return intHours + ":0" + intMinutesWithHours;
            }
            else
            {
                return intHours + ":" + intMinutesWithHours;
            }
        }
        else if (strMediaType.equalsIgnoreCase("song"))
        {
            //If there is only one digit in the seconds, then there will be a zero added in front, else there will not
            if(bytDecPlacesSec == 1)
            {
                return intMinutes + ":0" + bytSeconds;
            }
            else
            {
                return intMinutes + ":" + bytSeconds;
            }
        }
        else
        {
            return intHours + ":" + intMinutes + ":" + bytSeconds;
        }
    }
    
    //To String method
    public String toString()
    {
        //call on the getFormattedLength method to get the formatted length
        //sending in Media to get H:M:S
        return "\n\tTitle: "+ this.strTitle + "\n\tLength: " + getFormattedLength("Media");
    }
    
}
