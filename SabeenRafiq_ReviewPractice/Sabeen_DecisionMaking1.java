/**
 * Name Of Program:
 * Description: This program will 
 *
 * @author Sabeen Rafiq
 * @start April 22nd, 2021
 * @end April 22nd, 2021
 */

//import the Scanner class
import java.util.Scanner;

public class Sabeen_DecisionMaking1
{
    public static void main(String[] args)
    {
        //Clear the terminal window 
        System.out.print('\u000C');
        
        //Declare a varaible to store the user's month
        String strMonth; 
        
        //prompt user for the month 
        System.out.println("Enter a month to know the number of days in it");
        
        //get string from user and store in strMonth
        strMonth = (new Scanner(System.in).nextLine()).toLowerCase();
        
        //Switch class to tell how many days there are in the month 
        switch(strMonth)
        {
         case "january":
             System.out.println("There are 31 days in " + strMonth);
             break;
         case "febuary":
             System.out.println("There are 28 days in " + strMonth + " if its not a leap year");
             break; 
         case "march":
             System.out.println("There are 31 days in " + strMonth);
             break;
         case "april":
             System.out.println("There are 30 days in " + strMonth);
             break;
         case "may":
             System.out.println("There are 31 days in " + strMonth);
             break;
         case "june":
             System.out.println("There are 30 days in " + strMonth);
             break;
         case "july":
             System.out.println("There are 31 days in " + strMonth);
             break;
         case "august":
             System.out.println("There are 31 days in " + strMonth);
             break;
         case "september":
             System.out.println("There are 30 days in " + strMonth);
             break;
         case "october":
             System.out.println("There are 31 days in " + strMonth);
             break;
         case "november":
             System.out.println("There are 30 days in " + strMonth);
             break;
         case "december":
             System.out.println("There are 31 days in " + strMonth);
             break;
         default: 
             System.out.println("Error. Invalid Month entered.");
        }

        

    }
}
