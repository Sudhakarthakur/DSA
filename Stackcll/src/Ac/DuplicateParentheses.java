package Ac;

import java.util.Stack;

public class DuplicateParentheses {
     public static boolean IsDuplicate(String str){
         Stack<Character> s = new Stack<>();
         for(int i=0; i<str.length(); i++){
             char currchar = str.charAt(i);

             if(currchar == ')'){
                 int count = 0;
                 while (s.peek() != '('){
                     s.pop();
                     count++;
                 }
                 if(count < 1){
                     return true;
                 }else {
                     s.pop();
                 }
             }else {
                 s.push(currchar);
             }
         }
         return false;
     }

    public static void main(String[] args) {
      String str = "((a+b)+(a-b))";
      String str1 = "((a+b))";
        System.out.println(IsDuplicate(str1));
    }
}
