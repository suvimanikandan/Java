package ZOHO_GEEKS_FOR_GEEKS;

import java.util.Iterator;
import java.util.TreeSet;

//tree set
public class SorSeInt {
    public static void main(String[] args) {
        //create a tree set
        TreeSet<String>ts=new TreeSet<>();
        ts.add("Swetha");
        ts.add("thangamani");
        ts.add("dina");
        ts.add("thangamalr");
        //traversing the element
        Iterator<String> itr=ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
