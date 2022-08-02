package ZOHO_GEEKS_FOR_GEEKS;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LHS {
   public static void main(String[] args) {
    LinkedHashSet<String>lhs=new LinkedHashSet<>();
    lhs.add("Swetha");
    lhs.add("Thangamani");
    lhs.add("nivas");
    lhs.add("mutta");
    lhs.add("santhosh");
    //traversing the element
    Iterator<String> itr=lhs.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
   } 
}
