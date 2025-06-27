public class Createfun {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    } 
    // define Node head aur tail
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        // create a new Node
        Node newNode = new Node(data);
        size++;

        // if linkedlist is null
        if(head == null){
            head = tail = newNode;
            return;
        }
        // newNode Next = head
        newNode.next = head;
        // head = newNode
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // add Middle
    public void addMiddle(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
         Node NewNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while (i < idx-1){
            temp = temp.next;
            i++;
        }
        NewNode.next = temp.next;
        temp.next = NewNode;
    }

    // remove first
    public int removefirst(){
        if(size == 0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // remove last
    public int removeLast(){
        if(size == 0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // prev : i = size - 2
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // Search key Node through iterative way
     public int Iterativesearch(int key){
        Node temp = head;
        int i = 0 ;

        while (temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
     }

     // search through recursive functio

    public int helper(Node head , int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next , key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recursiveSearch(int key) {
       return helper(head, key);
    }

    // reverse a LinkedList
     public void reveseLL(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev =curr;
            curr = next;
        }
        head = prev;
     }

     // remove Nth Node from lastNOde
    public void nthNode(int n){
        // find size
        int siz=0;
        Node temp =head;
        while (temp != null){
            temp =temp.next;
            siz++;
        }

        //base case
        if(n == siz){
            head = head.next;  // first NOde Remove
            return;
        }

        // got ot siz -n
        int i=1;
        int iToFind = siz-n;
        Node prev = head;
        while (i < iToFind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    // print nnode
    public void print(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Createfun ll = new Createfun();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(6);
        ll.addLast(7);
        ll.print();

//        ll.removefirst();
//        ll.print();
//        ll.removeLast();
        System.out.println(ll.recursiveSearch(90));
        ll.print();
        System.out.println(ll.recursiveSearch(3));

    }
}
