package Collections.CommonMethodsDemo;

import java.util.ArrayList;

public class removeAllMethod {

    public static void main(String[] args) {
        
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println("Elements in list1: " + list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(20);
        list2.add(40);
        System.out.println("Elements in list2: " + list2);

        // Using removeAll() to remove all elements in list2 from list1
        list1.removeAll(list2);
        System.out.println("Elements in list1 after removeAll: " + list1);
    }
    
}
