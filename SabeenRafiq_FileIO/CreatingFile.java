//import the file class
import java.io.File;

//import the IOException class to handle erroes 
import java.io.IOException; 

public class CreatingFile
{
    public static void main(String[] args)
    {
        //try can catch block to avoid errors around creating file 
        try
        {
            //create file and name it
            File myObj = new File("CreatingFile.txt");
            
            if(myObj.createNewFile())
            {
                System.out.println("File Created: " + myObj.getName());
            }
            else
            {
                System.out.println("File already exists");
            }
        }
        catch (IOException e)
        {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
