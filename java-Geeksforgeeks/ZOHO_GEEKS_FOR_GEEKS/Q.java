package ZOHO_GEEKS_FOR_GEEKS;

import java.util.PriorityQueue;

public class Q {
    public static void main(String[] args) {
        PriorityQueue<Integer>pQueue=new PriorityQueue<Integer>();
//adding items to pqueue
pQueue.add(10);
pQueue.add(20);
pQueue.add(30);
//prinnting the top element of pqueue
System.out.println(pQueue.peek());
//printing the top element and removing it from the priority queue container
System.out.println(pQueue.poll());
//printitng the top element again
System.out.println(pQueue.peek());
    }
}
