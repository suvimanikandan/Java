public class Anagram{
    public static void main(String[] args) {
        String str1="care";
        String str2="race";

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        if(str1.length()==str2.length()){

        char[]charArray1=str1.toCharArray();
        char[]charArray2=str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        boolean result=Arrays.equal(charArray1,charArray2);

        if(result){
            System.out.println(str1 + " and" + str2 + "are anagram");
        }
        else
        System.out.println(str1  + " and "+ str2 +  "are not anagram");
  }
}
}