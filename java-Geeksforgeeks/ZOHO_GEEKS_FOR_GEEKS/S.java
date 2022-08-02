package ZOHO_GEEKS_FOR_GEEKS;

import java.util.Iterator;
import java.util.Stack;

public class S {
    public static void main(String[] args) {
        Stack<String>stack=new Stack<String>();
        stack.push("swetha");
        stack.push("Thangamani");
        stack.push("partha");
        stack.push("veni");
        //iterator for the stack
        Iterator<String>itr=stack.iterator();

        //printing the stack
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        //last in first out
        stack.pop();

        //iterator from stack
        itr=stack.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
