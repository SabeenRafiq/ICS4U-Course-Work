 /**Name Of Program:
 * Description: This program will tell you the number of days in a given month
 *
 * @author Sabeen Rafiq
 * @start April 21st, 2021
 * @end April 21st, 2021
 */

//import Scanner class
import java.util.Scanner; 

public class Sabeen_Excersise3 
{
    public static void main(String[] args) 
    {
    //Clear the terminal window 
        System.out.print('\u000C');
        
        //declare variable to store user's temp
        int intMonth = 0; 
        
        //declare variable to store the number of days in the month
        int intDays = 0; 
        
        //declare variable to store the year
        int intYear = 0;
        
        //declare a boolean variable to loop the try catch block
        boolean bolTryCatch = false;
        
        //do while loop to loop the try catch for the user to enter the correct value
        do
        {
           //add try and catch block
           try{
                //prompt user for month
                System.out.println("Enter a month in it's numerical value: ");
                
                //store user's grade
                intMonth = new Scanner(System.in).nextInt();
                
                //reset bolTryCatch
                bolTryCatch = false;
            }
           catch(Exception e)
            {
                //output message to user
                System.out.println("Error. Please enter a the month's numerical value.");
                
                //set bolTryCatch to true to loop again
                bolTryCatch = true;
            }
        }while(bolTryCatch);//while loop as long as bolTryCatch equals true
        
        //do while loop to loop the try catch for the user to enter the correct value
        do
        {
           //add try and catch block
           try{
                //prompt user for year
                System.out.println("Enter the year:");
                
                //store user's year
                intYear = new Scanner(System.in).nextInt();
                
                //reset bolTryCatch
                bolTryCatch = false;
            }
           catch(Exception e)
            {
                //output message to user
                System.out.println("Error. Please enter a valid year.");
                
                //set bolTryCatch to true to loop again
                bolTryCatch = true;
            }
        }while(bolTryCatch);//while loop as long as bolTryCatch equals true
        
        //if a month with 30 days
        if(intMonth == 4 || intMonth == 6 || intMonth == 9 || intMonth == 11)
        {
            intDays = intMonth * 30; 
        }
        //if feburay
        else if (intMonth == 2)
        {
            intDays = 28; 
            //if feburay and deiviable by 4 and a end decade year(so must be divisable by 400)
            if (intYear % 4 == 0 && intYear % 100 == 0 && intYear % 400 == 0)
            {
                intDays = 29; 
            }
            //if divisable by 4 and not a end decade year
            else if (intYear % 4 == 0 && intYear % 100 == 1)
            {
                intDays = 29; 
            }
        }
        //if a month with 31 days
        else
        {
            intDays = intMonth * 31;
        }
        
        //Output for the user on the number of days in the month
        System.out.println("This month has "+ intDays +" days!");

    }
}
