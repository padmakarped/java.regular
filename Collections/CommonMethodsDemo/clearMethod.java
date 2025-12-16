package Collections.CommonMethodsDemo;

public class clearMethod {

    public static void main(String[] args) {
        
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Elements in the list before clear: " + list);

        // Using clear() to remove all elements from the list
        list.clear();
        System.out.println("Elements in the list after clear: " + list);
    }
    
}
