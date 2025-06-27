package Ac;

import java.util.Stack;

public class implimment {

    // stack implimentatio using java util class

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(21);
        st.push(23);
        st.push(254);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
