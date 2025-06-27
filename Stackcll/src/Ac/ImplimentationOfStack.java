package Ac;
import java.util.ArrayList;
          //  Implimentation of stack using ArrayList
public class ImplimentationOfStack {
    static class stack{
        static ArrayList<Integer> list = new ArrayList<>();
        //find stack is empty or nnot
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        // push
        public static void push(int data)
        {
            list.add(data);
        }

        //pop
        public static int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
             return top;
        }
        // peak
        public static int peek(){
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}