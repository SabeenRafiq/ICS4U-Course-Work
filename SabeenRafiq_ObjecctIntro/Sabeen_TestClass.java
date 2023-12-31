/**
 * Description: This test class will create an instance/ copy of the person class
 *
 * @author Sabeen Rafiq
 * @version April 30, 2021
 */

public class Sabeen_TestClass
{
    public static void main(String[] args)
    {
        //Clear the terminal window 
        System.out.print('\u000C');
        
        //declare variable of type person and create an instance (copy) 
        Person Person1 = new Person();
        
        //declare varaible of type address and create an instnace 
        Person1.address = new Address();
        
        //populate person firstName and lastname 
        Person1.strFirstName = "Sabeen";
        Person1.strLastName = "Rafiq";
        Person1.bytAge = 17;
        Person1.bolStudent = true;
        Person1.address.intStreetNumber = 123;
        Person1.address.chrUnitLetter = 'B';
        Person1.address.strStreetName = "Oak Street";
        Person1.address.strCity = "Ottawa";
        Person1.address.strProvince = "Ontario";
        Person1.address.strPostalCode = "K2J061";

        //Output 
        System.out.println("First Name:" + Person1.strFirstName);
    }
}
