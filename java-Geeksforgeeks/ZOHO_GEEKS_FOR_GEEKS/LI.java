package ZOHO_GEEKS_FOR_GEEKS;

import java.util.ArrayList;
import java.util.List;




//arraylist
public class LI {
    public static void main(String[] args) {
        
    //size of arraylist
    int n=5;
   List<Integer>arrli=new ArrayList<Integer>(n);
   //appending the element 
   for(int i=1;i<=n;i++)
   arrli.add(i);
    System.out.println(arrli);
    //remove the element
    arrli.remove(3);
    System.out.println(arrli);
    //printing the element one by one
    for(int i=0;i<arrli.size();i++)
    System.out.print(arrli.get(i)+ " ");
   
}
}