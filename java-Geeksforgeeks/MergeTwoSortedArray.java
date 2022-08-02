public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int a[]={30,40,50};
        int b[]={45,56,67,78,89};
        int a1=a.length;
        int b1=b.length;
        int c1=a1+b1;

        int[]c=new int[c1];
        for(int i=0;i<a1;i=i+1){
            //storing the element in the resultant array
            c[i]=a[i];
         }
         for(int i=0;i<b1;i=i+1){
            c[a1+i]=b[i];

         }
         for(int i=0;i<c1;i=i+1){
//print the element
System.out.println(c[i]);
         }
         
    }
    
}
