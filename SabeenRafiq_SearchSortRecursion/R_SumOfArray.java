public class R_SumOfArray
{
    public static void main(String[] args)
    {
        //declare array of numbers
        int[] intNums = {1,2,3,4,5};
        
        //call the recursive method 
        System.out.println(sumArray(intNums,intNums.length-1));
    }
    
    //recursive method
    public static int sumArray(int [] nums, int index)
    {
        //base case - when this is emt it stops calling the method 
        //less than 0 since when 1 is sent in as the index, it will minus 1 and be 0 which is valid. After this it is not
        if(index < 0)
        {
            return 0;
        }
        
        //recursive call
        return nums[index] + sumArray(nums, index-1);
    }
}