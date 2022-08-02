package Strings;

public class ReverseString2 {
    public static void main(String[] args) {
        String str="Swethamanikandan";
        char[]try1=str.toCharArray();
        for(int i=try1.length-1;i>=0;i--){
            System.out.print(try1[i]);
        }
    }
}
