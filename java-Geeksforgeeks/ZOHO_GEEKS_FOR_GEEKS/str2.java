package ZOHO_GEEKS_FOR_GEEKS;

public class str2 {
    //get the string
    public static void main(String[] args) {
        /*String str="Swethamaiikandan";
        int index=8;
        char ch='n';
        System.out.println("The orginal string = " + str);

        str=str.substring(0,index) + ch + str.substring(index + 1);
        System.out.println("Mo0dified string = " + str); */

        String str="swethamaiikandan";
        int index=8;
        char ch='n';
        System.out.println("The original string=" + str);

        StringBuilder string =new StringBuilder(str);
        string.setCharAt(index,ch);

        //print the modified the string
        System.out.println("modified string= " +string);
    }
}
