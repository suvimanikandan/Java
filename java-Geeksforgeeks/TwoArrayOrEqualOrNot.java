import java.util.Arrays;

//user predefined function
 public class TwoArrayOrEqualOrNot {
    public static void main(String[] args) {
        int a[]={30,40,50};
        int b[]={30,40,0};
        boolean result=Arrays.equals(a,b);

        if(result==true){
            System.out.println("two arrays are equal");
        }
        else{
            System.out.println("Two arrays are not equal");
        }
    }
    
}
