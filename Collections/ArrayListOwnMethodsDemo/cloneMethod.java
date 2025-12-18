package Collections.ArrayListOwnMethodsDemo;

import java.util.ArrayList;

public class cloneMethod {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Original list: " + list);

        // Using clone() to create a shallow copy of the list
        list.clone();
        System.out.println("Cloned list: " + list);
    }
    
}
