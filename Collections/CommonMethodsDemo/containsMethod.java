package Collections.CommonMethodsDemo;

import java.util.ArrayList;

public class containsMethod {


    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Elements in the list: " + list);

        // Using contains() to check if the list contains certain elements
        System.out.println("Does the list contain 20? " + list.contains(20)); // true
        System.out.println("Does the list contain 50? " + list.contains(50)); // false
        
    }
    
}
