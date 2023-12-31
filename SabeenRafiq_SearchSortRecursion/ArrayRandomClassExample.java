import java.util.*;

public class ArrayRandomClassExample
{
    public static void main(String[] args)
    {
        int intArrayLength, intSearchNum, intBinaryReturn, intLinearReturn;
        int [] Nums;
        Scanner input = new Scanner(System.in);
        
        System.out.println("How many numbers would you like to have in your list?");
        intArrayLength = input.nextInt();
        
        Nums= new int[intArrayLength];
        
        for(int i = 0; i<intArrayLength; i++)
        {
            Nums[i] = Random();
        }
        
       for(int i = 0; i<intArrayLength; i++)
        {
            System.out.println(Nums[i]);
        }
        
        System.out.println("What number would you like to search for?  Remember is needs to be between 1-25");
        intSearchNum = input.nextInt();
        
        //call binary search
       intBinaryReturn= binarySearch(Nums, intSearchNum);
        if(intBinaryReturn == -1)
        {
            System.out.println("Number was not found");
        }
        else
        {
            System.out.println(intSearchNum + " was found at " +intBinaryReturn + " index");
        }
       
        
        //call linear search
        intLinearReturn = linearSearch(Nums, intSearchNum);
        
          if(intLinearReturn == -1)
        {
            System.out.println("Number was not found");
        }
        else
        {
            System.out.println(intSearchNum + " was found at " +intLinearReturn + " index");
        }
        
    }
    
    public static int Random()
    {
        int intRandom;
        Random RandNum = new Random();
        
        intRandom = RandNum.nextInt(25);
        
        return intRandom;
        
    }
    
    // Do a binary search on array to find number. You'll need to modify this 
    // method to return the number of comparisons done.
    public static int binarySearch(int[] array, int number)
    {
        int low = 0;
        int high = array.length - 1;
        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (array[mid] == number)
            {
                return mid;
            }
            else if(array[mid] < number)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
      
        return -1;
    }
    
    // Do a linear search on array to find the index of number. You'll need to modify
    // this exercise to return the number of *comparisons* done.
    public static int linearSearch(int[] array, int number)
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == number)
            {
                
                return i; // the method returns as soon as the number is found
            }
        }
        return -1; // the code will get here if the number isn't found
    }
}
