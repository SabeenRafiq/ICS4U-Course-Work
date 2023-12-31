package SabeenRafiq_Test;

/**
 * Cast value when nessecary (byte), #f
 * Only handle objects (For primitive data use wrapper boxes)


*/
//import scanner class 
import java.util.Scanner;

//import arraylist class
import java.util.ArrayList;

//import collections calss
import java.util.Collections;

public class Test_3
{
    public static void main(String[] args)
    {
        //Clear the terminal window 
        System.out.print('\u000C');
        
        String strFName, strLName;
        
       // ArrayList <Person> peopleList = new ArrayList <Person>();
        ArrayList <String> names = new ArrayList <String>();
        ArrayList <Double> Measurements = new ArrayList <Double>();
        Measurements.add(3.0);
        Measurements.add(9.0);
        Measurements.add(10.0);
        Measurements.remove(1);
        Measurements.set(0,3.0);
        double num = Measurements.get(1);
        System.out.println(num);
        
        
        // for(double element: Measurements)
        // {
            // System.out.println(element);
        // }
        
        // for(Double element: Measurements)
        // {
            // System.out.println(element);
        // }
        
        names.add("Micheal");
         names.add("Lebron");
          names.add("Serena");
           names.add("Shaq");
        String first = names.remove(0);
        System.out.println(first);
        String sec = names.set(0,"Venus");
        names.add(2, first);
        System.out.println(sec + names.get(1));

        // for(int i=0; i<5; i++)
        // {
            // //prompt user for information needed
            // System.out.println("What is the first name?");
            // strFName = new Scanner(System.in).nextLine();
            
            // System.out.println("What is the last name?");
            
            // strFName = new Scanner(System.in).nextLine();
            
            
            // peopleList.add(new Person());
            // peopleList.add(new Person());
            
            
            // System.out.println(peopleList.size());
        // }
    
       //printArrayList(peopleList);
    }

    
        /**
            //add element at a specfific location at index 1
            peopleList.add(3,"Ant Man");
            or 
            peopleList.add("Ant Man");
            
            //set a specfific elemnt to another value 
            peopleList.set(1, "Gravity");
            
            //get a specific value 
            peopleList.get(1);
            
            //remove a elemnt in array list
            peopleList.remove(0);
            
            //min and max (numeric) - gives one value
            Collections.max(peopleList)
            Collections.min(peopleList)

            //used to remove all the elements in the ArrayList
            peopleList.clear();
            
            //use to find out how many elements an ArrayList
            peopleList.size();

            //sort array list
            Collections.sort(peopleList);
            
            //reverse sort
            Collections.reverse(numList); 

            //add mutilpe elemnts to the array
            Collections.addAll(peopleList,17.58f,3.99f);
            
            //updating element in array
            ArrayList.get(0).setName(""); setName = set method

        */
    

}
