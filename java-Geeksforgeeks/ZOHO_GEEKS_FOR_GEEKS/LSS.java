package ZOHO_GEEKS_FOR_GEEKS;

import java.util.List;
import java.util.Stack;

public class LSS {
    public static void main(String[] args) {
        int n=5;
        List<Integer> s=new Stack<Integer>();
        for(int i=1;i<=n;i++)
        s.add(i);
        System.out.println(s);
        s.remove(3);
        System.out.println(s);
        //printing the element one by one
        for(int i=0;i<s.size();i++)
        System.out.print(s.get(i)+ "  ");
    }
}
