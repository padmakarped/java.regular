package Collections.ArrayList;

import java.util.ArrayList;     

public class ArrayListDemo {
    public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);

    System.out.println("Elements in the ArrayList: " + list);

    list.sort(null);// Sorting the ArrayList
    System.out.println("Sorted ArrayList: " + list);
    list.get(2); // Accessing element at index 2
    System.out.println("Element at index 2: " + list.get(2));
    list.remove(2);// Removing element at index 2
    System.out.println("ArrayList after removing element at index 2: " + list);
    list.contains(20); // Checking if the ArrayList contains the element 20
    System.out.println("Does the ArrayList contain 20? " + list.contains(20));
    list.size(); // Getting the size of the ArrayList
    System.out.println("Size of the ArrayList: " + list.size());
    list.isEmpty(); // Checking if the ArrayList is emptyli
    System.out.println("Is the ArrayList empty? " + list.isEmpty());
    list.indexOf(2);// Getting the index of element 2
    System.out.println("Index of element 2: " + list.indexOf(2));
    list.contains(2);// Checking if the ArrayList contains element 2
    System.out.println("Does the ArrayList contain 2? " + list.contains(2));
    list.set(2, 50);// Setting element at index 4 to 50
    System.out.println("ArrayList after setting index 4 to 50: " + list);
    list.size();// Getting the size of the ArrayList again
    System.out.println("Size of the ArrayList after setting index 4: " + list.size());
    list.isEmpty();// Checking if the ArrayList is empty again
    System.out.println(list.isEmpty());
    list.addAll(2, list);// Adding all elements from the list to itself at index 2
    System.out.println(list.addAll(list));
    list.toArray();// Converting the ArrayList to an array
    System.out.println("Converting the array list"+list.toArray());
    list.subList(1, 3);// Getting a sublist from index 1 to 3
    System.out.println("getting a sublist from index 1 to 3"+list.subList(1, 03));
    list.clone();// Cloning the ArrayList
    System.out.println(list.clone());

    



        
    }


    
}
