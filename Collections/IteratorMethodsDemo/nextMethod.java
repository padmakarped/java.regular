package Collections.IteratorMethodsDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class nextMethod {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator iterator = list.iterator(); //iterator() method

        // Using next() to retrieve elements
        while (iterator.hasNext()) 
        {

            System.out.println(iterator.next());
        }

        System.out.println(list);
    }
    
}
