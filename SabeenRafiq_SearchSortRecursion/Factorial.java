import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        
        System.out.println(calcFactorial(number));
    }
    
    public static int calcFactorial(int num)
    {
      
        // Call the simplified solution
        if (num >= 1)
            return num * calcFactorial(num - 1);
        else
            // Write a base case
            return 1;
        
    }
}