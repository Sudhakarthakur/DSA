public class Permutation {
    public static void findPermutation(String str , String ans){
        // base
        if(str.isEmpty()){    // str.length()  == 0;
            System.out.println(ans+" ");
            return;
        }
        for(int i=0; i<str.length(); i++){
            char CurrChar = str.charAt(i);
            // remove CurrChar in string
            // "abcde" = "ab" + "de"  // removed char c in this string
             String newstr = str.substring(0,i)+str.substring(i+1);
            findPermutation(newstr,ans+CurrChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str,"");
    }
}
