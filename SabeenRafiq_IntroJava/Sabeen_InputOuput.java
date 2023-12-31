
/**
 * Description: This program will bring in the users name and output a message
 *
 * @author Sabeen Rafiq
 * @version April 20th, 2021
 */
//import Scanner class from the java library
import java.util.Scanner; 

public class Sabeen_InputOuput {
  public static void main(String[] args) {
        //declare variable to store users name
        String strName;
        
        //declare variable to store users age
        byte bytAge;
        
        //Prompt user to enter thier name and store it in the variable 
        System.out.println("What is your name?");
        
        //get name using scanner and save in a variable 
        strName = new Scanner(System.in).next();
        
        //prompt user to enter their age
        System.out.println("What is your age?");
        
        //populate variable using scanner and parse to a byte
        bytAge = new Scanner(System.in).nextByte();
        
        //output message using data
        System.out.println("Hi, "+ strName+ ". I can't believe you are " + bytAge+ " years old.");
  }
}
