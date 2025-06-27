package Ac;

import java.util.Stack;

    public class ReverseNumer {
        public static void pushAtBottom(Stack<Integer> st, int data) {
            // base case
            if (st.isEmpty()) {
                st.push(data);
                return;
            }
            int top = st.pop();
            pushAtBottom(st, data);
            st.push(top);
        }

        // reverse code
        public static void reverse(Stack<Integer> st){
            if(st.isEmpty()){
                return;
            }

            int top = st.pop();
            reverse(st);
            pushAtBottom(st,top);
        }

        public static void print(Stack<Integer> st){
            while (!st.isEmpty()){
                System.out.println(st.peek());
                st.pop();
            }
//            System.out.println();
        }

        public static void main(String[] args) {
            Stack<Integer> st = new Stack<>();
            st.push(2);
            st.push(3);
            st.push(4);
            st.push(5);
//            print(st);
            reverse(st);
            print(st);

        }
    }