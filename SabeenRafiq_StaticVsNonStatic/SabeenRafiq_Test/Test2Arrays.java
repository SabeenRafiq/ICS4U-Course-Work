package SabeenRafiq_Test;

/**
 * Name Of Program:
 * Description: This program will 
 *
 * @author Sabeen Rafiq
 * @version April 22nd, 2021
 */

public class Test2Arrays
{
    public static void main(String[] args)
    {
        //Clear the terminal window 
        System.out.print('\u000C');

        //delcare int 2D array with 
        int [][]matrix; 
        
        //declare varaible to store the sum of the rows
        int intRowSum;
        
        //delcare variable to store the row to find the sum of 
        int intRowSumNum;
        
        //initializing 2D array 
        matrix = new int [5][5];

        //populate array
        for(int r=0; r<matrix.length; r++)
        {
            for(int c=0; c<matrix[0].length; c++)
            {
                //populate board 
                matrix[r][c] = (r+c);
            }
        }
        //choose which row to find the sum of 
        intRowSumNum = 2;
        
        //call on method to give sum of each row
        intRowSum = sumRow(matrix, intRowSumNum);
        
        //output the array 
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        
        //output the sum
        System.out.println("The sum of the " +(intRowSumNum + 1) +"th row is " + intRowSum);
    }
    
    public static int sumRow(int[][] matrix, int row)
    {
        //delcare variable to store sum 
        int intRowSum =0;
        
        //add the value of the row
        for(int c = 0; c<matrix[0].length; c++)
        {
            intRowSum += matrix[row][c];
        }
        
        //return the sum 
        return intRowSum; 
    }
}
