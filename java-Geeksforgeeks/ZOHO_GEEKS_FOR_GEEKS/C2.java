package ZOHO_GEEKS_FOR_GEEKS;
//list interface in java provides a way to store the ordered collection.it is a child interface of collection
//it is an ordered collection of objec ts in whit duplicate values are stored
//since list preserves the insertion order,it allows the positional access and insertion of elements

//using number
import java.util.ArrayList;
import java.util.List;

public class C2 {
public static void main(String[] args) {
    List<Integer>l1=new ArrayList<Integer>();
    //adding element to list
    l1.add(0,1);
    l1.add(1,2);
    System.out.println(l1);

    List<Integer>l2=new ArrayList<Integer>();
    l2.add(1);
    l2.add(2);
    l2.add(3);

    l1.addAll(1,l2);
    System.out.println(l1);
//remove the element
  l1.remove(1);
  System.out.println(l1);
  System.out.println(l1.get(3));
//replace 0th  element with 5 in list 1
  l1.set(0,5);
  System.out.println(l1);


    
}
    
}
