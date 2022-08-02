package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String str="SwethaManikandan";
        String reverse=new StringBuffer(str).reverse().toString();
        System.out.println("\n string before reverse: "+str);
        System.out.println("\n String after reverse:"+reverse);
    }
}
