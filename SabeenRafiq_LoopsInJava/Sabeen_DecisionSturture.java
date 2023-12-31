/**Name Of Program:
 * Description: This program will review how to use a 
 * try catch, if statement and do while loop
 * 
 * @author Sabeen Rafiq
 * @start April 21th, 2021
 * @end April 21th, 2021
 */

//import Scanner class
import java.util.Scanner;
public class Sabeen_DecisionSturture 
{
    public static void main(String[] args) 
    {
    //Clear the terminal window 
        System.out.print('\u000C');
        
        //delcare variable to store user's age
        byte bytAge = 0;
        
        //declare a boolean varaible to loop the try catch block
        boolean bolTryCatch = false;
        
        //prompt the user for thier age
        System.out.println("Please enter your age as a number");
                
        //do while loop to loop the try catch for the user to enter the correct value
        do
        {
            //add try and catch block
            try
            {
                //populate the age variable with the Scanner
                bytAge = new Scanner(System.in).nextByte();
                
                //reset bolTryCatch to false due to correct value being entered
                bolTryCatch = false;
            }
            catch(Exception e)
            {
                //output message to user when error is thrown and prompt again
                System.out.println("Error. Please make sure you entered your age as a number");
                
                //set bolTryCatch to true to loop again
                bolTryCatch = true;
            }
            
        }while(bolTryCatch);//while loop as long as bolTryCatch equals true
        
        //code if statement to look at the age entered and output message accordingly 
        if(bytAge ==16)
        {
            System.out.println("Good luck on your drivers test");
        }
        else if(bytAge > 16)
        {
            System.out.println("Congratulations on driving!");
        }
        else
        {
            System.out.println("Sorry. Too young to drive");
        }
        
        
    }
}
















