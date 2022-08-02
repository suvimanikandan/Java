package Strings;

public class ComparingTwoString{
public static void main(String[] args) {
    String str="hello world";
    String anotherString="Hello World";
    Object objStr=str;
    System.out.println(str.compareTo(anotherString));
    System.out.println(str.compareToIgnoreCase(str));
    System.out.println(str.compareTo(objStr.toString()));
}
}