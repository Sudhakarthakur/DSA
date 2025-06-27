public class CountNode {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int count(Node root){
        if(root == null){
            return 0;
        }
        int leftcount = count(root.left);
        int rightcount = count(root.right);
        int TotalNode = leftcount+rightcount;
        return TotalNode+1;
    }

    public static int sumNode(Node root){
        if(root == null){
            return 0;
        }
        int leftsum = sumNode(root.left);
        int rightsum = sumNode(root.right);
        return  leftsum+rightsum+ root.data;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(8);

        System.out.println(count(root));
        System.out.println(sumNode(root));
    }
}
