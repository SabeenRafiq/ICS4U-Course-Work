//import io class to use bufferedReader
import java.io.*;

public class BufferReaderClass
{
    public static void main(String[] args)
    {
        try{   
            //declare varaible of type Bank account
            BankAccount aBankAccount;
               
            //declare a variable of type BufferedReader
            BufferedReader in;
            
            //decalre varaibles to hold information from the user
            String strName;
            int intAccount;
            float fltBalance;
            
            //creaate instace of bufferedReader and connect it to an existing file
            in = new BufferedReader(new FileReader("myAccount.txt"));
            
            //populate the varables with info from the file 
            strName = in.readLine();
            intAccount = Integer.parseInt(in.readLine());
            fltBalance = Float.parseFloat(in.readLine());
            
            //use construtor to populate the instace variables in the class
            aBankAccount = new BankAccount(strName, fltBalance, intAccount);
            
            //ouput object
            System.out.println(aBankAccount);
            
            //close file
            in.close();
        }
        //if reading from a file
        catch(FileNotFoundException e)
        {
            System.out.println("Error. Cannot open file for reading");
        }
        catch(EOFException e)
        {
            System.out.println("Error. EOF encountered, file may be courrupt");
        }   
        catch(IOException e)
        {
            System.out.println("Cannot read file");
        }
    }
}
