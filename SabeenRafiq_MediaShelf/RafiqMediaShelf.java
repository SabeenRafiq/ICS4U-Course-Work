/**
 * Name Of Program: Media Shelf
 * Description: This program will take in a user's songs or/and movies and create a playlist accordingly by taking in the 
 * appropriate information. This is the test Class.
 *
 * @Sabeen Rafiq
 * @version 2021-05-28
 */

//Import arraylist class
import java.util.ArrayList;

//Import Scanner class
import java.util.Scanner;

public class RafiqMediaShelf
{
    public static void main (String[] args)
    {
        //declare variables
        byte bytItemCounter;
        
        //declare arraylist of type RafiqSong
        ArrayList <RafiqSong> songList = new ArrayList  <RafiqSong> ();
        
        //declare arraylist of type RafiqMovie
        ArrayList <RafiqMovie> movieList = new ArrayList  <RafiqMovie> ();

        //header
        System.out.println("\n* * * * * * * * * * * * Playlist Creator * * * * * * * * * * * * *");
        
        //call on insert method to populate the two arraylists
        //store the value of the counter of each time the user entered an item
        bytItemCounter = insert(songList, movieList);

        //if bytCounter is greater than 0 (and so had entered at least 1 item) call on remove method
        if(bytItemCounter > 0)
        {
            //call on remove method to remove elements based on what the user wants to remove
            remove(songList, movieList);
        }
        
        //call on print media method to print out the playlists
        printMedia(songList, movieList);
    }
    
    //Method to populate the arraylists with (objects) information from the user
    public static byte insert (ArrayList <RafiqSong> songList, ArrayList <RafiqMovie> movieList)
    {
        //decalre variables
        String strUserResponse, strMediaType, strTitle, strDirector, strRating, strArtist, strGenre;
        int intLength = 0;
        byte bytItemCounter=0;
        
        //declare variables for do while loops and error catching
        boolean bolTryCatch = false, bolTryCatch2 = false;
        
        //do while loop
        do
        {
            System.out.println("        - - - - - - - - - - - - - - - - - - - - - - - - -");
            
            //ask user if they want to enter an item into a playlist & populate strUserResponse with the response
            System.out.println("\nDo you want to enter an item into your playlists? (yes/no)");
            strUserResponse = new Scanner(System.in).nextLine().trim();
            
            //if-else-if else structure to do actions based on if the user wants to enter an item or not
            if (strUserResponse.equalsIgnoreCase("yes"))
            {
                //If the user enters "yes" and enters an item into a playlist, then one will be added to the counterr
                //This counter will later be used to do certain actions based on if at least one item was entered into the playlist or not
                bytItemCounter++;
                
                //do while loop
                do{
                    //Ask the user if they want to enter a song or movie and populate and populate strMediaType with the response
                    System.out.println("\nDo you want to enter a movie or song? (movie/song)");
                    strMediaType = new Scanner(System.in).nextLine().trim();
                    
                    //if the response was not a movie or a song, there will be an error message 
                    if (!(strMediaType.equalsIgnoreCase("movie") || strMediaType.equalsIgnoreCase("song")))
                    {
                        //output an error message
                        System.out.println("Error. Please enter a vaild response.");
                        
                        //set bolTryCatch2 to true to reloop the loop
                        bolTryCatch2 = true;
                    }
                    //else if the response was movie or song, then we will exit the loop
                    else
                    {
                        //set bolTryCatch2 to false to exit the loop
                        bolTryCatch2 = false;
                    }
                }while(bolTryCatch2);//loop while bolTryCatch2 is true
                
                //prompt the user to enter a title and store in strTitle
                System.out.println("\nPlease enter the title of the media");
                strTitle = new Scanner(System.in).nextLine().trim();
                
                //do while - try catch loop
                do
                {
                    try
                    {
                        //prompt the user for the length of the media and storing it in intLength
                        System.out.println("\nPlease enter the length of the media in seconds");
                        intLength = new Scanner(System.in).nextInt();
                        
                        //set bolTryCatch2 to false to exit the loop
                        bolTryCatch2 = false;
                    }
                    catch (Exception e)
                    {
                        //output error message
                        System.out.println("Error. Please enter a vaild response.");
                        
                        //set bolTryCatch2 to true and reloop and reask the question
                        bolTryCatch2 = true;
                    }
                }while(bolTryCatch2); // loop while bolTryCatch2 is true
                
                //If else loop to get the appropriate information based on the MediaType entered
                //If the media type was movie then ask for the director's name and rating
                if(strMediaType.equalsIgnoreCase("movie"))
                {
                    //prompt the user to enter the director's name and store it in strDirector
                    System.out.println("\nPlease enter the director's name");
                    strDirector = new Scanner(System.in).nextLine().trim();
                    
                    //do while loop
                    do
                    {
                        //prompt the user for the rating symbol and store in strRating
                        System.out.println("\nPlease enter the rating symbol. (F/G/PG13/PG/R)");
                        strRating = new Scanner(System.in).nextLine().trim();
                        
                        //If the strRating is not an appropriate symbol then reask the question else continue on with the code
                        if (!(strRating.equalsIgnoreCase("F") || strRating.equalsIgnoreCase("G") || strRating.equalsIgnoreCase("PG13")
                        || strRating.equalsIgnoreCase("PG") || strRating.equalsIgnoreCase("R") || strRating.equalsIgnoreCase("")))
                        {
                            //ouput error message
                            System.out.println("Error. Please enter a vaild response.");
                            
                            //Set bolTryCatch2 to true to reloop the do while loop
                            bolTryCatch2 = true;
                        }
                        else
                        {
                            //Set bolTryCatch2 as false to exit the loop
                            bolTryCatch2 = false;
                        }
                    }while(bolTryCatch2);//loop while bolTryCatch2 is true
                    
                    //If the strings entered were all empty, then call on the overloaded construtor, else call on the construtor
                    if(strTitle.isEmpty()&& strDirector.isEmpty() && strRating.isEmpty())
                    {
                        //to movielist add a new object which is created by calling the overloaded construtor
                        movieList.add(new RafiqMovie(intLength));
                    }
                    //If all strings were not empty, then call on the construor for RafiqMovie
                    else
                    {
                        //to movielist add a new object which is created by calling the construtor
                        movieList.add(new RafiqMovie(strTitle,intLength, strDirector, strRating));
                    }
                }
                //If the song type was movie then ask for the artist's name and genre
                else 
                {
                    //prompt the user for the artist's name and store the information in strArtist
                    System.out.println("\nPlease enter the artist's name");
                    strArtist = new Scanner(System.in).nextLine().trim();
                    
                    //prompt the user for the genre of the media and store the information in strGenre
                    System.out.println("\nPlease enter the genre.");
                    strGenre = new Scanner(System.in).nextLine().trim();
                    
                    //If the strings entered were all empty, then call on the overloaded construtor, else call on the construtor
                    if(strTitle.isEmpty()&& strArtist.isEmpty() && strGenre.isEmpty())
                    {
                        //to songList add a new object which is created by calling the overloaded construtor
                        songList.add(new RafiqSong(intLength));
                    }
                    //If all strings were not empty, then call on the construor for RafiqSong
                    else
                    {
                        //to songList add a new object which is created by calling the construtor
                        songList.add(new RafiqSong(strTitle,intLength, strArtist, strGenre));
                    }
                }
                
                //set bolTryCatch to true to reloop the do while loop
                bolTryCatch = true;
            }
            //If the user did not want to enter an item then output a thankyou message and exit the do while loop
            else if (strUserResponse.equalsIgnoreCase("no"))
            {
                //Output a thankyou message
                System.out.println("\nGreat! Thank you for using Playlist Creator!");
                
                //set bolTryCatch to false to exit the do while loop
                bolTryCatch = false;
            }
            else
            {
                //output an error message
                System.out.println("Error. Please enter a vaild response.");
                
                //set bolTryCatch to true to reloop the do while loop
                bolTryCatch = true;
            }
        }while(bolTryCatch);//loop while bolTryCatch is true
        
        //return bytItemCounter to the location where the method was called
        return bytItemCounter;
    }
    
