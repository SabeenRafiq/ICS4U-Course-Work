
/**
 * Write a description of class Sabeen_AnimalTestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sabeen_AnimalTestClass
{
    public static void main (String[] args)
    {
        //Clear the terminal window 
        System.out.print('\u000C');
        
        //decalre a varialbe of type Animal and send in information for instance vaaraibles 
        Animal a1 = new Animal("Reptile", "Lizard", (byte)5);
        
        //decalre a varialbe of type Owner and send in information for instance vaaraibles 
        Owner o1 = new Owner("Sabeen", "Rafiq", (int)5193020);
        
        if (a1.equals(a1) || o1.equals(o1) )
        {
            System.out.println("Invalid value entered");
        }
    }
}
