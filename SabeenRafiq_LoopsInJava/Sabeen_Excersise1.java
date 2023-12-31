 /**Name Of Program:
 * Description: This program will do various tasks with a user's grade
 *
 * @author Sabeen Rafiq
 * @start April 21st, 2021
 * @end April 21st, 2021
 */

//import Scanner class
import java.util.Scanner; 

public class Sabeen_Excersise1 
{
    public static void main(String[] args) 
    {
	//Clear the terminal window 
        System.out.print('\u000C');
        
        //declare variable to store user's grade
        byte bytGrade = 0; 
        
        //declare a boolean variable to loop the try catch block
        boolean bolTryCatch = false;
        
        //do while loop to loop the try catch for the user to enter the correct value
        do
        {
           //add try and catch block
           try{
                //prompt user for grade
                System.out.println("What is your grade?");
                
                //store user's grade
                bytGrade = new Scanner(System.in).nextByte();
                
                //reset bolTryCatch
                bolTryCatch = false;
            }
           catch(Exception e)
            {
                //output message to user
                System.out.println("Error. Please enter a valid grade.");
                
                //set bolTryCatch to true to loop again
                bolTryCatch = true;
            }
        }while(bolTryCatch);//while loop as long as bolTryCatch equals true
        
        if(bytGrade >= 50)
        {
            System.out.println("You Passed!");
        }
        else
        {
            System.out.println("You Failed. Better luck next time!");
        }
        

    }
}
