
/**
 * Description: This class stores information about items from a Produce Departement
 *
 * @author Sabeen Rafiq
 * @version May 19th, 2021
 */


/**
 * Edit to string and comments 4 get and set
 */
public class Produce
{
    //declare private instace variables 
    private String strItem;
    private byte bytQuantity;
    private float fltUnitPrice; 
    
    //to calculate the total price of the items in this department (bytQuantity*fltUnitPrice)
    private float fltTotalItemPrice;
    
    //declare static varaible 
    static byte bytItemCounter;
    
    //construtor
    Produce(String i, byte q, float p)
    {
        this.strItem = i;
        this.bytQuantity = q;
        this.fltUnitPrice = p;
        
        //Adding one each time a new instace of the class is made (everytime the construtor is called)
        bytItemCounter++;
        
        //calcuate the total price per eaach item by multiplying the entered quanitty and unit price 
        this.fltTotalItemPrice = q*p;
    }
    
    //default construtor 
    Produce()
    {
        this.strItem = "Unknown";
        this.bytQuantity = 0;
        this.fltUnitPrice = 0.0f;

        //Adding one each time a new instace of the class is made (everytime the construtor is called)
        bytItemCounter++;
        
        //calcuate the total price per each item which would be 0 as the quantity and price are 0
        this.fltTotalItemPrice = 0.0f;
    }
    
    //overloaded construtor 
    //when strItem is empty this construtor will be called to set the string to Unknown 
    Produce(byte q, float p)
    {
        this.strItem = "Unknown";
        this.bytQuantity = q;
        this.fltUnitPrice = p;

        //Adding one each time a new instace of the class is made (everytime the construtor is called)
        bytItemCounter++;
        
        //calcuate the total price per eaach item by multiplying the entered quanitty and unit price 
        this.fltTotalItemPrice = q*p;
    }
    
    //set methods for all instance varaibles 
    //Sets a variable to a another value passed in though parameters when called
    public void setItem(String i)
    {
        this.strItem = i;
    }
    
    public void setQuantity(byte q)
    {
        this.bytQuantity = q;
        
        //when this emthod is called, the fltTotalItemPrice will also change so it must also be reset
        //by mutpling the new quanity by the previously entered fltUnitPrice
        this.fltTotalItemPrice = q*this.fltUnitPrice;
    }
    
    public void setUnitPrice(float p)
    {
        this.fltUnitPrice = p;
        
        //when this method is called, the fltTotalItemPrice will also change so it must also be reset
        //by mutpling the new unit price by the previously entered quanitity
        this.fltTotalItemPrice = this.bytQuantity*p;
    }
    
    
    //get methods for all instance varaibles 
    //This allows the private variables to be accesed from an outside class
    public String getItem()
    {
        return this.strItem;
    }
    
    public byte getQuantity()
    {
        return this.bytQuantity;
    }
    
    public float getUnitPrice()
    {
        return this.fltUnitPrice;
    }
    
    public float getTotalItemPrice()
    {
        return this.fltTotalItemPrice;
    }
    
    //toString method to output formated instance variable for a given object
    public String toString()
    {
        //String format allows the ouput to be formatted as it returns a formatted string, while using a toString method
        //This will ouput the  quantity, 'x', and item name aligned on the left, then by left padding the '$' 
        //the total price per item will output aligned on the right size
        return String.format("\n\t$%.2f  x  %-3d @  %-30s%8c%.2f\n",this.fltUnitPrice,this.bytQuantity,this.strItem,'$',this.fltTotalItemPrice);
    }
    
}