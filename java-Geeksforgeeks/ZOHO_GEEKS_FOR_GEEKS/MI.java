package ZOHO_GEEKS_FOR_GEEKS;

import java.util.HashMap;
import java.util.Map;

public class MI {
    public static void main(String[] args) {
        HashMap<Integer,String>hm=new HashMap<Integer,String>();
        //creating the hashmap
        hm.put(1,"swetha");
        hm.put(2,"Thangamani");
        hm.put(3,"thangamalr");
        //finding the value for a key
        System.out.println("value for 1 is "+hm.get(1));
        //traversing through the hashmap
        for(Map.Entry<Integer,String>e:hm.entrySet())
        System.out.println(e.getKey()+" " +e.getValue());
    }
}
