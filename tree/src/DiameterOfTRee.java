public class DiameterOfTRee {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lefthight = height(root.left);
        int righthight = height(root.right);
        return Math.max(lefthight,righthight)+1;
    }
    public static int diameter(Node root){
       if(root == null){
           return 0;
       }
       int leftDia = diameter(root.left);
       int lefrHig = height(root.left);
       int rightDia = diameter(root.right);
       int rightHig = height(root.right);

       int  selfDia = lefrHig+rightHig+1;

       return Math.max(selfDia,Math.max(leftDia,rightDia));

    }

    // Secand Apporach
    static class Info {
        int diam;
        int ht;
        public Info(int diam , int ht){
            this.diam =diam;
            this.ht = ht;
        }
    }

    public static Info Diameter2(Node root){
        if(root == null){
            return new Info(0,0);
        }
        Info leftInfo = Diameter2(root.left);
        Info rightInfo = Diameter2(root.right);

        int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
        int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;

        return new Info(diam,ht);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(8);

//        System.out.println(diameter(root));

        System.out.println(Diameter2(root).diam +" "+ Diameter2(root).ht);
    }
}
