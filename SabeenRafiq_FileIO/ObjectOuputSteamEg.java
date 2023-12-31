
/**
 * Write a description of class ObjectOuputSteamEg here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.io.*;

public class ObjectOuputSteamEg implements java.io.Serializable 
{
    public static void main(String[] args)
    {
        try
        {
            BankAcc aBankAcc;
            
            //declare variable of type ObjectOuputStream
            ObjectOutputStream out;
            
            //create instace of bankacc
            aBankAcc = new BankAcc("Sabeen", 45.34f, 34234);
            
            //creat einstace of objectoutputsteam anf connect to a file
            out = new ObjectOutputStream (new FileOutputStream("myAcc.txt"));
            
            //write to the file
            out.writeObject(aBankAcc);
            
            out.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Error. Cannot open file for reading");
        } 
        catch(IOException e)
        {
            System.out.println("Cannot read file");
        }
    }
}
