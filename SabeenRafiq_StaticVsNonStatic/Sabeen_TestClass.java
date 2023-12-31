
/**
 * Description: this class creates instances of the Person class
 *
 * @author Sabeen
 * @version 10th May 2021
 */

//import Scanner Class
import java.util.Scanner; 

public class Sabeen_TestClass
{
    public static void main(String[] args)
    {
        //Clear the terminal window 
        System.out.print('\u000C');
        
        //declare varaibles to store number of people and thier infomation (name and age)
        boolean bolTryCatch = false;
        byte bytNumPeople = 0, bytAge=0; 
        String strFName, strLName, strNewFName, strYN;
        
        //create varaible to hold of type Person (declare only)
        Person[] PeopleList;
        
        //do  while loop to loop the try and catch to prompt for correct input 
        do
        {
            try
            {
                //prompt the user to enter how many instance of the person class they would like 
                System.out.println("How many people would you like to add today?");
                bytNumPeople = new Scanner(System.in).nextByte();
                
                //update bolTryCatch to false to break the loop and reset the varaible
                bolTryCatch = false;
            }
            catch(Exception e)
            {
                //Error message
                System.out.println("Error please enter as a number.");
                
                //Try in order to loop the the prompt again 
                bolTryCatch = true; 
            }
        }while(bolTryCatch);
        
        //initialze array of type person to the number of elements stated by the user 
        PeopleList = new Person[bytNumPeople];
        
        //loop through the array to get and populate array and create the instace using construtor 
        for (int i=0; i<bytNumPeople;i++)
        {
            //prompt the user 
            System.out.println("\nEnter person #" + (i+1) + "'s first name");
            
            //populate varaible with first name in order to send it into the construtor 
            strFName = new Scanner(System.in).nextLine();
            
            //prompt the user 
            System.out.println("Enter person #" + (i+1) + "'s last name");
            
            //populate varaible with last name in order to send it into the construtor 
            strLName = new Scanner(System.in).nextLine();
            
            //loop try catch block to avoid runtime error for wrong data type
            do
            {
                try
                {
                    //prompt the user 
                    System.out.println("Enter person #" + (i+1) + "'s age");
                    
                    //populate varaible with age in order to send it into the construtor 
                    bytAge = new Scanner(System.in).nextByte();
                    
                    //reset bolTryCatch to false to break the loop and reset the varaible
                    bolTryCatch = false;
                }
                catch(Exception e)
                {
                    //ouput error message
                    System.out.println("Error please enter as a number.");
                    
                    //set bolTryCatch to true to loop back and ask user
                    bolTryCatch = true; 
                }
            }while(bolTryCatch);
            
            //check to see what varaibles have values then call either the construtor or overloaded construtor  
            if(strFName.isEmpty() && strLName.isEmpty())
            {
                //if names are empty - only sending in age and calling overloaded method 
                PeopleList[i] = new Person(bytAge);
            }
            else
            {
                //creating instance of Person calss using constructor 
                PeopleList[i] = new Person(strFName, strLName, bytAge);
            }
        }
        
        //ouput the array of Person class using a for each loop
        for(Person p: PeopleList)
        {
            System.out.println(p);
        }
         
    }
}