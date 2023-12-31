/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAcc implements java.io.Serializable 

{
    String Name;
    int Account;
    float Balance;
    
    //contructor
    BankAcc(String name, float deposit, int acc)
    {
        this.Name = name;
        this.Account = acc;
        this.Balance = deposit;
    }
    
    //default constructor
    BankAcc()
    {
        this.Name = "unknown";
        this.Account = 0000;
        this.Balance = 0.0f;
    }
    
    // Getter
    public String getOwner() 
    {
        return Name;
    }
    
    public int getAccountNumber()
    {
      return Account;
    }
    
    public float getBalance()
    {
      return Balance;
    }
      
   
    public String toString()
    {
        return "Name: "+Name+" Account: #" + Account+" with $" +Balance;
    }
}
