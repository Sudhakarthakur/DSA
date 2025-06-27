package Ac;

import java.util.Stack;

public class PushAtBottom {
    public static void pushAtBottom(Stack<Integer> st , int data){
        // base case
        if(st.isEmpty()){
            st.push(data);
            return;
        }
        int top = st.pop();
        pushAtBottom(st,data);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        pushAtBottom(st,32);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        pushAtBottom(st,6);
        while (!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
