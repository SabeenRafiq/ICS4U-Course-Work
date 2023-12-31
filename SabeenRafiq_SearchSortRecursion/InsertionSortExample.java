import java.util.Arrays;

public class InsertionSortExample
{
   public static void main(String[] args)
   {
       int[] array ={5, 3, 4, 1, 6, 2};
       
       System.out.println("Unsorted");
       System.out.println(Arrays.toString(array));
       
       //call the sort method
       insertionSort(array);
       
         
       System.out.println("Sorted");
       System.out.println(Arrays.toString(array));
   }
   
   /*
    * Insertion sort takes in an array of integers and
    * returns a sorted array of the same integers
    */
   public static void insertionSort(int [] array)
   {
       int intCurNumber, intCurIndex;
       
       //note: we start wih 1 instead of 0
       for(int i=1; i<array.length; i++)
       {
           //setting value with element 2
           intCurNumber = array[i];
           
           //set index to be the place to the left
           intCurIndex = i-1;
           
           //we are still inbounds and the current number
           //is less than the current index
           while(intCurIndex >=0 && array[intCurIndex] > intCurNumber)
           {
               //shift the value at intCurIndex to the right one place
               array[intCurIndex+1] = array[intCurIndex];
               
               //decrement current index
               intCurIndex--;
               
               //put number into the proper location
               array[intCurIndex+1] = intCurNumber;
           }
           
           
           
       }
       
   }
}
