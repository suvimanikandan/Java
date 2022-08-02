package ZOHO_GEEKS_FOR_GEEKS;

import java.util.ArrayDeque;

public class ADEQ {
    public static void main(String[] args) {
        ArrayDeque<Integer>de_queue=new ArrayDeque<Integer>();

        //add()method to insert the values
        de_queue.add(10);
        de_queue.add(20);
        de_queue.add(30);
        de_queue.add(40);
        de_queue.add(50);
        System.out.println(de_queue);
        de_queue.clear();
        //addFirst()method using
        de_queue.addFirst(564);
        de_queue.addFirst(291);
        
        //addlast method
        de_queue.addLast(24);
        de_queue.addLast(14);

        System.out.println(de_queue);
    }
}
