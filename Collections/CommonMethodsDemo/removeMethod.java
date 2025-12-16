package Collections.CommonMethodsDemo;

import java.util.ArrayList;

public class removeMethod {

    public static void main(String[] args) {
        
        // The remove() method is used to remove a specified element from a collection.
        // It removes the first occurrence of the specified element from the collection, if it is present.

        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements to the ArrayList
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20); // Adding a duplicate element for demonstration

        // Displaying the elements of the ArrayList before removal
        System.out.println("Elements in the ArrayList before removal: " + list);

        // Removing an element from the ArrayList
        list.remove(2); // Removes the first occurrence of 20

        // Displaying the elements of the ArrayList after removal
        System.out.println("Elements in the ArrayList after removal: " + list);
    }
    
}
