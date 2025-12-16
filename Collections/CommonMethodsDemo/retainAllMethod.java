package Collections.CommonMethodsDemo;

import java.util.ArrayList;

public class retainAllMethod {

    public static void main(String[] args) {


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println("Elements in list1: " + list1);

        java.util.ArrayList<Integer> list2 = new java.util.ArrayList<>();
        list2.add(20);
        list2.add(40);
        System.out.println("Elements in list2: " + list2);

        // Using retainAll() to retain only the elements in list1 that are also in list2
        list1.retainAll(list2);
        System.out.println("Elements in list1 after retainAll: " + list1);
        
    }
    
}
