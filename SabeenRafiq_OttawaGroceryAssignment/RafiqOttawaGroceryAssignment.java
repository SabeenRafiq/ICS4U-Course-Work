
/**
 * Name Of Program: Ottawa  Grocery Assignment
 * Description: This program will take in a user's grocery items, along with information 
 * about the items (price, quantity, etc.) in an ArrayList in order to create a receipt
 * with a list of all the items, the subtotal, along with the total with tax. 
 *
 * @author Sabeen Rafiq
 * @version May 19th, 2021
 */

//import ArrayList class
import java.util.ArrayList;

//import Scanner class
import java.util.Scanner;

public class RafiqOttawaGroceryAssignment
{
    public static void main(String[] args)
    {
        //Clear the terminal window 
        System.out.print('\u000C');
        
        //declare variables for use input
        String strItem = "";
        byte bytQuantity=0;
        float fltUnitPrice=0; 
    
        //varaibles to loop for input and loop thorugh the try catches and error catch
        String strUnitPrice;
        byte bytDecPlaces;
        String strUserResponse = "", strUserDepartment="", strIncorrectInfo= "";
        boolean bolTryCatch = false, bolUserResponse = false, bolTryCatch2 = false;
        
        //declare and initialize an arraylist of type person 
        ArrayList <Bakery> bakeryList = new ArrayList <Bakery>();
        
        //declare and initialize an arraylist of type person 
        ArrayList <Produce> produceList = new ArrayList <Produce>();
        
        //header / title
        System.out.println("\n * * * * * * * * * * Welcome to Ottawa Grocery! * * * * * * * * * *");
        
        //Do while loop to loop as long as user wants to enter another item
        do
        {
            //prompt the user if they want to enter an item into their list
            System.out.printf("\n%8s%s%s"," ","---------------------------------------------------",
            "\n\nWould you like to purchase an item? (yes / no)\n");
            
            //populate strUserResponse with user's response  
            //trim the string for any white space like extra spaces
            strUserResponse = new Scanner(System.in).nextLine().trim();
            
            //If statment to allow the user to enter items if they entered a yes, 
            //output the recipet if they said no and re-ask the question if an invalid awnser was entered
            if(strUserResponse.equalsIgnoreCase("yes"))
            {
                do
                {
                    //prompt the user for what department they want to shop in and store response in strUserDepartment
                    System.out.println("\nWould you like to shop in the Produce or Bakery Section? (produce / bakery)");
                    strUserDepartment = new Scanner(System.in).nextLine().trim();
                    
                    if(strUserDepartment.equalsIgnoreCase("produce") || strUserDepartment.equalsIgnoreCase("bakery"))
                    {
                        // allow you to exit loop and continue on with code
                        bolTryCatch2 = false;
                    }
                    else
                    {
                        //loop until the user enters a valid response 
                        System.out.println("Error. Please enter a valid response. (produce / bakery)");
                        
                        //set boltryCatch2 to true to reloop
                        bolTryCatch2 = true;
                    }
                }while(bolTryCatch2);//loop while boltryCatch2 is true
                
                //prompt the user for what their product is
                System.out.print("\n\tWhat is the products name?\n\t");
                //populate strItem with user's response  
                strItem = new Scanner(System.in).nextLine().trim();
                
                //try catch block 
                do
                {
                    try
                    {
                        //prompt the user for what their product is
                        System.out.print("\n\tWhat is the quantity you want to purchase?\n\t");
                        //populate strItem with user's response  
                        bytQuantity = new Scanner(System.in).nextByte();
                        
                        //set bolTryCatch2 to false to exit the do while loop
                        bolTryCatch2 = false;
                    }
                    catch (Exception e)
                    {
                        //Error message
                        System.out.println("\n\tError. Please enter a valid numeric quantity");
                        
                        //set bolTryCatch2 to true to re loop the do while loop
                        bolTryCatch2 = true;
                    }
                }while(bolTryCatch2);

                //try catch block 
                do
                {
                    try
                    {
                        //prompt the user for what their product is
                        System.out.print("\n\tWhat is the product's price per a single item? (enter upto 2 decimal places)\n\t");
                        //populate strItem with user's response  
                        fltUnitPrice = new Scanner(System.in).nextFloat();
                        
                        //Check if response was upto or less than 2 decimal places
                        //store the float unit price as a string using the String.valueOf string method and passing
                        //in fltUnitPrice to return a string value (.valueOf is a built in method in java)
                        strUnitPrice = String.valueOf(fltUnitPrice);
                        
                        //Calcuate # of deicmal places
                        //minus the index of the decimal from the total length of the strUnitPrice (and minus one since 
                        //the indexOf gives you the index without the '.' included. I need the number of digits after '.', not including)
                        //and cast it all as a byte to store it in bytDecPlaces
                        bytDecPlaces = (byte) (strUnitPrice.length() - strUnitPrice.indexOf('.') - 1);
                        
                        //if there were more than 2 decimal places, then give an error message and loop the do while loop
                        //else continue and do not reloop the do while loop
                        if (bytDecPlaces > 2)
                        {
                            //Error Message
                            System.out.println("\n\tError. Please enter a valid numeric price. (enter upto 2 decimal places)");
                            
                            //set bolTryCatch2 to true to re loop the do while loop
                            bolTryCatch2 = true;
                        }
                        else
                        {
                            //set bolTryCatch2 to false to exit the do while loop
                            bolTryCatch2 = false;
                        }
                    }
                    catch (Exception e)
                    {
                        //Error Message
                        System.out.println("\n\tError. Please enter a valid numeric price. (enter upto 2 decimal places)");
                        
                        //set bolTryCatch2 to true to re loop the do while loop
                        bolTryCatch2 = true;
                    }

                }while(bolTryCatch2);

                //call on construtor based on which department was entered 
                if (strUserDepartment.equalsIgnoreCase("produce"))
                {
                    //call on the overloaded method in the produce class if the string entered for strItem is empty
                    if(strItem.isEmpty())
                    {
                        //add a new element of the produceList by creating a new instace of the Produce class  
                        //using an overloaded method when the string value is empty 
                        produceList.add(new Produce(bytQuantity, fltUnitPrice));
                        
                    }
                    else 
                    {
                        //add a new element of the produceList by creating a new instace of the Produce class using the construtor
                        produceList.add(new Produce(strItem, bytQuantity, fltUnitPrice));
                    }
                }
                //else if not needed as error checking was preformed above for strUserDepartment if bakery was entered
                else
                {
                    //call on the overloaded method in the bakery class if the string entered for strItem is empty
                    if(strItem.isEmpty())
                    {
                        //add a new element of the bakeryList by creating a new instace of the Bakery class  
                        //using an overloaded method when the string value is empty 
                        bakeryList.add(new Bakery(bytQuantity, fltUnitPrice));
                    }
                    else 
                    {
                        //add a new element of the bakeryList by creating a new instace of the Bakery class using the construtor
                        bakeryList.add(new Bakery(strItem, bytQuantity, fltUnitPrice));
                    }
                }

                //Updateing varaibles: 
                //do while loop to make sure proper input is entered 
                do{
                    //Ouput what infromatoin the user entered and ask if it was correct (based on the department entered previously)
                    if(strUserDepartment.equalsIgnoreCase("bakery"))
                    {
                        //call on the get methods from the last element (which stores the objects) added to the arrayList in the bakeryList
                        //use string.format to ouput the price to control the ouput to have 2 decimal places 
                        //I used string.format to be able to use it inside a println as it creates a string instead of using a prinf 
                        System.out.println("\nYou entered : Item - "+ bakeryList.get(bakeryList.size()-1).getItem() + ", Quantity - "+
                        + bakeryList.get(bakeryList.size()-1).getQuantity() + ", Price - "
                        + String.format("%.2f",bakeryList.get(bakeryList.size()-1).getUnitPrice())
                        +"\n\nIs this information correct? (yes / no)");
                    }
                    //if not bakery then it must be produce (due to error catching previously)
                    else
                    {
                        //call on the get methods from the last element (which stores the objects) added to the arrayList in the produceList
                        //use string.format to ouput the price to control the ouput to have 2 decimal places 
                        System.out.println("\nYou entered : Item - "+ produceList.get(produceList.size()-1).getItem() + ", Quantity - "+
                        + produceList.get(produceList.size()-1).getQuantity() + ", Price - "
                        + String.format("%.2f",produceList.get(produceList.size()-1).getUnitPrice())
                        +"\n\nIs this information correct? (yes / no)");
                    }
                    
                    //store the user's response in strUserResponse
                    strUserResponse = new Scanner(System.in).nextLine().trim();
        
                    //if-else structure to do things according to what the user's input was 
                    //if the infomation is correct, move on to the next item (exit loop)
                    if(strUserResponse.equalsIgnoreCase("yes"))
                    {
                        //Output message to user
                        System.out.println("\nGreat!");
                        
                        //bolTryCatch set to false to exit do while loop
                        bolTryCatch = false;
                    }
                    //else if the infomation is inccorect, ask the user to correct it through a series of questions
                    else if(strUserResponse.equalsIgnoreCase("no"))
                    {
                        //do while loop 
                        do{
                            //prompt the user to enter what peice of info was wrong
                            System.out.print("\n\tWhat piece of information was incorrect? (item, quantity, price) \n\t");
                            
                            //store the user's awnser in strUserResponseInfoPeice
                            strIncorrectInfo = new Scanner(System.in).nextLine().trim();
                            
                            //if else strutoure to loop error catch and call on appropriate method to update variables 
                            //If the response (strIncorrectInfo) isnt one of the three attruibutes it will reloop the 
                            //do while loop and reask the question
                            //else if it is, then set bolTryCatch2 to false to exit the loop
                            if(!(strIncorrectInfo.equalsIgnoreCase("item")
                            ||strIncorrectInfo.equalsIgnoreCase("quantity")
                            ||strIncorrectInfo.equalsIgnoreCase("price")))
                            {
                                //Ouput Error message
                                System.out.println("\n\tError. Please enter the appropriate input (item, quantity, or price)");
                                
                                //set bolTryCatch2 to true to reloop do while loop
                                bolTryCatch2 = true;
                            }
                            else
                            {
                                //set to false to exit do while loop
                                bolTryCatch2 = false;
                            }
                        }while(bolTryCatch2);//loop while bolTryCatch2 is true
                           
                        //If if the awnser is one of the 3 attributes, and the user department entered before was 
                        //bakery, call on updateBakery
                        if(strUserDepartment.equalsIgnoreCase("bakery"))
                        {
                            //call on updateBakery to update the varaible which is in the bakery class
                            updateBakery(bakeryList,strIncorrectInfo);
                        }
                        //If if the awnser is one of the 3 attributes, and the user department entered before was 
                        //produce, (the only other option if it was not bakery) call on updateProduce
                        else
                        {
                            //call on updateProduce to update the varaible which is in the produce class
                            updateProduce(produceList,strIncorrectInfo);
                        }
                        
                        //set bolTryCatch to true to reloop
                        bolTryCatch = true;
                    }
                    //else if infomation is not  a yes or a no, the question will re loop
                    else
                    {
                        //Output error message
                        System.out.println("\n\tError. Please enter yes or no.");
                        
                        //set bolTryCatch to true to reloop
                        bolTryCatch = true;
                    }
                }while(bolTryCatch); //loop while bolTryCatch is true  
                
                //set bolUserResponse to true to loop do while again
                bolUserResponse = true;
            }
            else if (strUserResponse.equalsIgnoreCase("no"))
            {
                //Thank you message
                System.out.println("\nThank you for shopping with Ottawa Grocery.");
                
                //set bolUserResponse to false to exit loop 
                bolUserResponse = false;
            }
            else
            {
                //Error message
                System.out.println("Error, invalid value entered. Please enter yes or no.");
                
                //set bolUserResponse to true to loop do while again
                bolUserResponse = true;
            }
        }while(bolUserResponse);
        
        //Call on method to print out the recipt 
        printReceipt(produceList, bakeryList);
    }
    
