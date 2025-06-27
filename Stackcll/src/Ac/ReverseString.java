package Ac;

import java.util.Stack;

public class ReverseString {

    //  returen void tupe
    public static void reverse(String str){
        Stack<Character> ch = new Stack<>();
        int idx = 0;
        while (idx < str.length()){
            ch.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder();
        while (!ch.isEmpty()){
            char curr = ch.pop();
            result.append(curr);
        }
        str = result.toString();
        System.out.println(str);
    }

    // retuen string type
    public static String reverse2(String str){
        Stack<Character> ch = new Stack<>();
        int idx = 0;
        while (idx < str.length()){
            ch.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder();
        while (!ch.isEmpty()){
            char curr = ch.pop();
            result.append(curr);
        }
        str = result.toString();
//        System.out.println(str);
        return str;
    }

    public static void main(String[] args) {
        String str = "sudhakar";
        System.out.println(reverse2(str));

    }
}
