/**
 * Name Of Program: Methods
 * Description: This program will proactice writing and using methods  
 * by calculating tax
 *
 * @author Sabeen Rafiq
 * @start April 26th, 2021
 * @end April 26th, 2021
 */

//import Scanner class
import java.util.Scanner; 

public class Sabeen_Methods
{
    public static void main(String[] args)
    {
        //Clear the terminal window 
        System.out.print('\u000C');
        
        //delcare variable to store price of item from user and the price with tax
        float fltPrice = 0, fltPriceWTax;
        
        //declare boolean to loop try and catch block 
        boolean  bolTryCatch = false;
        
        //loop the try and catch block to prompt user for correct data type
        do
        {
            //try and catch block to catch run time error for wrong data type 
            try
            {
                //prompt the user for a price 
                System.out.println("Please enter the price of your item");
                
                //populate flotr varaible with price
                fltPrice = new Scanner(System.in).nextFloat();
                
                //reset bolTryCatch to false to break loop
                bolTryCatch = false;
            }
            catch(Exception e)
            {
                //let user know they have entered the wrong data type 
                System.out.println("Error. Wrong data type. \nPlease enter a number");
                
                //set bolTryCatch to true to loop and prompt again
                bolTryCatch = true;
            }
        }while(bolTryCatch);
        
        //call CalTac method - sending in price as a parameter 
        //CalTax(fltPrice);
        
        
        //call CalTac non-void method - sending in price as a parameter 
        fltPriceWTax = CalTax(fltPrice);
        
        
        //output price with tax to 2 decimal places
        System.out.printf("The price of your item with tax is $%.2f", fltPriceWTax);
    }
    
    //create non-void method to take in the price and sends back the calculated tax
    public static float CalTax(float fltPrice)
    {
        //delcare constant for tax
        final float TAX_RATE = 0.13f; 
        
        //declare variable to store price with tax 
        float fltPriceTax;
        
        //calculate price inclucdeing tax 
        fltPriceTax = fltPrice*(1+TAX_RATE);
        
        //return the price with tax to where the methods was called
        return fltPriceTax;
    }
    
    
    /*
    //create method to take in the price and calculate tax
    public static void CalTax(float fltPrice)
    {
        //delcare constant for tax
        final float TAX_RATE = 0.13f; 
        
        //declare variable to store price with tax 
        float fltPriceTax;
        
        //calculate price inclucdeing tax 
        fltPriceTax = fltPrice*(1+TAX_RATE);
        
        //output to 2 decimal places
        System.out.printf("The price of your item with tax is $%.2f", fltPriceTax);
    }
    */
   
   
}






















