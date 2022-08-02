package ZOHO_GEEKS_FOR_GEEKS;

public class Str3 {
    public static void main(String[] args) {
     /*    String str="Swetha",rstr=" ";
        char ch;
        System.out.println("Original word");
        System.out.println("swetha");

        for(int i=0;i<str.length();i++){
            ch= str.charAt(i);
            rstr=ch+rstr;;
            System.out.println("Reserved word "+rstr);
        }
    }*/
    String input="swetha";
    StringBuilder str=new StringBuilder();
    //append a striong into the string builder
    str.append(input);

    //reverse the stringbuilder str
    str.reverse();

    //print the reserved string
    System.out.println(str);
    
}
}   