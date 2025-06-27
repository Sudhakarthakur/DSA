import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class implimentation {
        static class Queue {
            static int arr[];
            static int size;
            static int rear;

            Queue(int n) {
                arr = new int[n];
                size = n;
                rear = -1;
            }


            public static boolean IsEmpty() {
                return rear == -1;
            }

            public static void add(int data) {
                if (rear == size - 1) {
                    System.out.println("Queeu is full");
                    return;
                }
                rear = rear + 1;
                arr[rear] = data;
            }

            public static int remove() {
                if (IsEmpty()) {
                    System.out.println("Queue is Empty");
                    return -1;
                }
                int front = arr[0];   // 4
                for (int i = 0; i < rear; i++) {
                    arr[i] = arr[i + 1];
                }
                rear--;
                return front;
            }

            public static int peek() {
                if (IsEmpty()) {
                    System.out.println("Qureu is Empty");
                    return -1;
                }
                return arr[0];
            }
        }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        while (!q.IsEmpty()){
            System.out.println(q.peek());
            q.remove();
        }


    }
}