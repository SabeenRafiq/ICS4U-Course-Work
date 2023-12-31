//Subclass to superclass RestaurantBill

public class FastFoodBill extends RestaurantBill
{
    //constructor 
    FastFoodBill(float foodTotal)
    {
        //call on super construotr to poulate instace varaible in superclass 
        super(foodTotal);
    }
    
    /*
     * for a fast food bill we dont want to include a tip. So, we override the grandTotal calculation
     * if sub class is being inilizied it will use this grand total method instead of the one in the superclass
     */
    
    @Override
    public float grandTotal()
    {
        //beacuse foodTotal was sent into the superclass, we acess it by using super and  a get emthod
        return super.getFoodTotal() * (1+super.getTaxRate());
    }
    
    
}