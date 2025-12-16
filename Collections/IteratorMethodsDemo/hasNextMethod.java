package Collections.IteratorMethodsDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class hasNextMethod {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator iterator = list.iterator(); //iterator() method

        // Using hasNext() to check if there are more elements
        while (iterator.hasNext()) 
        {
           
            System.out.println(iterator.next());
        }

    }
    
}
