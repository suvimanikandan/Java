

/** 
* * 
* * * 
* * * * 
* * * * * 
 */ 
public class NumberPattern{
    static void starRightTriangle(int n){
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int k=5;
        starRightTriangle(5);

    }
}
