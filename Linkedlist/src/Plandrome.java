public class Plandrome {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // define Node head aur tail
    public static Node head;
    public static Node tail;
    public static int size;


    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }


    // check LL is a palindrome or not
    // slow fast Approach to find MidNode
    public Node findMid(Node head) {
        Node Slow = head;
        Node fast = head;
        if (fast != null && fast.next != null) {
            Slow = Slow.next;
            fast = fast.next.next;
        }
        return Slow;
    }

    public boolean check() {
        // Base case
        if (head == null || head.next == null) {
            return true;
        }
        // step 1 to find midNode
        Node midNode = findMid(head);

        // step 2 to reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        // step 3 to check left half or right half equal to or not
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    // print node
    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Plandrome ll = new Plandrome();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();

        System.out.println(ll.check());
    }
}
