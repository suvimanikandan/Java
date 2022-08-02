package ZOHO_GEEKS_FOR_GEEKS;

import java.util.ArrayList;
import java.util.List;

public class C2S {
    public static void main(String[] args) {
        List<String> a1=new ArrayList<>();
        //adding element to list
        a1.add("swetha");
        a1.add("Thangamani");
        a1.add("Thangamalar");
        System.out.println("Intial ArrayList"+a1);
        //updating the element
        a1.set(1,"for");
        System.out.println("Updated ArrayList"+a1);

        //removing elements
        System.out.println("Before removing ArrayList"+a1);
        a1.remove(1);
        System.out.println("After Removing ArrayList"+a1);

        //using for loop for iteration
        //using the get method
        for(int i=0;i<a1.size();i++){
            System.out.println(a1.get(i)+" ");
        }
        System.out.println();
        //uding for-each loop
        for(String str:a1)
        System.out.println(str +" ");
    }
}
