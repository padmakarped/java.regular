package Collections.ListSpecificMethodsDemo;

import java.util.ArrayList;


public class subListMethod {

    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Elements in the original list: " + list);

        // Using subList() to get a portion of the list from index 1 to 4 (4 is exclusive)
         list.subList(1, 4);
        System.out.println("Elements in the subList (index 1 to 3): " + list.subList(1, 4));
    }
    
}

