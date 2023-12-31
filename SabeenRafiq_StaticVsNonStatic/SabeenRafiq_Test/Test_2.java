package SabeenRafiq_Test;

/**
 * What are get and set methods & Why do we use them?
     * Private variables can only be accessed within the same class. 
     * public get and set methods let you. 
     * The get method returns the variable value, and the set method sets the value.
 *
 * What is the difference between static and non static?
     * Keyword static which turns it into a Class method or variables
     * Class methods or variables are not invoked on objects and they do not have a current object
 * 
 * Why would you use one over the other?
     * Static methods in another class - dont need to create instance to call on it
     * Static methods in main - allows you to call on method within class by simply calling the method's name 
     * Static variables in another class - access without an object and dont reset with each instance (can make counters etc.) 
     * 
     * Non Static methods in another class - can modify things in a certain instace (eg. get and set) or do something with a specific instnance 
     * Non Static variables in another class - access through instance, each instance is a diff value or through get and set methods
     * 
     * Use one over the other based on if you want to change / acess things in a specific object or from the class as a whole  
 */

//import Scanner Class
import java.util.Scanner; 

public class Test_2
{
    public static void main(String[] args)
    {
        String strType, strColour;
        
        Shoes[] ShoeList  = new Shoes[5];

        for (int i=0; i<ShoeList.length;i++)  
        {
            System.out.println("Enter person #" + (i+1) + "'s shoe type: ");
            strType = new Scanner(System.in).nextLine();
            
            System.out.println("Enter person #" + (i+1) + "'s shoe colour: ");
            strColour = new Scanner(System.in).nextLine();
            
            ShoeList[i] = new Shoes(strType, strColour);
        }

    }
}
