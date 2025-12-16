package Collections.CommonMethodsDemo;

import java.util.ArrayList;

public class isEmptyMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Is the list empty? " + list.isEmpty()); // true

        list.add(10);
        list.add(20);

        System.out.println("Elements in the list: " + list);
        System.out.println("Is the list empty? " + list.isEmpty()); // false 
        
    }
    
}
