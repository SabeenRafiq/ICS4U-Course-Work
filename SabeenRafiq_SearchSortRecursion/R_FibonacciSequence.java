
/**
 * Write a description of class FibonacciSequence here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class R_FibonacciSequence
{
    public static void main(String[] args)
    {
        //loop to send values into the method
        for(int i=0; i<10;i++)
        {
            //output method
            System.out.print(fibonacci(i)+" ");
        }   
    }
    
    //recursive method 
    public static int fibonacci(int x)
    {
        //two base cases
        if(x==0 || x==1)
        {
            return 1;
        }
        
        //recursive call
        return fibonacci(x-1)+fibonacci(x-2);
    }
}
