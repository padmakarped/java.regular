package Collections.IteratorMethodsDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class removeMethod {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);   
        list.add(30);
        list.add(40);

        Iterator iterator = list.iterator(); //iterator() method

        // Using remove() to delete elements
        while (iterator.hasNext())
        {
            Integer value = (Integer) iterator.next();

            if (value.equals(20) || value.equals(30))
                 {
                iterator.remove(); // remove() method
            }
        }


    }
    
}
