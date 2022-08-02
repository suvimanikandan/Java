package ZOHO_GEEKS_FOR_GEEKS;

import java.util.HashSet;

public class UnionOfTwoArrays {
    
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        int c=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            hs.add(a[i]);
        } 
        for(int i=0;i<m;i++)
        {
            hs.add(b[i]);
        }
        c=hs.size();
        return c;
    }
 }