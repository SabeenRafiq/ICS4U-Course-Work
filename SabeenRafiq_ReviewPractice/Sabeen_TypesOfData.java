
/**
 * Name Of Program:Types Of Data Practice
 * Description: This program will declares 3 whole number variables between 
 * -30000 and 29000 and outputs the sum, average and product of these numbers
 *
 * @author Sabeen Rafiq
 * @start April 22nd, 2021
 * @end April 22nd, 2021
 */

public class Sabeen_TypesOfData
{
    public static void main(String[] args)
    {
        //Clear the terminal window 
        System.out.print('\u000C');
        
        //declare varables to store the 3 varaibles with the 3 numbers
        short shrNumOne = 25000; 
        short shrNumTwo = 450; 
        short shrNumThree = -560; 
        
        //delcare varaible to store the sum of the 3 numbers
        int intSum; 
        
        //delcare varaible to store the average of the 3 numbers
        int intAverage; 
        
        //delcare varaible to store the product of the 3 numbers
        int intProduct; 
        
        //calcuting the sum and storing in intSum
        intSum = shrNumOne + shrNumTwo + shrNumThree; 
        
        //calcuting the average and storing in intAverage
        intAverage = intSum / 3; 
        
        //calcuting the product and storing in intProduct
        intProduct = shrNumOne * shrNumTwo * shrNumThree; 
        
        //output the sum, average and product of the 3 numbers
        System.out.println("Your 3 numbers are: " + shrNumOne +" "+ shrNumTwo +" "+ shrNumThree);
        System.out.println("The sum of the numbers is: " + intSum);
        System.out.println("The average of the numbers is: " + intAverage);
        System.out.println("The product of the numbers is: " + intProduct);
    }
}