    //Method to update the instace variables from the produce class    
    public static void updateProduce(ArrayList<Produce> produceList, String strUserResponseInfoPeice)
    {
        //declare variables to store user's new entered information 
        //before updating it using set methods
        String strItem = "";
        byte  bytQuantity =0;
        float fltUnitPrice = 0.0f;
        
        //delcare variables for error catching to loop do while loops 
        //and to store user's awnser to questions in order to traverse through if else strutures 
        byte bytDecPlaces;
        String strUnitPrice;
        boolean bolTryCatch = false, bolTryCatch2 = false;
        
        //if else structure to ask certain questoin, and call on a certain method 
        //based on what peice of informaiton was incorrect
        if(strUserResponseInfoPeice.equalsIgnoreCase("item"))
        {
            //prompt the user to enter the correct information
            System.out.print("\n\tEnter the new product name: \n\t");
            
            //populate strItem with the user's response 
            strItem = new Scanner(System.in).nextLine().trim();

            //If the string entered was empty, update the srtItem to be Unknown, else update to string entered by the user
            if(strItem.isEmpty())
            {
                //Update the variable by first getting the current object (by using the .get method with an index 
                //of the size of the list so far -1) then call on the setItem method to update the instance variable
                //in this case "Unknown" is entered as an empty string would have been entered 
                produceList.get(produceList.size()-1).setItem("Unknown");
            }
            else
            {
                //Update the variable by first getting the current object (by using the .get method with an index 
                //of the size of the list so far -1) then call on the setItem method to update the instance variable
                produceList.get(produceList.size()-1).setItem(strItem);
            }
        }                        
        else if(strUserResponseInfoPeice.equalsIgnoreCase("quantity"))
        { 
            do{
                try
                {
                    //prompt the user to enter the correct information
                    System.out.print("\n\tEnter the new quantity:\n\t ");
                    
                    //populate bytQuantity with the user's response
                    bytQuantity = new Scanner(System.in).nextByte();
                    
                    //set bolTryCatch6 to false to exit loop
                    bolTryCatch=false;
                }
                catch(Exception e)
                {
                    //Output error message
                    System.out.println("\n\tError. Please enter a valid numeric quantity");
                    
                    //set bolTryCatch6 to true to re - loop
                    bolTryCatch=true;
                }
            }while(bolTryCatch);
            
            //Update the variable by first getting the current object (by using the .get method with an index 
            //of the size of the list so far -1) then call on the setQuantity method to update the variable
            //These do not need an if statment to enusre they are not empty due to the error catching above
            produceList.get(produceList.size()-1).setQuantity (bytQuantity);
        }
        else 
        {
            do{
                try
                {
                    //prompt the user to enter the correct information
                    System.out.print("\n\tEnter the new price: \n\t");
                    
                    //populate fltUnitPrice with the user's response
                    fltUnitPrice = new Scanner(System.in).nextFloat();

                    //Check if response was upto or less than 2 decimal places
                    //store the float unit price as a string using the String.valueOf string method and passing in fltUnitPrice 
                    strUnitPrice = String.valueOf(fltUnitPrice);
                    
                    //Calcuate # of deicmal places
                    //minus the index of the decimal from the total length of the strUnitPrice (and minus one) and cast it all as a byte
                    bytDecPlaces = (byte) (strUnitPrice.length() - strUnitPrice.indexOf('.') - 1);
                    
                    //if there were more than 2 decimal places, then give an error message
                    if (bytDecPlaces > 2)
                    {
                        //Error Message
                        System.out.println("\n\tError. Please enter a valid numeric price. (enter upto 2 decimal places)");
                        
                        //set bolTryCatch2 to true to re loop the do while loop
                        bolTryCatch2 = true;
                    }
                    
                    //set bolTryCatch6 to false to exit loop
                    bolTryCatch=false;
                }
                catch(Exception e)
                {
                    //Output error message
                    System.out.println("\n\tError. Please enter a valid numeric price");
                    
                    //set bolTryCatch6 to true to re - loop
                    bolTryCatch=true;
                }
            }while(bolTryCatch);//loop while bolTryCatch3 is true
            
            //Update the variable by first getting the current object (by using the .get method with an index 
            //of the size of the list so far -1) then call on the setUnitPrice method to update the variable
            //These do not need an if statment to enusre they are not empty due to the error catching above
            produceList.get(produceList.size()-1).setUnitPrice(fltUnitPrice);
        }
    }
    
