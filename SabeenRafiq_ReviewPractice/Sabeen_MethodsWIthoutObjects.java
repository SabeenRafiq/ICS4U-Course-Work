/**
 * Name Of Program: Meathods without objects: scholarship amount 
 * Description: This program will tell you your eligible scholarship 
 * amount according to your average and commuity service hours 
 *
 * @author Sabeen Rafiq
 * @start April 22nd, 2021
 * @end April 22nd, 2021
 */

//import JOptionPane class
import javax.swing.JOptionPane;

public class Sabeen_MethodsWIthoutObjects
{
    public static void main(String[] args)
    {
        //Clear the terminal window 
        System.out.print('\u000C');
        
        //decalre array to store the user's entered 6 grades 
        byte [] bytCourse = new byte [6]; 
        
        //declare varible to store the calcutaed average 
        short shtAverage =0; 
        
        //declare varible to store the eligible scholarship amount  
        short shrScholarshipAmt =0; 
        
        //delcare vairble to store the number of community serivce hours
        short shrServiceHours=0;
        
        //declare boolean varaible to loop the try catch block
        boolean  bolTryCatch = false;
        
        //do while loop to loop the try catch for the user to enter the correct value
        do
        {
            //add try and catch block
            try
            {
                //prompt user for 6 grades 
                JOptionPane.showMessageDialog(null, "Please enter the final grades of your 6 courses:");
        
                //for loop to take in the user's grades
                for (int i=0; i<6;i++)
                {
                    bytCourse[i] = Byte.parseByte(JOptionPane.showInputDialog("Course "+(i+1)+": "));
                }
        
                //reset bolTryCatch
                bolTryCatch = false;
            }
            catch(Exception e)
            {
                //error message to user
                JOptionPane.showMessageDialog(null, "Error. Please enter a valid number.");
                
                //set bolTryCatch to true to loop again
                bolTryCatch = true;
            }
        }while(bolTryCatch);//while loop as long as bolTryCatch equals true

        //do while loop to loop the try catch for the user to enter the correct value
        do
        {
            //add try and catch block
            try
            {
                //get the user's commuinty service hours 
                shrServiceHours = Short.parseShort(JOptionPane.showInputDialog("How many community service hours have you completed? "));
                
                //reset bolTryCatch
                bolTryCatch = false;
            }
            catch(Exception e)
            {
                //error message to user
                JOptionPane.showMessageDialog(null, "Error. Please enter a valid number.");
                
                //set bolTryCatch to true to loop again
                bolTryCatch = true;
            }
        }while(bolTryCatch);//while loop as long as bolTryCatch equals true
        
        //call on calcAverage meathod to calcuate average and store in 
        shtAverage = calcAverage(shtAverage, bytCourse);
        
        //call on shrScholarshipAmt meathod to calcuate the apportiate scholarship amount  and store in 
        shrScholarshipAmt = scholarship(shrScholarshipAmt, shtAverage, shrServiceHours);
        
        //when the person has a scholarship
        if(shrScholarshipAmt > 0)
        {
            //output message to user on what thier  Scholarship Amount is
            JOptionPane.showMessageDialog(null, "You are elibgle for a $" +shrScholarshipAmt+ " scholarship!" );
        }
        else if (shrScholarshipAmt == 1)
        {
            //output message to user 
            JOptionPane.showMessageDialog(null, "Invalid information entered" );
        }
        else
        {
            //output message to user 
            JOptionPane.showMessageDialog(null, "You are not elibgle for a scholarship" );
        }
    }
    
    //method to calcuate the average
    public static short calcAverage(short shtAverage, byte [] bytCourse)
    { 
        //for loop to go thouhg each grade and add it to bytAverage
        for(int i=0; i<6; i++)
        {
            shtAverage += bytCourse[i];
        }
        
        //divide the sum by the # of courses for the average
        shtAverage = (byte)(shtAverage/6); 
        
        //return back the average of the 6 courses
        return shtAverage;
    }
    
    //method to chdeck qualifying scholarship amount 
    public static short scholarship(short shrScholarshipAmt, short shtAverage, short shrServiceHours)
    {
        //if structure to assign approtirate scholarship amount 
        if (shtAverage >= 90 && shrServiceHours >= 80) 
        {
            shrScholarshipAmt = 8000; 
        }
        else if (shtAverage >= 85 && shrServiceHours >= 60)
        {
            shrScholarshipAmt = 5000; 
        }
        else if (shtAverage >= 80)
        {
            shrScholarshipAmt = 1000; 
        }
        else if (shtAverage < 0 || shrServiceHours < 0)
        {
            shrScholarshipAmt = 1; 
        }
        
        return shrScholarshipAmt;
    }
}

















