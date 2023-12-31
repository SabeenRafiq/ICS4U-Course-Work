//import the IOException class to handle erroes 
import java.io.IOException; 

//impoty the fileWriter class
import java.io.FileWriter;

public class WriteToFile
{
    public static void main(String[] args)
    {
        //try can catch block to avoid errors around creating file 
        try
        {
            //create the file
            FileWriter myWriter =  new FileWriter("WriteToFile.txt");
            
            //write to file created
            myWriter.write("Files in Java might be tricky, but it is fun enough");
            
            //close file
            myWriter.close();
            
            //print to terminal to say it was succesful
            System.out.println("Successfully wrote to the file");
        }
        catch (IOException e)
        {
            System.out.println("An error has occured");
            
            //it is a method to java's throwable class which prints the throwable along with other details (line num, class exeption etc.)
            e.printStackTrace();
        }
    }
}
