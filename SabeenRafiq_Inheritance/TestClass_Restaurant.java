
public class TestClass_Restaurant
{
    public static void main(String[] args)
    {
        //declare and create instace of restaurant bill
        RestaurantBill sitDownBill = new RestaurantBill(20);
        
        
        //when we call the restaurant bill grandTotal it will include tax and tip
        System.out.printf("Total including tax and tip: %.2f\n", sitDownBill.grandTotal());
        
        
        //declare and create instace of fastfood bill
        FastFoodBill fastfood = new FastFoodBill(20);
        
        
        //when we call the fastFood bill grandTotal it will include tax
        System.out.printf("Total including tax: %.2f", fastfood.grandTotal());
        
    }
}
