package Collections.Vector;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector<String> v1=new Vector<String>();

        v1.add("java");
        v1.add("python");
        v1.add("c++");
        v1.add("html");
        v1.add("dsa");

        System.out.println("Elements in Vector: " + v1);

        v1.addElement("bootstrap"); // Using addElement() method to add an element
        v1.firstElement(); // Using firstElement() method to get the first element
        v1.lastElement(); // Using lastElement() method to get the last element
        v1.elements(); // Using elements() method to get an enumeration of the elements
        v1.elementAt(1);// Using elementAt() method to get the element at index 1
        v1.removeElement("python"); // Using removeElement() method to remove an element
        v1.removeElementAt(2);// Using removeElementAt() method to remove the element at index 2
        v1.capacity(); // Using capacity() method to get the current capacity
        v1.size(); // Using size() method to get the number of elements
        v1.indexOf("dsa"); // Using indexOf() method to get the index of an element
        v1.remove(1); // Using remove() method to remove the element at index 1
        v1.set(1, "javascript"); // Using set() method to update the element at index 1
        v1.get(1); // Using get() method to retrieve the element at index 2
        v1.isEmpty(); // Using isEmpty() method to check if the vector is empty
        v1.toArray(); // Using toArray() method to convert the vector to an array
        

        System.out.println("Elements in Vector after addElement: " + v1);
        System.out.println("First element of Vector: " + v1.firstElement());
        System.out.println("Last element of Vector: " + v1.lastElement());
        System.out.println("Elements in Vector using elements(): "+ v1.elements());
        System.out.println("Element At Index 1: " + v1.elementAt(1));
        System.out.println("Elements in Vector after removeElement: " + v1);
        System.out.println("Elements in Vector after removeElementAt: " + v1);
        System.out.println("Current capacity of Vector: " + v1.capacity());
        System.out.println("Size of Vector: " + v1.size());
        System.out.println("Index of 'dsa' in Vector: " + v1.indexOf("dsa"));
        System.out.println("Elements in Vector after remove at index 1: " + v1.remove(1));
        System.out.println("Elements in Vector after set at index 1: " + v1.set(1, "javascript"));
        System.out.println("Element at index 1: " + v1.get(1));
        System.out.println("Is the Vector empty? " + v1.isEmpty());
        System.out.println("Vector to Array: " + java.util.Arrays.toString(v1.toArray()));
    

        

      
        




        
    }

    
}