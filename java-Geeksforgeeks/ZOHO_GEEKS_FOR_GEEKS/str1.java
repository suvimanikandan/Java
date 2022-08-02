package ZOHO_GEEKS_FOR_GEEKS;

//Java Program to get a character from a String
public class str1 {
    public static char
    getCharFromString(String str,int index){
        return str.charAt(index);
    }
    public static void main(String[] args) {
        String str="swetha";
        int index=3;

        char ch=getCharFromString(str,index);
        System.out.println("Character from " + str + " at index " + index + " is " + ch);

        
    }
}
