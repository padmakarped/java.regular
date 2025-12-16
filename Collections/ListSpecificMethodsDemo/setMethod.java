package Collections.ListSpecificMethodsDemo;

import java.util.ArrayList;

public class setMethod {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Elements in the list before set: " + list);

        // Using set() to update element at index 1
        list.set(1, 25);
        System.out.println("Elements in the list after set: " + list);
    }
    
}
