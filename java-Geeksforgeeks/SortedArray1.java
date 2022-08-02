import java.util.*;

public class SortedArray1 {
    public static void main(String[] args) {
        int [] arr={5,-23,2,7,87,-42,500};
        System.out.println("The original array is:");
        for(int num:arr){
            System.out.println(num+" ");
        }
        Arrays.sort(arr);
        System.out.println(" \n The sorted array is:");
        for(int num: arr){
            System.out.println(num +  " ");
        }
    }
}
