package Collections.Queue;

import java.util.PriorityQueue;

public class QueueDemo {

    public static void main(String[] args) {

        PriorityQueue<String> pq=new PriorityQueue<String>();

        pq.add("Apple");
        pq.add("mango");
        pq.add("banana");
        pq.add("Grapes");
        pq.add("Guva");

        pq.offer("Orange");//insert element into queue

        System.out.println("Element of Priority Queue"+pq);

        pq.peek();//return head element without removing
        System.out.println("Head Of The Queue:"+pq.peek());

        pq.element();//return head element without removing
        System.out.println("Head Of The Queue:"+pq.peek());

        pq.poll();//removes and return head element
        System.out.println("Delete The Top Of queue Element:"+pq);

        pq.remove();//removes and return head element
        System.out.println(pq);
        
    }
    
}
