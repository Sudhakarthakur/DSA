import java.util.*;

public class UsingTwoStack {

//    public static class queue {
//        Stack<Integer> s1 = new Stack<>();
//        Stack<Integer> s2 = new Stack<>();
//
//        public boolean isEmpty() {
//            return s1.isEmpty();
//        }
//
//        public void add(int data) {
//            while (!s1.isEmpty()) {
//                s2.push(s1.peek());
//            }
//            s1.push(data);
//            while (!s2.isEmpty()) {
//                s1.push(s2.peek());
//            }
//        }
//
//        // remove
//        public int remove() {
//            if (isEmpty()) {
//                System.out.println("Queue is empty");
//                return -1;
//            }
//            return s1.pop();
//        }
//
//        // peek
//        public int peek() {
//            if (isEmpty()) {
//                System.out.println("queue is empty");
//                return -1;
//            }
//            return s1.peek();
//        }
//    }


//   Represent stack in Queue type
    public static class stack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data){
        if(!q1.isEmpty()){
            q1.add(data);
            }
        else{
            q2.add(data);
            }
        }


        public static int  pop() {
            if(isEmpty()) {
                System.out.println("empty stack");
                return -1;
            }
            int top =-1;

            // case 1
            if(!q1.isEmpty()){
                while (!q1.isEmpty()){
                    top=q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }
            else {  // case 2
                while (!q2.isEmpty()){
                    top = q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q2.add(top);
                }
            }
            return top;
        }
        public static int peek(){
            if(isEmpty()) {
                System.out.println("empty stack");
                return -1;
            }
            int top =-1;

            // case 1
            if(!q1.isEmpty()){
                while (!q1.isEmpty()){
                    top=q1.remove();
                    q2.add(top);
                }
            }
            else {  // case 2
                while (!q2.isEmpty()){
                    top = q2.remove();
                    q2.add(top);
                }
            }
            return top;
        }

    }

    public static void main(String[] args) {
//        queue q = new queue();
//        q.add(1);
//        q.add(3);
//        q.add(5);
//        while (!q.isEmpty()) {
//            System.out.println(q.peek());
//            q.remove();
//        }
//    }
//}


        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}