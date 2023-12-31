import java.io.File;

import java.io.FileNotFoundException; 
import java.io.IOException; 
//a try can have mutiple catches

import java.util.Scanner;

public class ReadFile
{
    public static void main(String[] args)
    {
        //declare a variable to hold the information coming in from the file 
        String strData;
        
        try
        {
            //specify file i will be looking at
            File myObj = new File("WritetoFile.txt");
            
            //create scanner
            Scanner myReader = new Scanner(myObj);
            
            //loop the length of the file
            while(myReader.hasNextLine())
            {
                //read the data one each line into a variable
                strData = myReader.nextLine();
                
                //ouput the data
                System.out.println(strData);
            }
            
            //close file
            myReader.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error. Cannot find file");
        }
        catch(IOException e)
        {
            System.out.println("Can't read from file");
        }
    }
}
