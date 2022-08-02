import java.util.Arrays;

//using bubble sort
public class SortingAscendingOrder {
 public static void main(String[] args) {
    int array[]=new int[]{-5,-9,-8,-7,-6};
System.out.println("The oringial array element in array before sorting:");
for(int i=0;i<array.length;i++){
    System.out.println(array[i]+" ");
    }
    Arrays.sort(array);
    System.out.println();
    System.out.println("Elements of array sorted in ascending order:"+Arrays.toString(array));
}

}
