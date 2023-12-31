//Superclass (put in header)

public class RestaurantBill
{
    //instace variables
    private final float TAX_RATE = 0.08f;
    private final float TIP_RATE = 0.20f;
    
    //the subtotal
    private float fltFoodTotal;
    
    //construtor 
    RestaurantBill(float foodTotal)
    {
        this.fltFoodTotal = foodTotal;
    }
    
    //default construtor 
    RestaurantBill()
    {
        this.fltFoodTotal = 0.0f;
    }
    
    //getter methods 
    public float getFoodTotal()
    {
        return this.fltFoodTotal;
    }
    
    public float getTaxRate()
    {
        return this.TAX_RATE;
    }
    
    public float getTipRate()
    {
        return this.TIP_RATE;
    }
    
    //setter methods 
    public void setFoodTotal(float ft)
    {
        this.fltFoodTotal = ft;
    }
    
    //create method to calcuate total amount inculding tax and tip
    public float grandTotal()
    {
        return this.fltFoodTotal*(1+this.TAX_RATE+this.TIP_RATE);
    }
}


















