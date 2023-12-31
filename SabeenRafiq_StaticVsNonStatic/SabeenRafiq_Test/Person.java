package SabeenRafiq_Test;


public class Person
{
    private String strFName,strLName;

    Person(String f, String l)
    {
        this.strFName = f;
        this.strLName = l;
    }
    
    Person()
    {
        this.strFName = "Unknown";
        this.strLName = "Unknown";
    }
    
    public void setFName(String f)
    {
        this.strFName = f;
    }
    
    public String getFName(String f)
    {
        return  this.strFName = f;
    }
    
    public String toString()
    {
        return "First Name: "+this.strFName;
    }
}
