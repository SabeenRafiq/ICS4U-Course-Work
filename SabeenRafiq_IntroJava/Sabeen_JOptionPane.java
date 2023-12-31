 /**
 * Description: This program will get user input using JOptionPane
 *
 * @author Sabeen Rafiq
 * @version April 20th, 2021
 */

//import JOptionPane class
import javax.swing.JOptionPane;

public class Sabeen_JOptionPane {
     public static void main(String[] args) {
        //delcare varaible to store user name 
        String strName;
        
        //delare variable to store age
        byte bytAge;
        
        //prompt the user for their name and set variable equal to that value
        strName = JOptionPane.showInputDialog("What is your name?");
        
        //output message using name 
        JOptionPane.showMessageDialog(null, "Hi, " +strName);
        
        //prompt the user for their age and parse to a byte
        bytAge = Byte.parseByte(JOptionPane.showInputDialog("What is your age?"));
        
        //output message using name 
        JOptionPane.showMessageDialog(null, "Hi, " +strName+". Can't believe you are "+bytAge );
        
     }
}

