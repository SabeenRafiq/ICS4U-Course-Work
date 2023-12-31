
/**
 * Write a description of class Sabeen_BooksTestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

//import Scanner class
import java.util.Scanner; 

public class Sabeen_BooksTestClass
{
   public static void main(String[] args)
   {
       //delcare variable to store data 
       String strBookName; 
       String strAuthor;
       String strPublishDate; 
       String answer; 
       
       //prompt user for information  and store it 
       System.out.println("What is the book name?");
       strBookName = new Scanner(System.in).nextLine();
       
       System.out.println("Who is the author");
       strAuthor = new Scanner(System.in).nextLine();
       
       System.out.println("What is the publish date?");
       strPublishDate = new Scanner(System.in).nextLine();
       
       //create instance of Books 
       Books b1 = new Books(strBookName, strAuthor, strPublishDate);
    
       //ask user if they entered authore correctly? 
       System.out.println("Did you enter the books's name correctly?");
       answer = new Scanner(System.in).nextLine();
       
       System.out.println("Enter book name: ");
       strBookName = new Scanner(System.in).nextLine();
       
       if (strBookName.equalsIgnoreCase("no"))
       {
           b1.setName(strBookName);
           strBookName = b1.getName(); 
        }
        
       System.out.println(b1);
   }
}
