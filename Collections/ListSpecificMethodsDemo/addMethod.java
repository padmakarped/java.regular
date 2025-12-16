package Collections.ListSpecificMethodsDemo;

import java.util.ArrayList;

public class addMethod {

    public static void main(String[] args) {
        

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Elements in the list before add: " + list);

        // Using add() to insert element at index 1 and 2
        list.add(1, 15);
        list.add(2, 45);
        System.out.println("Elements in the list after add: " + list);
    }
    
}
