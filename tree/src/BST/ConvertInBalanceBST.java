package BST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ConvertInBalanceBST {
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
        public static Node CreateBST(ArrayList<Integer> Inorder, int Start , int End){

            if(Start > End){
                return null;
            }
            int Mid = (Start+End)/2;
            Node root = new Node(Inorder.get(Mid));

            root.left = CreateBST(Inorder,Start ,Mid-1);
            root.right = CreateBST(Inorder,Mid+1,End);
            return root;
        }

        //conver UnBalance BST to Balance BST


        public static void getInOrde(Node root,ArrayList<Integer> Inorder){
            if(root == null){
                return;
            }
            getInOrde(root.left,Inorder);
            System.out.println(root.data);
            getInOrde(root.right,Inorder);
        }

//        Convet Unbalace bst to balance bst

    public static Node BalanceBST(Node root) {
            // Inorder sequnce
        ArrayList<Integer> inorder = new ArrayList<>();

        // sorted Balnce BST
         root = CreateBST(inorder , 0 ,inorder.size()-1);
        return root;
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
            Node root = new Node(8);
            root.left = new Node(6);
            root.left.left = new Node(5);
            root.left.left.left = new Node(3);

            root.right = new Node(10);
            root.right.right = new Node(11);
            root.right.right.right = new Node(12);

            root = BalanceBST(root);

            LevelOrder(root);

        }
    }

