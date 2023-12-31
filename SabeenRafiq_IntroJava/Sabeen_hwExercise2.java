 /**
 * Description: This program will input the users name and ouput a message along with 
 * .....
 *
 * @author Sabeen Rafiq
 * @version April 20th, 2021
 */

//import JOptionPane class
import javax.swing.JOptionPane;

public class Sabeen_hwExercise2{
     public static void main(String[] args) {
         //delcare varaible for users name
         String strName;
         
         //delcare varaible for a triangle's height
         double dblTriHeight;
         
         //delcare varaible for a triangle's base size
         double dblTriBase;
         
         //delcare varaible for a triangle's area
         double dblTriArea;
         
         //delcare varaible for a rectangle's height
         double dblRectHeight;
         
         //delcare varaible for a rectangle's width
         double dblRectWidth;
         
         //delcare varaible for a rectangle's area
         double dblRectArea;
         
         //delcare varaible for a rectangle's perimeter
         double dblRectPerimeter;
         
         //prompt the user for their name and set variable equal to that value
         strName = JOptionPane.showInputDialog("What is your name?");
         
         //output message using name 
         JOptionPane.showMessageDialog(null, "Hello, " +strName);
            
         //prompt the user for a triangle's height and set variable equal to that value
         dblTriHeight = Double.parseDouble(JOptionPane.showInputDialog("What is the height of your triangle?"));
         
         //prompt the user for a triangle's base size and set variable equal to that value
         dblTriBase = Double.parseDouble(JOptionPane.showInputDialog("What is the size of the base of your triangle?"));
         
         //calculate the area of the triangle 
         dblTriArea = dblTriHeight * dblTriBase/2;
         
         //output area using area variable 
         JOptionPane.showMessageDialog(null, "The area of the triangle is " +dblTriArea);
         
         //prompt the user for a rectangle's height and set variable equal to that value
         dblRectHeight = Double.parseDouble(JOptionPane.showInputDialog("What is the height of your rectangle?"));
         
         //prompt the user for a rectangle's width size and set variable equal to that value
         dblRectWidth = Double.parseDouble(JOptionPane.showInputDialog("What is the width of your rectangle?"));
         
         //calculate the area of the rectangle 
         dblRectArea = dblRectHeight * dblRectWidth;
         
         //calculate the perimeter of the rectangle 
         dblRectPerimeter = (dblRectHeight + dblRectWidth)*2;
         
         //output area using area variable 
         JOptionPane.showMessageDialog(null, "The area of the rectangle is " +dblRectArea);
         
         //output perimeter using perimeter variable 
         JOptionPane.showMessageDialog(null, "The perimeter of the rectangle is " +dblRectPerimeter);
     }
}


