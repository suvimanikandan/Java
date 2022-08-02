

public class FindLargestaNumber {
    public static int BiggestOfThree(int x,int y,int z){
        if(x>=y&&x>=z)
            return x;
        
        else if(y>=x && y>=z)
            return y;
        
        else
            return z;
    }
        public static void main(String[] args) {
            int a,b,c,largest;
            a=5;
            b=7;
            c=8;
            largest=BiggestOfThree(a,b,c);
            System.out.println(largest + "is largest number.");
        }
        
    }

