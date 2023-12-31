 /**Name Of Program:
 * Description: This program will tell you if the temp is above freezing or not
 *
 * @author Sabeen Rafiq
 * @start April 21st, 2021
 * @end April 21st, 2021
 */

//import Scanner class
import java.util.Scanner; 

public class Sabeen_Excersise2 
{
    public static void main(String[] args) 
    {
	//Clear the terminal window 
        System.out.print('\u000C');
        
        //declare variable to store user's temp
        byte bytTemp = 0; 
        
        //declare a boolean variable to loop the try catch block
        boolean bolTryCatch = false;
        
        //do while loop to loop the try catch for the user to enter the correct value
        do
        {
           //add try and catch block
           try{
                //prompt user for temp
                System.out.println("What is the temperature?");
                
                //store user's grade
                bytTemp = new Scanner(System.in).nextByte();
                
                //reset bolTryCatch
                bolTryCatch = false;
            }
           catch(Exception e)
            {
                //output message to user
                System.out.println("Error. Please enter a valid temperature.");
                
                //set bolTryCatch to true to loop again
                bolTryCatch = true;
            }
        }while(bolTryCatch);//while loop as long as bolTryCatch equals true
        
        if(bytTemp >= 0)
        {
            System.out.println("Wow its above freezing! It's "+bytTemp + " degrees!");
        }
        else
        {
            System.out.println("Wow its freezing! It's "+bytTemp + " degrees!");
        }
        

    }
}
