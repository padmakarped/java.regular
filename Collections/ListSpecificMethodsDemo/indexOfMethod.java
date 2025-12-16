package Collections.ListSpecificMethodsDemo;

public class indexOfMethod {

    public static void main(String[] args) {
        
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        System.out.println("Elements in the list: " + list);

        // Using indexOf() to find the index of element 20
         list.indexOf(20);
        System.out.println("Index of element 20: " + list.indexOf(20));
    }
    
}
