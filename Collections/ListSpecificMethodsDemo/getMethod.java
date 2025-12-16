package Collections.ListSpecificMethodsDemo;

public class getMethod {

    public static void main(String[] args) {

        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Elements in the list: " + list);

        // Using get() to retrieve element at index 2
         list.get(2);
        System.out.println("Element at index 2: " + list.get(2));
        
    }
    
}
