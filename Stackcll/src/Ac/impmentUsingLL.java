package Ac;

public class impmentUsingLL {
    static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head = null;

        // empty fun
        public static boolean isEmpty(){
//            if(head == null);
//            return true;
            return head == null;
        }

        // push function
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // pop
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
//        impmentUsingLL s = new impmentUsingLL();
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(21);
        s.push(23);
        s.push(25);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
