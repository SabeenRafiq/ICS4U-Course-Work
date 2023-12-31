import java.io.*;

import java.util.*;

public class ScannerFileIO
{
    public static void main(String[] args)
    {
        try
        {
            //declare a car of type bnkacc
            BnkAccount aBnkAccount;
            
            //var for file info
            String strName;
            int intAccount;
            float fltBalance;
            
            //declare variable of type scanner and connect to specific file
            Scanner in = new Scanner(new FileReader("myAccount.txt"));
            
            //populate var using scanner
            strName = in.nextLine();
            intAccount = in.nextInt();
            fltBalance = in.nextFloat();
            
            aBnkAccount = new BnkAccount(strName,fltBalance,intAccount);
            
            System.out.println(aBnkAccount);
            
            in.close();
        }
        //if reading from a file
        catch(FileNotFoundException e)
        {
            System.out.println("Error. Cannot open file for reading");
        }
        catch(NoSuchElementException e)
        {
            System.out.println("Error. No such element exists");
        }   
        catch(IOException e)
        {
            System.out.println("Cannot read file");
        }
    }
}
