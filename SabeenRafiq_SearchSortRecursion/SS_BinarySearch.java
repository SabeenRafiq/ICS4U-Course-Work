
/**
 * Write a description of class SS_BinarySearch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SS_BinarySearch
{
    public static void main(String[] args)
    {
        //create na array (sorted)
        int [] array = {3,6,17,19,23,30,50};
        
        int element = 23; 
           
        System.out.println(binarySearch(array,element));
    }
    
    //binary search method 
    public static int binarySearch(int[]array, int key)
    {
        //declare varivles to store high, low, mid value
        int low = 0;
        int high = array.length-1;
        int mid;
        int current;
        
        //keep looping as long as my low index is less than my high index
        while(low<=high)
        {
            //calcuate the mid index
            mid = (low+high)/2;
            
            //store the value at the middle index
            current = array[mid];
            
            //compare the values 
            if(current == key)
            {
                return mid;
            }
            else if(current<key)
            {
                //adjust low point index
                low=mid + 1;
            }
            else
            {
                //adjust high point index
                high = mid - 1;
            }
        }
        
        return -1;
    }
}
