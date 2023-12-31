
/**
 * Write a description of class TestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestClass
{
    public static void main(String[] args)
    {
        //declare varaible of type Person and send in infomration for instance varaibles using the consturcutor 
        Person p1 = new Person("Sbeen","Rafiq", (byte)17);
        
        //this will use the default constructor and create an object but fill instance varaibles with default varaibles 
        Person p2 = new Person();
        
        //using overloaded emthod 
        Person p3 = new Person("Sara", "Rafiq");
        
        //output objects using toSting Method
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        
        //comapare using equals method 
        System.out.println(p1.equals(p2));
        
        //use set method to update first name
        p1.setFName("Sabeen");
        
        //use get method to output updated name 
        System.out.println(p1.getFName());
    }
}
