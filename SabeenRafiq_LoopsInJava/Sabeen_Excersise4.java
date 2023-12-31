 /**Name Of Program:
 * Description: This program will tell you the percentage grade in a letter form 
 *
 * @author Sabeen Rafiq
 * @start April 21st, 2021
 * @end April 21st, 2021
 */

//import Scanner class
import java.util.Scanner; 

public class Sabeen_Excersise4 
{
    public static void main(String[] args) 
    {
        //Clear the terminal window 
        System.out.print('\u000C');
        
        //declare variable to store user's percent
        byte bytGrade = 0; 
        
        //declare a boolean variable to loop the try catch block
        boolean bolTryCatch = false;
        
        //do while loop to loop the try catch for the user to enter the correct value
        do
        {
           //add try and catch block
           try
           {
                //prompt user for grade
                System.out.println("What is your average as a percent?");
                
                //store user's grade in bytGrade
                bytGrade = new Scanner(System.in).nextByte();
                
                //reset bolTryCatch
                bolTryCatch = false;
           }
           catch(Exception e)
           {
                //output message to user
                System.out.println("Error. Please enter a valid percent average.");
                
                //set bolTryCatch to true to loop again
                bolTryCatch = true;
           }
        }while(bolTryCatch);//while loop as long as bolTryCatch equals true
        
        //code descoin struture to assign appropritate letter grade for the average
        if(bytGrade < 50 && bytGrade >=0)
        {
            System.out.println(bytGrade + "% as a letter grade is an F");
        }
        else if(bytGrade <= 59)
        {
            System.out.println(bytGrade + "% as a letter grade is a D");
        }
        else if(bytGrade <= 69)
        {
            System.out.println(bytGrade + "% as a letter grade is a C");
        }
        else if(bytGrade <= 79)
        {
            System.out.println(bytGrade + "% as a letter grade is a B");
        }
        else if(bytGrade <=100)
        {
            System.out.println(bytGrade + "% as a letter grade is an A");
        }
        else
        {
            System.out.println("Value entered is out of range");
        }
        
        //output the char grade
        

    }
}
