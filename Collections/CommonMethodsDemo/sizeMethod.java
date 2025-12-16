package Collections.CommonMethodsDemo;

public class sizeMethod {

    public static void main(String[] args) {
        
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Elements in the list: " + list);

        // Using size() to get the number of elements in the list
         list.size();
        System.out.println("Size of the list: " + list.size());

    }
    
}
