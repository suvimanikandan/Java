public class Fifteen {
    public static void main(String[] args) {
        int num=10;
        int factorial=1;
        for(int i=1;i<=num;++i){
            factorial*=i;

        }
        System.out.printf("factorial of %d=%d",num,factorial);
    }
}
