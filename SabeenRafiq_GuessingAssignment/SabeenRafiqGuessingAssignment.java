
/**
 * Description: This test class will call on the nessecary methods to run a fully functional game, with several possible seperate games
 *
 * @author: Sabeen Rafiq
 * @version: 2021-06-03
 */

//imoprt scanner class
import java.util.Scanner;

public class SabeenRafiqGuessingAssignment
{
    public static void main(String[] args)
    {
        
        //declare variables 
        String strUserResponse;
        boolean bolDoWhile = false; 
        byte bytNumPeople;
        
        //header 
        System.out.println("\n* * * * * * * * * * * * * * * * Guessing Game * * * * * * * * * * * * * * * *");
        
        //do while loop to ensure appropriate responses
        do
        {
            //ask player if they want to play a game and store in strUserResponse
            System.out.println("\nWould you like to play a game? (yes/no)");
            strUserResponse = new Scanner(System.in).nextLine().trim();
            
            //create instance of GuessingGame class
            GuessingGame g1 = new GuessingGame();
            
            //if the user wants to play another round then call on the methods in GuessingGame to setup and play the game
            //then reloop the question to ask if they want to play another game
            if(strUserResponse.equalsIgnoreCase("yes"))
            {
                //call on the method in GuessingGame to setup the game (get user information)
                g1.setup();
                
                //call on method in GuessingGame to play the game 
                g1.play();
                
                //set bolTryCatch to true to reloop question and reask they they want to play another game
                bolDoWhile = true;
            }
            //else if the user dosent not want to play another game, a message will be outputted, and the  loop will be exitied
            else if (strUserResponse.equalsIgnoreCase("no"))
            {
                //Output a thank you message to the user
                System.out.println("\nGreat Game! Thank you for playing!");
                
                //set bolTryCatch to false to exit loop
                bolDoWhile = false;
            }
            //else if an invalid reponse is entered, then the question will reloop with an error message
            else
            {
                //output error message
                System.out.println("Error. Invalid response entered.");
                
                //set bolTryCatch to true to reloop and ask question agian
                bolDoWhile = true;
            }
        }while(bolDoWhile);//loop do while loop while bolDoWhile is true
    }
}