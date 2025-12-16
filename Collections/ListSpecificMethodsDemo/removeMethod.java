package Collections.ListSpecificMethodsDemo;

import java.util.ArrayList;

public class removeMethod {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Elements in the list before remove: " + list);

        // Using remove() to delete element at index 2
        list.remove(2);
        System.out.println("Elements in the list after remove: " + list);
    }
    
}