    //Method to update the instace variables from the bakery class
    public static void updateBakery(ArrayList<Bakery> bakeryList, String strUserResponseInfoPeice)
    {
        //declare variables to store user's new entered information 
        //before updating it using set methods
        String strItem = "";
        byte  bytQuantity =0;
        float fltUnitPrice = 0.0f;
        
        //delcare variables for error catching to loop do while loops 
        //and to store user's awnser to questions in order to traverse through if else strutures 
        byte bytDecPlaces;         
        String strUnitPrice; 
        boolean bolTryCatch = false, bolTryCatch2 = false;
        
        //if else structure to ask certain questoin, and call on a certain method 
        //based on what peice of informaiton was incorrect
        if(strUserResponseInfoPeice.equalsIgnoreCase("item"))
        {
            //prompt the user to enter the correct information
            System.out.print("\n\tEnter the new product name: \n\t");
        
            //populate strItem with the user's response 
            strItem = new Scanner(System.in).nextLine().trim();
        
            //If structure to ensure if the string entered was empty, the strItem variable is updated to "Unknown"
            //else it is updated to the user entered string
            if(strItem.isEmpty())
            {
                //updateing the instance variable by calling on the setItem method from the last
                //element in the bakeryList arrayList (which contains the object whose instance needs to be updated)
                bakeryList.get(bakeryList.size()-1).setItem("Unknown");
            }
            else
            {
                //updateing the instance variable by calling on the setItem method from the last
                //element in the bakeryList arrayList (which contains the object whose instance needs to be updated)
                bakeryList.get(bakeryList.size()-1).setItem(strItem);
            }

        }                        
        else if(strUserResponseInfoPeice.equalsIgnoreCase("quantity"))
        { 
            do{
                try
                {
                    //prompt the user to enter the correct information
                    System.out.print("\n\tEnter the new quantity: \n\t");
                    
                    //populate bytQuantity with the user's response
                    bytQuantity = new Scanner(System.in).nextByte();
                    
                    //set bolTryCatch6 to false to exit loop
                    bolTryCatch2=false;
                }
                catch(Exception e)
                {
                    //Output error message
                    System.out.println("\n\tError. Please enter a valid numeric quantity");
                    
                    //set bolTryCatch6 to true to re - loop
                    bolTryCatch2=true;
                }
            }while(bolTryCatch2);//Loop as long as bolTryCatch2 is true
           
            //updateing the instance variable by calling on the setItem method from the last
            //element in the bakeryList arrayList (which contains the object whose instance needs to be updated)
            bakeryList.get(bakeryList.size()-1).setQuantity (bytQuantity);
        }
        else if(strUserResponseInfoPeice.equalsIgnoreCase("price"))
        {
            do{
                try
                {
                    //prompt the user to enter the correct information
                    System.out.print("\n\tEnter the new price: \n\t");
                    
                    //populate fltUnitPrice with the user's response
                    fltUnitPrice = new Scanner(System.in).nextFloat();
                    
                    //Check if response was upto or less than 2 decimal places
                    //store the float unit price as a string using the String.valueOf string method and passing in fltUnitPrice 
                    strUnitPrice = String.valueOf(fltUnitPrice);
                    
                    //Calcuate # of deicmal places
                    //minus the index of the decimal from the total length of the strUnitPrice (and minus one) and cast it all as a byte
                    bytDecPlaces = (byte) (strUnitPrice.length() - strUnitPrice.indexOf('.') - 1);
                    
                    //if there were more than 2 decimal places, then give an error message
                    if (bytDecPlaces > 2)
                    {
                        //Error Message
                        System.out.println("\n\tError. Please enter a valid numeric price. (enter upto 2 decimal places)");
                        
                        //set bolTryCatch2 to true to re loop the do while loop
                        bolTryCatch2 = true;
                    }
                    
                    //set bolTryCatch2 to false to exit loop
                    bolTryCatch2=false;
                }
                catch(Exception e)
                {
                    //Output error message
                    System.out.println("\n\tError. Please enter a valid numeric price");
                    
                    //set bolTryCatch2 to true to re - loop
                    bolTryCatch2=true;
                }
            }while(bolTryCatch2);//loop while bolTryCatch2 is true
            
            //updateing the instance variable by calling on the setItem method from the last
            //element in the bakeryList arrayList (which contains the object whose instance needs to be updated)
            bakeryList.get(bakeryList.size()-1).setUnitPrice(fltUnitPrice);
        }
    }
    
