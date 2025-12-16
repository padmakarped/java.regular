package Collections.CommonMethodsDemo;

import java.util.ArrayList;

public class addAllMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);  
        list1.add(20);  
        list1.add(30);  
        System.out.println("Elements in list1: " + list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(40);  
        list2.add(50);  
        System.out.println("Elements in list2: " + list2);

        // Using addAll() to add all elements from list2 to list1
        list1.addAll(list2);
        System.out.println("Elements in list1 after addAll: " + list1);

        
    }
    
}
