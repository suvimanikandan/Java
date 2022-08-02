import java.util.Arrays;

//user defined functtion
public class MergeArray {
public static void main(String[] args) {
    int[] a={10,20,30,40,50};
    int[] b={660,70,80,90,100};
    int a1=a.length;
    int b1=b.length;
    int c1=a1+b1;

int[]c=new int[c1];
//using the predefined function of array copy
System.arraycopy(a,0,c,0,a1);
System.arraycopy(b,0,c,a1,b1);
//print the resultant array
System.out.println(Arrays.toString(c));

}    
}
