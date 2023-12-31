/**
 * Name Of Program: Student
 * Description: This program will output information about students using objects
 *
 * @author Sabeen Rafiq
 * @version May 3rd, 2021
 */

public class Sabeen_StudentTestClass
{
    public static void main(String[] args)
    {
        //Clear the terminal window 
        System.out.print('\u000C');

        //declare a variable of type Student and send in information for instance varaibles using the constructor
        Student s1 = new Student("Sabeen", "Rafiq", (byte)17, "S33288852", "srafi1@ocdsb.ca");
        
        //declare a variable of type Course and send in information for instance varaibles using the constructor
        Course c1 = new Course((short)1234,(short) 2134,(short)2342);
        
        System.out.println(s1);
        System.out.println(c1);
    }
}
