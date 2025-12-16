package Collections.ListSpecificMethodsDemo;

import java.util.ArrayList;

public class lastIndexOf {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        System.out.println("Elements in the list: " + list);

        // Using lastIndexOf() to find the last index of element 20
         list.lastIndexOf(20);
        System.out.println("Last index of element 20: " + list.lastIndexOf(20));
    }
    
}
