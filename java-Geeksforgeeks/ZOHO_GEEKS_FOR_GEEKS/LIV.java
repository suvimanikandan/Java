package ZOHO_GEEKS_FOR_GEEKS;

import java.util.List;
import java.util.Vector;

public class LIV {
    public static void main(String[] args) {
        int n=5;
        List<Integer> v=new Vector<>(n);
        for(int i=1;i<=n;i++)
        v.add(i);
        System.out.println(v);
        //remove the element
        v.remove(2);
        System.out.println(v);
        //printing the element one by one
        for(int i=0;i<v.size();i++)
        System.out.print(v.get(i)+" ");
    }
}
