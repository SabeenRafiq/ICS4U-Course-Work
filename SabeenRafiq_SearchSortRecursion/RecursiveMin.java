import java.util.*;

public class RecursiveMin
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int n; 
        int minimum; 
        
        while (true)
        {
             System.out.println("Please enter numbers. Enter -1 to quit: ");
             int number = input.nextInt();
             
             if (number == -1)
             {
                 break;
             }
             else 
             {
                 numbers.add(number);
             }
        }
        n = numbers.size()-1;
        minimum = findMinimum(numbers, n);
        System.out.println("Minimum: " + minimum);
        
    }
    
    public static int findMinimum(ArrayList<Integer> numbers, int index)
    {
       
         // Base Case
        if (index < 1) {
            return numbers.get(0);
        }
        
        // Recursive Call and return
       return Math.min(numbers.get(index), findMinimum(numbers, index-1));
    }
}