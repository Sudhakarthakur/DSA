import java.util.ArrayList;

public class LowestCommonAncestor {
        static class Node {
            int data;
            Node left;
            Node right;

            Node(int data){
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }

        // 1 st Apporach
      public static boolean getpath(Node root , int n , ArrayList<Node> path){
            if(root == null){
                return false;
            }
            path.add(root);

            if(root.data == n){
                return true;
            }

            boolean foundLeft = getpath(root.left , n ,path);
            boolean foundright = getpath(root.right,n,path);

            if(foundLeft || foundright){
                return true;
            }else {
                path.remove(path.size()-1);
            }
            return false;
      }

      public static Node LCA (Node root , int n1  ,int n2){
            ArrayList<Node>  path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            getpath(root,n1,path1);
            getpath(root,n2,path2);

            int i=0;
            for( ; i<path1.size() && i<path2.size(); i++){
                if(path1.get(i) != path2.get(i)){
                    break;
                }
            }
            Node lca = path1.get(i-1);
            return lca;
      }

      // 2nd Apporch
    public static Node LCA2(Node root , int n1 , int n2){
            if(root == null || root.data == n1 || root.data==n2){
                return root;
            }
            Node leftlca = LCA2(root.left , n1,n2);
            Node rightlca = LCA2(root.right,n1,n2);

            if(leftlca == null){
                return rightlca;
            }
            if(rightlca == null){
                return leftlca;
            }
            return root;
    }


    // find min distance between two nodes
    public static int FindMinDist(Node root , int n1 , int n2){
            Node lca = LCA2(root ,n1,n2);
            int dist1 = lcaDist(lca , n1);
            int dist2 = lcaDist(lca , n2);

            return dist1+dist2;
    }

    public static int lcaDist(Node root , int n){
            if(root == null){
                return -1;
            }

            if(root.data == n){
                return 0;
            }

            int leftdist = lcaDist(root.left,n);
            int rightdist = lcaDist(root.right,n);

            if(leftdist == -1 && rightdist == -1){
                return -1;
            } else if (leftdist == -1) {
                return rightdist+1;
            }else {
                return leftdist+1;
            }
    }


    public static int Transform(Node root){
            if(root == null){
                return 0;
            }
            int leftchild = Transform(root.left);
            int rightchild = Transform(root.right);

            int data = root.data;

            int newleft = root.left == null ? 0 : root.left.data;
            int newright = root.right == null ? 0 : root.right.data;


            root.data = newleft+leftchild + newright+rightchild;
            return data;
    }

    public static void preorder(Node root){
            if(root == null){
                return;
            }

        System.out.print (root.data+" ");
            preorder(root.left);
            preorder(root.right);
    }

        public static void main(String[] args) {
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);


//            System.out.println(LCA2(root,4 ,7).data);

            System.out.println(FindMinDist(root,4,6));

             Transform(root);
             preorder(root);

        }
    }

