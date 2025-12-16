package Collections.CommonMethodsDemo;

import java.util.ArrayList;

public class containsllMethod {

    public static void main(String[] args) {
        

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Elements in the list: " + list);

        // Using containsAll() to check if the list contains all specified elements
        ArrayList<Integer> elementsToCheck = new ArrayList<>();
        elementsToCheck.add(20);
        elementsToCheck.add(30);

        boolean containsAll = list.containsAll(elementsToCheck);
        System.out.println("Does the list contain all elements " + elementsToCheck + "? " + containsAll);
    }
    
}
