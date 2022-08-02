import java.util.Arrays;
import java.util.Collections;
import java.util.*;

//using collections.reverseOrder() approach
public class SortingDescending1 {
    public static void main(String[] args) {
        Integer array[]={1,2,3,4,5};
        Arrays.sort(array,Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
    }
}
