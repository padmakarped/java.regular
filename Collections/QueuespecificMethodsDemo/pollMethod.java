package Collections.QueuespecificMethodsDemo;

import java.util.LinkedList;

public class pollMethod {

    public static void main(String[] args) {
        
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Elements in the queue before poll: " + queue);

        // Using poll() to remove and return the head of the queue
        Integer removedElement = queue.poll();
        System.out.println("Removed element using poll: " + removedElement);
        System.out.println("Elements in the queue after poll: " + queue);
    }
    
}