    //create method to print out the recipt
    public static void printReceipt(ArrayList<Produce> produceList, ArrayList<Bakery> bakeryList)
    {
        //declare variable to store the total cost
        float fltTotalCost=0;
        
        //declare final variable to store tax
        final float TAX = 1.13f; 
        
        //calculate the total price (by adding up the total price for each item (fltTotalItemPrice) together
        //between the two arraylists into fltTotalCost
        for(int i=0; i<bakeryList.size(); i++)
        {
            fltTotalCost += (bakeryList.get(i).getTotalItemPrice());
        }
        
        for(int i=0; i<produceList.size(); i++)
        {
            fltTotalCost += (produceList.get(i).getTotalItemPrice());
        }
        
        //Ouput the  receipt :
        
        //receipt header
        System.out.println("\n\n\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
        System.out.printf("%44s","- - - - Receipt - - - -");
        System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
        
        //ouput the heaader for produce items and the number of produce items that were bought
        System.out.println("Produce Items: " + Produce.bytItemCounter + " items");
        
        //for loop to output everything in produceList
        for(Produce element: produceList)
        {
            System.out.print(element);
        }
        
        //ouput the heaader for bakery items and the number of bakery items that were bought
        System.out.println("\nBakery Items: " + Bakery.bytItemCounter + " items");
        
        //for loop to output everything in bakeryList
        for(Bakery element: bakeryList)
        {
            System.out.print(element);
        }
        
        //Output the total and subtotal along with a thank you message
        System.out.println("\n* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.printf("SUBTOTAL: --------------------------------------------------- $%1.2f\n\n", fltTotalCost);
        System.out.printf("TOTAL WITH TAX: --------------------------------------------- $%1.2f\n\n", (fltTotalCost*TAX));
        System.out.println("* * * * * * * * * * * * * * THANK YOU! * * * * * * * * * * * * * * *");

    }
}