package Collections.QueuespecificMethodsDemo;

public class peekMethod {

    public static void main(String[] args) {
        
        java.util.LinkedList<Integer> queue = new java.util.LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Elements in the queue: " + queue);

        // Using peek() to view the head of the queue without removing it
        Integer headElement = queue.peek();
        System.out.println("Head element using peek: " + headElement);
        System.out.println("Elements in the queue after peek: " + queue);
    }
    
}
