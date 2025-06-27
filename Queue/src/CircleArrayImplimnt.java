public class CircleArrayImplimnt {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }


        public static boolean IsEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean IsFull(){
            return  rear+1%size==front;
        }

        public static void add(int data) {
            if (IsFull()) {
                System.out.println("Queeu is full");
                return;
            }

            // add first element
            if(front == -1){
                front =0;
            }
            rear = (rear + 1)%size;
            arr[rear] = data;
        }

        public static int remove() {
            if (IsEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int result = arr[front];
            front = (front + 1)%size;
            if(rear == front) {
                rear = front = -1;
            }else {
                front = (front+1)%size;
            }
            return result;
        }

        public static int peek() {
            if (IsEmpty()) {
                System.out.println("Qureu is Empty");
                return -1;
            }
            return arr[front];
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