    //Method to remove an element from the playlists
    public static void remove (ArrayList <RafiqSong> songList, ArrayList <RafiqMovie> movieList)
    {
        //declare variables
        String strUserResponse, strRemoveTitle; 
        boolean bolTryCatch = false, bolTryCatch1 = false;
        byte bytCounter = 0; 
        
        //do while loop
        do
        {
            //ask the user if they want to remove an item from thier playlist and populate strUserReponse with the response
            System.out.println("\nWould you like to remove an item from your playlist? (yes/no)");
            strUserResponse = new Scanner (System.in).nextLine().trim();
            
            //If the user wants to remove an item we will proceed to ask the user for information to be able to do so
            if (strUserResponse.equalsIgnoreCase("yes"))
            {
                do
                {
                    //Ask the user for the title of the item and populate strRemoveTitle with the response
                    System.out.println("\nWhat is the title of the item you want to remove?");
                    strRemoveTitle = new Scanner(System.in).nextLine().trim();
                    
                    //traverse through the song list
                    for(int i=0; i<songList.size(); i++)
                    {
                        //if the title matches the title the user entered then remove the element 
                        if (strRemoveTitle.equalsIgnoreCase(songList.get(i).getTitle())) 
                        {
                            //remove the element at index i in the songlsit arraylist
                            songList.remove(i);
                            
                            //If there is a match then add one to the bytCounter
                            
                            bytCounter++;
                            //If there is a match remove one from the static counter in the RafiqSong class to accuratly show the number
                            //of items in the playlist
                            RafiqSong.bytSongCounter --;
                        }
                    }
                    
                    //Then traverse through the movie list
                    for(int i=0; i<movieList.size(); i++)
                    {
                        //if the title matches the title the user entered then remove the element 
                        if (strRemoveTitle.equalsIgnoreCase(movieList.get(i).getTitle()))
                        {
                            //remove the element at index i in the movielist arraylist
                            movieList.remove(i);
                            
                            //If there is a match then add one to the bytCounter
                            bytCounter++;
                            
                            //If there is a match remove one from the static counter in the RafiqMovie class to accuratly show the number
                            //of items in the playlist
                            RafiqMovie.bytMovieCounter --;
                        }
                    }
                    
                    //If there was no match found in either playlist (and so the counter still equals 0)
                    //then an error message will be outputted
                    if (bytCounter == 0)
                    {
                        System.out.println("Error. No matches found. Please enter a valid title.");
                        //Set bolTryCatch1 to true to loop the do while loop
                        bolTryCatch1 = true;
                    }
                    //else a message will be outputted
                    else
                    {
                        System.out.println("\nItem Removed Succesfully.");
                        //Set bolTryCatch to false to exit the do while loop
                        bolTryCatch1 = false;
                    }
                }while(bolTryCatch1);
                //Set bolTryCatch to true to loop the do while loop
                bolTryCatch = true;
            }
            //Else if the user does not want to remove an element, then a message will be outtputted and then will exit the loop
            else if (strUserResponse.equalsIgnoreCase("no"))
            {
                System.out.println("Great!");
                
                //set bolTryCatch to false to exit the do while loop
                bolTryCatch = false;
            }
            //else an error message will be outputted and will reloop the question
            else
            {
                System.out.println("Error. Please enter a vaild response.");
                
                //Set bolTryCatch to true to loop the do while loop
                bolTryCatch = true;
            }
        }while(bolTryCatch); //loop while bolTryCatch is true
    }
    
