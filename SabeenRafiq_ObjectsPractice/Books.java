
/**
 * Write a description of class Books here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Books
{
    //decalre instace variables
    private String strName;
    private String strAuthor;
    private String strPublishDate;
    
    //create a construtor
    Books(String n, String a, String p)
    {
        this.strName = n;
        this.strAuthor = a;
        this.strPublishDate = p;
    }
    
    //create a default construtor 
    Books()
    {
        this.strName = "Unknown";
        this.strAuthor = "Unknown";
        this.strPublishDate = "Unknown";
    }
    
    //set method for author name
    public void setName(String newName)
    {
        //updateing instance variables  with new name
        this.strName = newName;
    }
    
    //get method for first name 
    public String getName()
    {
        return this.strName;
    }
    
    public String toString()
    {
        return "Book Name: "+this.strName+"\nAuthor: "+this.strAuthor+"\nPublish Date: "+this.strPublishDate;
    }
}
