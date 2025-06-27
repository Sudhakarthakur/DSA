package BST;

public class LargstBSTinBT {
    static class Node{
        Node left;
        Node right;
        int val;

        Node(int val){
            this.val=val;
        }
    }

    static class Info {
        boolean IsBST;
        int max;
        int min;
        int size;

        Info(boolean IsBST , int min , int max , int size){
            this.IsBST = IsBST;
            this.min = min;
            this.max = max;
            this.size = size;
        }
    }

    public static int maxBST = 0;
    public static Info LargestBST(Node root){
        if(root == null) {
            return new Info(true ,Integer.MAX_VALUE ,Integer.MIN_VALUE ,0);
        }


        Info LeftInfo = LargestBST(root.left);
        Info RightInfo = LargestBST(root.right);

        int size = LeftInfo.size + RightInfo.size + 1;

        int min = Math.min(root.val ,Math.min(LeftInfo.min,RightInfo.min));
        int max = Math.max(root.val,Math.max(LeftInfo.max,LeftInfo.max));

        if(root.val >= RightInfo.min || root.val <= LeftInfo.max){
            return new Info(false,min,max,size);
        }

        if(LeftInfo.IsBST && RightInfo.IsBST){
            maxBST = Math.max(maxBST,size);
            return new Info(true,min,max,size);
        }
        return new Info(false,min,max,size);
    }
    public static void main(String[] args) {

        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        Info info =  LargestBST(root);

        System.out.println("MAx Size of BSt in bt"+ maxBST);
    }
}
