package ZOHO_GEEKS_FOR_GEEKS;
//collection interface
import java.util.Hashtable;
import java.util.Vector;

public class One {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4};
        Vector<Integer>v=new Vector();
        Hashtable<Integer,String>h=new Hashtable();

        //adding element into the vector
        v.addElement(1);
        v.addElement(2);

        //adding element into the hashtable
        h.put(1,"geeks");
        h.put(2,"Swetha");
        System.out.println(arr[0]);
        System.out.println(v.elementAt(0));
        System.out.println(h.get(1));
        
    }
}
