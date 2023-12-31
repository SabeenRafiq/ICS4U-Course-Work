
/**
 * Write a description of class TestClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestClass
{
    Shoes s1 = new Shoes("Nike", (double)43);
    Shoes s2 = new Shoes("Hanwag", 43.5);
    Shoes s3 = new Shoes("Merrell", (double)42);
    Walking w1 = new Walking("Hanwag", 43.5, true);
    Walking w2 = new Walking("Merrell", (double)42, false);
    Running r1 = new Running("Merrell", (double)42,(double)250);
    
    System.out.println(s1.getBrand());
}
