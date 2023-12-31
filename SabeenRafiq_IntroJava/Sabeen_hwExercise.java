 /**
 * Description: This program will input the users name and ouput a message along with 
 * taking in thier age and outputing thier age in minutes
 *
 * @author Sabeen Rafiq
 * @version April 20th, 2021
 */

//import Scanner class from the java library
import java.util.Scanner; 

public class Sabeen_hwExercise {
     public static void main(String[] args) {
         //delcare varaible for users name
         String strName;
         
         //delcare varaible for users age
         Byte bytAge;
         
         //delcare varaible for users age in minutes
         int intAgeMins;
         
         //prompt user for thier name 
         System.out.println("Hello! What is your name?");
         
         //get name and store in variable
         strName = new Scanner(System.in).next();
        
         //output the message with the user name
         System.out.println("Hello " + strName+ "!");
         
         //prompt user for thier age 
         System.out.println("What is your age?");
         
         //get age and store in variable
         bytAge = new Scanner(System.in).nextByte();
         
         //calculate the users age in minutes (age* minutes per day * days in a year)
         intAgeMins = bytAge * 1440 * 365;
         
         //output the users age in minutes
         System.out.println("You are " +intAgeMins+ " minutes old!");
     }
}

