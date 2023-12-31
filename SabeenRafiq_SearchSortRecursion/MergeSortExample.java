import java.util.Arrays;

public class MergeSortExample
{
    public static void main(String[] args)
    {
        int[] array = {5, 6, 4, 8, 9, 3, 1, 2};
        
        System.out.println(Arrays.toString(array));
        
        //call mergeSort method
        mergeSort(array);
        
        System.out.println(Arrays.toString(array));
      
    }
    
    /*
     * merge sort takes in an array and returns the same array, sorted
     *
     */
    public static void mergeSort(int[] array)
    {
        //create temp array with same length are original array
        int[] temp = new int[array.length];
        
        //call mergeSortHelper
        mergeSortHelper(array, 0, array.length-1, temp);
    }
    
    private static void mergeSortHelper(int[] array, int from, int to, int[] temp)
    {
        //declare int to store min index
        int mid;
        
        //if the array length is greater than 1
        if(to-from>=1)
        {
            mid = (from + to)/2;
            
            //left side
            mergeSortHelper(array, from , mid, temp);
            
            //right side
            mergeSortHelper(array, mid+1, to, temp);
            
            //call merge method
            merge(array, from, mid, to, temp);
            
            //output 
            //System.out.println(Arrays.toString(array));
        }
    }
    
    private static void merge(int[] array, int from, int mid, int to, int[] temp)
    {
        int i, j, k;
        
        //track left array position
        i = from;
        
        //track right array position
        j = mid +1;
        
        //track temp position
        k=from;
        
        while(i <= mid && j <= to)
        {
            /*if the element in the left subarray is less
             * than the element in the right subarray it 
             * is next in the merge list
             */
            if(array[i]<array[j])
            {
                temp[k] = array[i];
                i++;
            }
            else
            {
                temp[k] = array[j];
                j++;
            }
            k++;
            
        }
        //incase we may have missed elements from either list
        while(i<=mid)
        {
            temp[k] = array[i];
            i++;
            k++;
        }
        
        while(j<= to)
        {
            temp[k] = array[j];
            j++;
            k++;
        }
        
        //copy over form temp to elements
        for(k=from; k<=to; k++)
        {
            array[k] = temp[k];
        }
    }
}
