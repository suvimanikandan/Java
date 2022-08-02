public class Four {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        System.out.println("----Before Swap----");
        System.out.println("THe value of a is " + a +"the value of b is "+ b);
        int temp =a;
        a=b;
        b=temp;
        System.out.println("-----After swap-----");
        System.out.println("The value of a is" +a + "and the value of b is"+b);
        

    }
}
