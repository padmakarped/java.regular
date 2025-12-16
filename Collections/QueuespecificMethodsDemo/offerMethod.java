package Collections.QueuespecificMethodsDemo;

import java.util.LinkedList;

public class offerMethod {

    public static void main(String[] args) {

        LinkedList<Integer> queue = new LinkedList<>();
        System.out.println("Elements in the queue before offer: " + queue);

        // Using offer() to add elements to the queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println("Elements in the queue after offer: " + queue);
        
    }
    
}
