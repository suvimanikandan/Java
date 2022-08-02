public class CompoundInterest {
    public static void main(String[] args) {
        //Compound Interest = P(1 + R/100)r
        double principle=10000,rate=20.5,time=5;
        double CI=principle *
        (Math.pow((1 + rate / 100), time));
        System.out.println("The compound interest:"+CI);
    }
}
