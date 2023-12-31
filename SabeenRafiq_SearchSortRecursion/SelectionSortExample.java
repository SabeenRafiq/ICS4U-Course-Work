import java.util.Arrays;

public class SelectionSortExample
{
    public static void main(String[] args)
    {
        //declare and populate an array
        int[] array = {9,8,7,6, 5, 4, 3, 2, 1};
        int[] array2 = {6, 4, 9, 15, 22, 1, 9};
        
        //output none sorted array
        System.out.println("Array");
        System.out.println(Arrays.toString(array));
        
        //sort array
        selectionSort(array);
        
        //output  sorted array
        System.out.println("Array");
        System.out.println(Arrays.toString(array));
        
         //output none sorted array
        System.out.println("Array2");
        System.out.println(Arrays.toString(array2));
        
        //sort array
        selectionSort(array2);
        
        //output  sorted array
        System.out.println("Array2");
        System.out.println(Arrays.toString(array2));
        
    }
    
    /*
     * Selection sort takes in an array of integers and
     * returns a sorted array of the same integers
     */
    public static int[] selectionSort(int[] array)
    {
        //declare variables
        int intCurrentMinIndex;
        int intTemp;
        
        for(int i=0; i<array.length-1; i++)
        {
            intCurrentMinIndex = i;
            
            //comparison
            for(int j =i+1; j<array.length; j++)
            {
                //checking to see if index j (new element) is smaller than the current min value
                if(array[j]< array[intCurrentMinIndex])
                {
                    //switching to the new min value
                    intCurrentMinIndex =j;
                }
                
            }
            
             //swap numbers if needed - values
            if(i!=intCurrentMinIndex)
            {
                intTemp = array[intCurrentMinIndex];
                array[intCurrentMinIndex] =array[i];
                array[i] = intTemp;
            }
           
        }
         //return the sorted array
            return array;
    }
}

