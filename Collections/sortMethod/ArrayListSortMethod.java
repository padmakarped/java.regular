package Collections.sortMethod;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortMethod {

    public static void main(String[] args) {
        
ArrayList l2=new ArrayList<>();

l2.add(15);
l2.add(5);
l2.add(25); 
l2.add(10);
l2.add(20);

System.out.println("Original List:"+l2);

Collections.sort(l2);  //sorts the elements in ascending order.

System.out.println("Sorted List:"+l2);

    }
    
}
