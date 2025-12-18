package Collections.Queue;

import java.util.ArrayDeque;

public class ArrayDqueDemo {

    public static void main(String[] args) {

        ArrayDeque<String> pq=new ArrayDeque<>();

        pq.add("Omkar");
        pq.add("manesh");
        pq.add("Tejas");
        pq.add("Bhaurao");
        pq.add("Amol");

        System.out.println(pq);

        pq.offer("Anil");//insert at tail
        System.out.println("Insert At Tail"+pq);

        pq.offerFirst("Abhi");//insert at end
        System.out.println("Insert At End"+pq);

        pq.offerLast("Shubham");
        System.out.println("Insert At End"+pq);

        pq.remove();//remove head
        System.out.println("Remove Head"+pq);

        pq.poll();//remove head
        System.out.println("Removes Head"+pq);

        pq.pollFirst();//removes first
        System.out.println("Removes First"+pq);

        pq.pollLast();//removes last
        System.out.println("Removes Last"+pq);
        
    }
    
}
