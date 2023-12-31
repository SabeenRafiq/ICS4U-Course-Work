
/**
 * Write a description of class OutputToFile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

//import Arraylist class
import java.util.ArrayList;

//import Scanner class
import java.util.Scanner;

//import PrintWriter, FileWriter and IOException class from java.io
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutputToFile
{
    /**
     * Description: This method will output the finial score for one game to a file (ScoreBoard.txt) using PrintWriter
     *
     * @author: Sabeen Rafiq
     * @version: 2021-06-03
     */
    public static void printToFile(String strType)
    {
        //try catch struture 
        try
        {  
            //create the file
            PrintWriter out = new PrintWriter(new FileWriter("BankOfOntarioReceipt.txt"));
            
            //write to the file 
            
            //header
            out.println("\n* * * * * * * * * * Receipt * * * * * * * * * *\n ");
            
            //output the game number, number of rounds played, and the number of players in a round
            //Use string.format to format the output 
            out.println("\n"+userList.get());            
            out.println("Amount Withdrawed: ");
            out.println("Amount Depostited: ");
            //close the file
            out.close();
            
            //ouput message to the terminal window informing user that the ouput had been outputted to a file
            System.out.println("\nThe Receipt has been outputted to the BankOfOntarioReceipt.txt file.");
        }
        //catch any possible run time errors
        catch(IOException e)
        {
            //ouput error message to user
            System.out.println("Error cannot print to file");
            
            //header
            System.out.println("\n* * * * * * * * * * Receipt * * * * * * * * * *\n ");
            
            //output the game number, number of rounds played, and the number of players in a round
            //Use string.format to format the output 
            System.out.println(String.format("%29s%d", "Account Number: "));
            System.out.println(String.format("%29s%d", "First Name: "));
            System.out.println(String.format("%31s%d\n","Last Name: "));
            
            
            //ouput using the toString() method by traversing through the ArrayList player, and getting each element
            for(int i=0; i<player.size();i++)
            {
                System.out.println(player.get(i));
            }
            
        }   
    }
    
     /**
     * This method will create a random number and return it 
     *
     * @author Sabeen
     * @version 2021-06-14
     */
    public static int randNumGenerator()
    {
        //decalre variable to store the random number
        int intRandomNum;
        
        //create random number between 1000000000-2147483647 (2147483647 is the max range for an int)
        intRandomNum = (int)(2147483647*Math.random()+1000000000);
        
        //return the random number
        return intRandomNum;
    }
}
