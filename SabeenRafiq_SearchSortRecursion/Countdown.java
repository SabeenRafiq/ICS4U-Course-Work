import java.util.Scanner;

public class Countdown
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input.nextInt();
        System.out.print(countdown(number));

    }
    
    public static String countdown(int n)
    {
        //store countdown
       String output = "";
       
       //base case
       if (n == 0) 
       {
        return "Blastoff!";
       } 
     
       output = output + " "+ n + " " + countdown(n - 1);
       
       return output;
      
       
    }
}
    
