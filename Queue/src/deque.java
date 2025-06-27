import java.util.*;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
//
//        // dqeque have some operation
//        addFirst();
//        addLast();
//        removeFirst();
//        getLast();
//        removeLast();
//        getFirst();


        dq.addFirst(1);
        dq.addFirst(2);
        System.out.println(dq);
        dq.remove();
        System.out.println(dq);
    }
}
