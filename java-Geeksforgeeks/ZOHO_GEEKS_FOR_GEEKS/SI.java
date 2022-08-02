package ZOHO_GEEKS_FOR_GEEKS;

import java.util.HashSet;
import java.util.Iterator;



//hashset
public class SI {
 
    public static void main(String[] args) {
        HashSet<String>hs=new HashSet<String>();
        hs.add("Swetha");
        hs.add("thangamani");
        hs.add("thangamalar");
        hs.add("Partha");
        hs.add("Buvi");
        hs.add("veni");
        hs.add("viji");
        hs.add("mutta");
        hs.add("preethi");
    //traversing the element
    Iterator <String> itr=hs.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    }
    }
}
