
/**
 * Write a description of class SS_LinearSeacrh here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SS_LinearSearch
{
    public static void main(String[] args)
    {
        //create array with values to have something to search
        int[] array = {9,5,7,6,3,1,4,8};
        
        int index1,index2,index3;
        
        //call method
        index1 = linearSearch(array,6); 
        index2 = linearSearch(array,55);
        index3 = linearSearch(array,70);
        
        //output
        if(index1>=0)
        { 
            System.out.println("Value was found at index "+index1);
        }
            else 
        {    
            System.out.println("Value not found in this data set.");
        }
        
        //output
        if(index2>=0)
        { 
            System.out.println("Value was found at index "+index2);
        }
            else 
        {    
            System.out.println("Value not found in this data set.");
        }
        
        //output
        if(index3>=0)
        { 
            System.out.println("Value was found at index "+index3);
        }
            else 
        {    
            System.out.println("Value not found in this data set.");
        }
    }
    
    //this method takes an aray called array and a key value to search for and 
    //returns  the index of where the key was found in the array, -1 if key not found
    public static int linearSearch(int[] array, int key)
    {
        //decalre a variable to hold the element
        int element;
        
        //looping through the array looking for the key
        for(int i=0; i<array.length;i++)
        {
            //getting the value at element i and storeing in in element 
            element = array[i];
            
            //if the element is the same as the key
            if(element == key)
            {
                return i;
            }
        }
        return -1;
    }
}
