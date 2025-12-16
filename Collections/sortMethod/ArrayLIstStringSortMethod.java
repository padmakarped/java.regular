package Collections.sortMethod;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLIstStringSortMethod {

    public static void main(String[] args) {

        ArrayList<String> l3 = new ArrayList<String>();

        l3.add("Banana");
        l3.add("Apple");    
        l3.add("Mango");
        l3.add("Grapes"); 
          
        System.out.println("Original List:"+l3); 

        Collections.sort(l3);  //sorts the elements in ascending order.

        System.out.println("Sorted List:"+l3);  
        
    }
    
}
