
/**
 * Description: This class has methods with function which allows the setup, game play and printing out of a guessing game
 *
 * @author: Sabeen Rafiq
 * @version: 2021-06-03
 */

//import Arraylist class
import java.util.ArrayList;

//import Scanner class
import java.util.Scanner;

//import PrintWriter, FileWriter and IOException class from java.io
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GuessingGame
{
    //delcare private instace variables to store the user's input ( and variables needed in construtors)
    private byte bytGuess, bytRandomNum;
    private String strFName, strLName;
    
    //decalre private instace variables for error catching, if else statments, updating variable's information 
    //and count the number of rounds played in a single game
    private String strUserResponse, strUserResponseYN, strUserGuessOutput = "", strUserRespInfo;
    private boolean bolDoWhile = false, bolDoWhile2 = false, bolDoWhile3 = false, bolDoWhile4 = false;
    private byte bytNumRounds = 0;
    
    //static variable to counter the number of games played
    static byte bytGameCounter = 0;
    
    //delcare arraylsit to hold the list of current players (object)
    ArrayList <Player> player = new ArrayList<Player>();
    
    //default constructor  
    GuessingGame()
    {
        this.bytGuess = 0;
        this.bytRandomNum = 0;
    }
    
    /**
     * Description: This method will add all players for 1 game. It will store the players in the ArrayList players.
     *
     * @author: Sabeen Rafiq
     * @version: 2021-06-03
     */
    public void setup()
    {
        //counter to count the game #
        this.bytGameCounter++;
        
        //header
        System.out.println("\n\t      - - - - - - - - - - - Setup - - - - - - - - - - -");
        
        //do while loop to ensure appropirate input 
        do
        {
            //ask the user if they want to enter a player and store reponse in strUserResponse
            System.out.println("\nWould you like to enter a player? (yes/no)");
            this.strUserResponse = new Scanner(System.in).nextLine().trim();
        
            //if the user wants to enter a player, then adk for the player's information and send it to a construtor 
            if(this.strUserResponse.equalsIgnoreCase("yes"))
            {
                //prompt the user to enter the player's (player number is equal to the size of the player list +1)
                //first name and store in strFName
                System.out.println("\nEnter player #" + (player.size()+1) + "'s first name: ");
                this.strFName = new Scanner(System.in).nextLine().trim();
                
                //prompt the user to enter the player's (player number is equal to the size of the player list +1)
                //last name and store in strLName
                System.out.println("\nEnter player #" + (player.size()+1) + "'s last name: ");
                this.strLName = new Scanner(System.in).nextLine().trim();
                
                //if the strings both are empty, then call on the default construtor
                if(this.strFName.isEmpty() && this.strLName.isEmpty())
                {
                    //call on Player's default construtor and store obejct in the player ArrayList player
                    player.add(new Player());
                }
                //else send the information into the construtor
                else
                {
                    //send information into player's construtor and store the object in ArrayList player
                    player.add(new Player(strFName, strLName));
                }
                
                //call on UpdateNameInfo method to update the first and last name if the user wants to
                updateNameInfo();
                
                //set bolTryCatch to true to reloop question and reask they they want to add another player
                this.bolDoWhile = true;
            }
            //if the user doesn't want to enter a player, but there are 0 players total, then an error message will be 
            //outputted and the loop will reloop
            else if (this.strUserResponse.equalsIgnoreCase("no") && player.size() == 0)
            {
                //output error message
                System.out.println("Error. No player were added. Please enter a player.");
                
                //set bolTryCatch to true to reloop and ask question agian
                this.bolDoWhile = true;
            }
            //else if the user dosn't want to enter a new player, then the loop will be exited
            else if (this.strUserResponse.equalsIgnoreCase("no"))
            {
                //set bolTryCatch to false to exit loop
                this.bolDoWhile = false;
            }
            //else incorrect input was entered, and the loop will reloop
            else
            {
                //output error message
                System.out.println("Error. Invalid response entered.");
                
                //set bolTryCatch to true to reloop and ask question agian
                this.bolDoWhile = true;
            }
        }while(this.bolDoWhile);//loop do while loop while bolDoWhile = true
    }
    
    /**
     * Description: This method will play the game with the user by creating a random number, and comparing the user's guess to it
     * this class allows for multiple rounds to be played of the game
     *
     * @author: Sabeen Rafiq
     * @version: 2021-06-03
     */
    public void play()
    {
        //header
        System.out.println("\n\t    - - - - - - - - - - - Gameplay - - - - - - - - - - -");
        
        //ouput instructions to players
        System.out.print("\nInstructions: The computer will generate a random whole number between 1-10. You will guess a " +
        "\nnumber to match the computer's number between 1-10. Each time a player guesses's the "+
        "\ncomputer's number correctly, their score will increase by one. The final score for each game will "+
        "\nbe outputted to a file called ScoreBoard.txt.\n\n");
         
        //do while loop to ensure appropriate input is entered 
        do
        {
            //add one to the bytNumRounds counter to count how many rounds are played
            this.bytNumRounds++;
            
            //reset strUserGuessOutput to empty
            //this variable to used to store the output after each round for which player guessed correctly or incorrectly
            this.strUserGuessOutput = "";
            
            //calculate random number between 1-10 and store as a byte
            this.bytRandomNum = (byte)(10*Math.random() + 1);
            
            //loop asking the user's for their guess 
            for(int i=0; i<player.size();i++)
            {
                //do while - try catch loop to insure appropirate input from the user
                do
                {
                    try
                    {
                        //prompt user to enter thier guess (based on their name) and store in bytGuess
                        System.out.println("\n"+player.get(i).getFName() +"'s Guess: ");
                        this.bytGuess = new Scanner(System.in).nextByte();
 
                        //if the guess enter was outside of the range of 1-10, then reask the user to enter a guess
                        if (this.bytGuess > 10 || this.bytGuess < 1)
                        {
                            //Output an error message to user
                            System.out.println("\nError. Invalid guess entered. Please enter a whole numeric value between 1-10");
                            
                            //set bolDoWhile2 to true to reloop the prompt
                            this.bolDoWhile2 = true;
                        }
                        //if the guess was within the range then...
                        else
                        {
                            //call on method to update the guess entered if the user wants to
                            updateGuessInfo();
                            
                            //check if updated guess was outside the range of 1-10
                            if (this.bytGuess > 10 || this.bytGuess < 1)
                            {
                                //Output an error message to user
                                System.out.println("\nError. Invalid guess entered. Please enter a whole numeric value between 1-10");
                                
                                //set bolDoWhile2 to true to reloop the prompt
                                this.bolDoWhile2 = true;
                            }
                            //if its within the paramenters, then exit the do while loop
                            else
                            {
                                //set bolDoWhile2 to false to exit the loop
                                this.bolDoWhile2 = false;
                            }
                        }
                    }
                    catch(Exception e)
                    {
                        //Output error message to user
                        System.out.println("\nError. Invalid guess entered. Please enter a whole numeric value between 1-10");
                    
                        //set bolDoWhile2 to true to reloop the do while loop
                        this.bolDoWhile2 = true;
                    }   
                }while(this.bolDoWhile2);//loop the do while loop while bolDoWhile2 is true
                
                //if the number is between 1-10 and the guess matches the computer's number...
                if (this.bytGuess == this.bytRandomNum)
                {
                    //to strUserGuessOutput add that the player (name) got the guess correct
                    this.strUserGuessOutput += "\n\t"+player.get(i).getFName() + " Guessed Correctly!";
                    
                    //update score by 1 by getting the current score and adding one to it
                    //then updating the score with the new score 
                    player.get(i).setScore((byte)(player.get(i).getScore()+1));
                }
                //if the number entered was between 1-10 and the guess did not match the computer's number..
                else if (this.bytGuess < 11 && this.bytGuess > 0)
                {
                    //to strUserGuessOutput add that the player (name) got the guess incorrect
                    this.strUserGuessOutput += "\n\t"+player.get(i).getFName() + " Guessed Incorrectly. Better luck next time!";
                }
            }
            
            //Ouput the results (whether the user got the guess correct or not) using strUserGuessOutput
            //which had the user's results stored in it from above
            System.out.println("\nResults:"+this.strUserGuessOutput + "\n");
            
            //do while loop to ensure appropirate input
            do
            {
                //ask the user if they want to play another round, and store the repsonse in strUserResponse
                System.out.println("\nDo you want to play another round? (yes/no)");
                this.strUserResponse = new Scanner (System.in).nextLine().trim();
                
                //if the user wants to play another round...
                if (this.strUserResponse.equalsIgnoreCase("yes"))
                {
                    //set bolDoWhile2 to false to exit the question's loop
                    this.bolDoWhile2 = false;
                    
                    //set bolDoWhile to true to reloop the code in the loop to allow a new round to be played
                    //(this includes code from when the computer genetrated the random number till this if statment)
                    this.bolDoWhile = true; 
                }
                //if the user doesn't want to play another round....
                else if (this.strUserResponse.equalsIgnoreCase("no"))
                {
                    //call on printToFile() to ouput the finial score to a file for the game
                    this.printToFile();
                    
                    //set bolDoWhile2 to false to exit the question's loop
                    this.bolDoWhile2 = false;
                    
                    //set bolDoWhile to false to exit the do while loop (for rounds)
                    this.bolDoWhile = false;
                }
                else
                {
                    //ouput error message to user
                    System.out.println("Error incorrect input entered.");
                    
                    //bolDoWhile2 to reloop the question
                    this.bolDoWhile2 = true;
                }
            }while(this.bolDoWhile2);//loop while bolDoWhile2 is true
        }while(this.bolDoWhile);//loop while bolDoWhile is true
    }
    
    /**
     * Description: This meathod will update the first or last name based on what the user wants
     *
     * @author: Sabeen Rafiq
     * @version: 2021-06-03
     */
    public void updateNameInfo()
    {
        //do while loop 
        do
        {
            //ask the user if the ifnoramtion entered is correct
            //get the current first and last name by getting the last index in the player arraylist and call on the get methods 
            //for each string and store response in strUserResponseYN
            System.out.println("\nIs the information ("+ player.get(player.size()-1).getFName()  + " "+ player.get(player.size()-1).getLName() +") entered correct? (yes/no)");
            this.strUserResponseYN = new Scanner(System.in).nextLine().trim();
            
            //if the information is correct...
            if(this.strUserResponseYN.equalsIgnoreCase("yes"))
            {
                //output message to user
                System.out.println("\nGreat!");
                
                //set bolDoWhile2 to false to exit the do while loop
                this.bolDoWhile2 = false;
            }
            //if the information is not correct...
            else if(this.strUserResponseYN.equalsIgnoreCase("no"))
            {
                //do while loop
                do
                {
                    //prompt user to enter what peice of information was wrong and store in strUserRespInfo
                    System.out.println("\nWhat peice of information is incorrect? (first/last)");
                    this.strUserRespInfo = new Scanner(System.in).nextLine().trim();
                    
                    //if the first name is incorrect...
                    if(this.strUserRespInfo.equalsIgnoreCase("first"))
                    {
                        //prompt the user to enter the correct first name and store in strFName
                        System.out.println("\nEnter the correct first name: ");
                        this.strFName = new Scanner(System.in).nextLine().trim();
                        
                        //if the string entered was empty then store it as Unknown
                        if(this.strFName.isEmpty())
                        {
                            this.strFName = "Unknown";
                        }
                        
                        //set the first name to the updated first name
                        //this is done by getting the last added element in player and use the set method to update the first name
                        player.get(player.size()-1).setFName(this.strFName);
                        
                        //set bolDoWhile to false to exit loop
                        this.bolDoWhile = false;
                    }
                    //if the last name is incorrect...
                    else if(this.strUserRespInfo.equalsIgnoreCase("last"))
                    {
                        //prompt the user to enter the last name and store in strLName
                        System.out.println("\nEnter the correct last name: ");
                        this.strLName = new Scanner(System.in).nextLine().trim();
                        
                        //if strLName is empty then update it to Unknown
                        if(this.strLName.isEmpty())
                        {
                            this.strLName = "Unknown";
                        }
                        
                        //set the first name to the updated first name
                        //this is done by getting the last added element in player and use the set method to update the last name
                        player.get(player.size()-1).setLName(this.strLName);
                        
                        //set bolDoWhile to false to exit the loop
                        this.bolDoWhile = false;
                    }
                    //else if the option entered is invalid..
                    else
                    {
                        //Output error message
                        System.out.println("Error. Incorrect response entered.");
                        
                        //set bolDoWhile to true to re ask the question
                        this.bolDoWhile = true;
                    }
                }while(this.bolDoWhile);//loop the loop while bolDoWhile is true
                
                //set bolDoWhile2 to true to reask the question 
                this.bolDoWhile2 = true;
            }
            //else if invalid input was entered...
            else
            {
                //output error message
                System.out.println("Error. Incorrect input entered.");
                
                //set bolDoWhile2 to true to reask the question
                this.bolDoWhile2 = true;
            }
        }while(this.bolDoWhile2);//loop the loop while bolDoWhile2 is true
    }
    
     /**
     * Description: This meathod will update the user's guess based on if the user entered incorrect info or not
     *
     * @author: Sabeen Rafiq
     * @version: 2021-06-03
     */
    
    public void updateGuessInfo()
    {
        //do while loop  
        do
        {
            //ask the user if the information entered is correct and store in strUserResponseYN
            System.out.println("\nIs the guess ("+bytGuess +") entered correct? (yes/no)");
            this.strUserResponseYN = new Scanner(System.in).nextLine().trim();
            
            //if the information is correct then...
            if(this.strUserResponseYN.equalsIgnoreCase("yes"))
            {
                //Output message to uesr
                System.out.println("\nGreat!");
                
                //set bolDoWhile to false to exit loop
                this.bolDoWhile = false;
            }
            //if the information is incorrect...
            else if(this.strUserResponseYN.equalsIgnoreCase("no"))
            {
                //do while - try catch loop to ensure appropriate input
                do
                {
                    try
                    {
                        //prompt the user to enter the correct guess and store as bytGuess
                        System.out.println("\nEnter the correct guess: ");
                        this.bytGuess = new Scanner(System.in).nextByte();
                        
                        //set bolDoWhile2 to false to exit loop
                        this.bolDoWhile2 = false;
                        
                        //if the guess is outside the range of 1-10
                        if(this.bytGuess >10 || this.bytGuess <1)
                        {
                            //output error message
                            System.out.println("Error. Invalid input entered.");
                            
                            //set bolDoWhile2 to true to reloop the question
                            this.bolDoWhile2 = true;
                        } 
                    }catch(Exception e)
                    {
                        //output error message
                        System.out.println("Error. Invalid input entered.");
                        
                        //set bolDoWhile2 to true to reloop the question
                        this.bolDoWhile2 = true;
                    }
                }while(this.bolDoWhile2);//loop the do while - try catch loop while bolDoWhile4 is true
                
                //set bolDoWhile to true to reloop the question - if the information entered is correct or not
                this.bolDoWhile = true;
            }
            else
            {
                //output error message
                System.out.println("Error. Incorrect input entered.\n");
                
                //set bolDoWhile to true to reloop the question
                this.bolDoWhile = true;
            }
        }while(this.bolDoWhile);//loop the do while loop while bolDoWhile is true
    }
    
    /**
     * Description: This method will output the finial score for one game to a fiel (ScoreBoard.txt) using PrintWriter
     *
     * @author: Sabeen Rafiq
     * @version: 2021-06-03
     */
    public void printToFile()
    {
        //try catch struture 
        try
        {  
            //create the file
            PrintWriter out = new PrintWriter(new FileWriter("ScoreBoard.txt"));
            
            //write to the file
            
            //header
            out.println("\n* * * * * * * * * * Score Board * * * * * * * * * *\n ");
            
            //output the game number, number of rounds played, and the number of players in a round
            //Use string.format to format the output 
            out.println(String.format("%29s%d", "Game #: ", this.bytGameCounter));
            out.println(String.format("%29s%d", "Round #: ", this.bytNumRounds));
            out.println(String.format("%31s%d\n","# of Players: ", player.size()));
            
            
            //ouput using the toString() method by traversing through the ArrayList player, and getting each element
            for(int i=0; i<player.size();i++)
            {
                out.println(player.get(i));
            }
            
            //close the file
            out.close();
            
            //ouput message to the terminal window informing user that the ouput had been outputted to a file
            System.out.println("\nThe Score Board has been outputted to the ScoreBoard.txt file.");
        }
        //catch any possible run time errors
        catch(IOException e)
        {
            //ouput error message to user
            System.out.println("Error cannot print to file");
            
            //if there is an error it will output to the termial window
            System.out.println("\n* * * * * * * * * * Score Board * * * * * * * * * *\n ");
            
            //output the game number, number of rounds played, and the number of players in a round
            //Use string.format to format the output 
            System.out.println(String.format("%29s%d", "Game #: ", this.bytGameCounter));
            System.out.println(String.format("%29s%d", "Round #: ", this.bytNumRounds));
            System.out.println(String.format("%31s%d\n","# of Players: ", player.size()));

            //ouput using the toString() method by traversing through the ArrayList player, and getting each element
            for(int i=0; i<player.size();i++)
            {
                System.out.println(player.get(i));
            }
        }   
    }
}

