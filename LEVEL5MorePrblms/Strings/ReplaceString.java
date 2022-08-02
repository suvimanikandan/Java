package Strings;

public class ReplaceString {
    public static void main(String[] args) {
        String str="hello world";
         System.out.println(str.replace('h','a'));
         System.out.println(str.replaceFirst("he", "we"));
         System.out.println(str.replaceAll("wo", "bb"));
    }
   
}
