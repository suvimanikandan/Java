package ZOHO_GEEKS_FOR_GEEKS;

import java.util.Stack;

//reverse a string using stack
public class Str4 {
    public static String ReverseString(String str){
   char[] reverseString=new char[str.length()];

   //declare a stack  of type character
   Stack<Character> stack=new Stack<Character>();
   for(int i=0;i<str.length();i++){
    stack.push(str.charAt(i));
   }
   //now pop the character 
   int i=0;
   while(!stack.isEmpty()){
    reverseString[i++]=stack.pop();
}
return new String(reverseString);
    }
    public static void main(String[] args) {
        String str1="swetha";
        System.out.println(str1 + "<- Reverse ->" +ReverseString(str1));
    String str2="hello world";
    System.out.println(str2 + "<- Reverse ->" +ReverseString(str2));
    }
}
