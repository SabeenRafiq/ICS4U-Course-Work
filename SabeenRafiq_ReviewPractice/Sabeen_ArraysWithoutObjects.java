/**
 * Name Of Program:Types Of Data Practice
 * Description: This program will 
 *
 * @author Sabeen Rafiq
 * @start April 22nd, 2021
 * @end April 22nd, 2021
 */

public class Sabeen_ArraysWithoutObjects
{
    public static void main(String[] args)
    {
        //Clear the terminal window 
        System.out.print('\u000C');
        
        //declare the array with space for 12 int
        int [] Numbers = new int [12];
        
        //populating array with random integers        
        for(int i=0; i< Numbers.length; i++) 
        {
            Numbers[i]= (int)(100*Math.random())+1;
        }
        
        //print out array with for each loop
        for(int x: Numbers)
        {
            System.out.println(x);
        }

    }
}