    //a method to ouput the playlists
    public static void printMedia (ArrayList <RafiqSong> songList, ArrayList <RafiqMovie> movieList)
    {
        //Declare variable
        String strUserResponse;
        boolean bolTryCatch;
        byte bytRandomNum1, bytRandomNum2;
        
        //header for the output
        System.out.println("\n* * * * * * * * * * * * Your Playlist! * * * * * * * * * * * * *"); 
        
        //output what type of playlist it is and the number of items there are in it
        System.out.println("\nMovies: " + RafiqMovie.bytMovieCounter+" items");
        
        //if there are no items in the playlsit it will output that no items were entered
        if (RafiqMovie.bytMovieCounter == 0)
        {
            System.out.println("\n\tNo items were entered into this playlist.");
        }
        //else if there are items in the playlist it will output all the items in the playlist
        else
        {
            //traverse through the whole arraylist and ouput the information using the toString method
            for(int i=0; i<movieList.size(); i++)
            {
                System.out.println("\n\t#" + (i+1));
                System.out.println(movieList.get(i));
            }
        }
        
        //output what type of playlist it is and the number of items there are in it
        System.out.println("\nSongs: " + RafiqSong.bytSongCounter + " items");
        
        //if there are no items in the playlsit it will output that no items were entered
        if (RafiqSong.bytSongCounter == 0)
        {
            System.out.println("\n\tNo items were entered into this playlist.");
        }
        //else if there are items in the playlist it will output all the items in the playlist
        else
        {
            //traverse through the whole arraylist and output the information using the toString method
            for(int i=0; i<songList.size(); i++)
            {
                System.out.println("\n\t#" + (i+1));
                System.out.println(songList.get(i));
            }
        }
        
        //Do while loop 
        do{
            //Ask the user if they want to see their "daily pick" and populate the response in strUserResponse
            System.out.println("\nDo you want to view your daily pick?");
            strUserResponse = new Scanner(System.in).nextLine().trim();
            
            //If the user wants to see the pick then it will ouput it, else it will output a message and exit the loop
            if(strUserResponse.equalsIgnoreCase("yes"))
            {
                //calculate a random number between 0-the size of the playlist using math.random  
                bytRandomNum1 = (byte)(movieList.size()*Math.random());
                bytRandomNum2 = (byte)(songList.size()*Math.random());

                //If there were no elements in the movie list then it will ouput thaat no movies were entered
                if(movieList.size() == 0)
                {
                    System.out.println("\nMovie:\n \tNo movies were entered.");
                }
                //else it will output a random movie from the user's playlist
                else
                {
                    System.out.println("\nMovie:\n" + movieList.get(bytRandomNum1));
                }
                
                //If there were no elements in the song list then it will ouput thaat no song were entered
                if(songList.size() == 0)
                {
                    System.out.println("\nSong:\n \tNo songs were entered.");
                }
                //else it will output a random song from the user's playlist
                else
                {
                    System.out.println("\nSong:\n" + songList.get(bytRandomNum2));
                }             
                
                //set bolTryCatch to false to exit the do while loop
                bolTryCatch = false;
            }
            else if (strUserResponse.equalsIgnoreCase("no"))
            {
                //Output a thankyou message to the user 
                System.out.println("\nGreat! Thank you for using Playlist Creator!");
                
                //set bolTryCatch to false to exit the do while loop
                bolTryCatch = false;
            }
            else
            {
                //output an error message
                System.out.println("Error. Please enter a vaild response.");
                
                //set bolTryCatch to true to loop the do while loop to get a valid response
                bolTryCatch = true;
            }
        }while(bolTryCatch); //Loop while bolTryCatch is true
        
        System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
    }
}
