
/**
 * Name Of Program: Decision Making 2
 * Description: This program will deterine whether a student is elegible or a schloarship 
 *
 * @author Sabeen Rafiq
 * @start April 22nd, 2021
 * @end April 22nd, 2021
 */

//import Scanner class
import java.util.Scanner; 

public class Sabeen_DecisionMaking2
{
    public static void main(String[] args)
    {
        //Clear the terminal window 
        System.out.print('\u000C');
        
        //Declare a varaible to store the student's average 
        byte bytAverage =0; 
        
        //Declare a varaible to store the student's community service hours 
        short shrCommunityService = 0;
        
        //declare a boolean variable to loop the try catch block
        boolean bolTryCatch = false;
        
        do
        {
            try
            {
                //prompt user for thier average
                System.out.println("What is your average?");
                
                //Collect average and store in bytAverage
                bytAverage = new Scanner(System.in).nextByte();
                
                //reset bolTryCatch 
                bolTryCatch = false;
            }
            catch(Exception e)
            {
                //Error message
                System.out.println("Error. Please enter a valid average");
                
                //set bolTryCatch to true to loop again
                 bolTryCatch = true;
            }
        }while(bolTryCatch);
        
        do
        {
            try
            {
                //prompt user for thier community service hours
                System.out.println("How many community service hours have you completed?");
                
                //Collect hours and store in shrCommunityService
                shrCommunityService = new Scanner(System.in).nextShort();
                
                //reset bolTryCatch 
                bolTryCatch = false;
            }
            catch(Exception e)
            {
                //Error message
                System.out.println("Error. Please enter a valid number for your community service hours.");
                
                //set bolTryCatch to true to loop again
                 bolTryCatch = true;
            }
        }while(bolTryCatch);
        
        if(bytAverage >= 90 && shrCommunityService >= 100)
        {
            System.out.println("You are eligible for the scholarship!");
        }
        else if (bytAverage >= 80 && shrCommunityService >= 200)
        {
            System.out.println("You are eligible for the scholarship!");
        }
        else if (bytAverage >= 0 && shrCommunityService >= 0)
        {
           System.out.println("You are not eligible for the scholarship."); 
        }
        else
        {
          System.out.println("Error. Invalid information given");
        }
    }
}

