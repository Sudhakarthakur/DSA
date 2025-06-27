import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reversal {
    public static void reverrse(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();

        while (!q.isEmpty()){
            st.push(q.remove());
        }

        while (!st.isEmpty()){
            q.add(st.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(6);
        q.add(7);

        reverrse(q);

        while (!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
