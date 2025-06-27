package BST;

import java.util.LinkedList;
import java.util.Queue;

public class BulitBalanceBST {
    static class Node{
        Node left;
        Node right;
        int data;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Built Balance Binary Search Tree
    public static Node CreateBST(int[] arr, int Start , int End){

        if(Start > End){
            return null;
        }
        int Mid = (Start+End)/2;
        Node root = new Node(arr[Mid]);

        root.left = CreateBST(arr,Start ,Mid-1);
        root.right = CreateBST(arr,Mid+1,End);
        return root;
    }

    //conver UnBalance BST to Balance BST


    public static void PreOrde(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        PreOrde(root.left);
        PreOrde(root.right);
    }

    // for level order travesal
    public static void LevelOrder(Node root){
        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
         q.add(null);

         while (!q.isEmpty()){
             Node CurrNode = q.remove();
             if(CurrNode == null){
                 System.out.println();
                 if(q.isEmpty()){
                     break;
                 }else {
                     q.add(null);
                 }
             }else {
                 System.out.print(CurrNode.data+" ");
                 if(CurrNode.left != null){
                     q.add(CurrNode.left);
                 }
                 if(CurrNode.right != null){
                     q.add(CurrNode.right);
                 }
             }
         }
    }
    public static void main(String[] args) {
      int[] arr = {3,5,6,8,10,11,12};

     Node root = CreateBST(arr , 0 , arr.length-1);
//      PreOrde(root);

        LevelOrder(root);

    }
}
