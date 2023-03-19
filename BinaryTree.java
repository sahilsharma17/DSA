import java.util.*;

public class BinaryTree {
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
    // creating a binary tree
    static class BuildBinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
    // traversing through a binary tree in preorder sequence using recursion,
    // Time complexity = O(n)
    public static void preorder(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    // traversing through a binary tree in inorder sequence using recursion,             
    // Time complexity = O(n)
    public static void inorder(Node root){
        if (root == null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    // traversing through a binary tree in postorder sequence using recursion,
    // Time complexity = O(n)
    public static void postorder(Node root){
        if (root == null){
            return ;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    // traversing through a binary tree in level order traversal,
    // Time complexity = O(n)

    public static void levelorder(Node root){
        if (root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node cur = q.remove();
            if (cur==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(cur.data+" ");
                if (cur.left != null) {
                    q.add(cur.left);
                }
                if (cur.right != null){
                    q.add(cur.right);
                }
            }
        }
    }

    // counting the number of nodes in the binary tree
    public static int countOfNodes(Node root){
        if (root == null){ return 0;}
        return countOfNodes(root.right) + countOfNodes(root.left) + 1;
    }

    // calculating the sum of nodes in the binary tree
    public static int sumOfNodes(Node root){
        if (root == null){ return 0;}
        return sumOfNodes(root.left) + sumOfNodes(root.right) + root.data;
    }   
    
    // counting the number of nodes in the binary tree
    public static int heightOfTree(Node root){
        if (root == null){ return 0;}
        return Math.max(heightOfTree(root.left), heightOfTree(root.right)) + 1;
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BuildBinaryTree tree = new BuildBinaryTree();
        Node root = tree.buildTree(nodes);
        //System.out.println(root.data);

        // preorder(root);
        // System.out.println();

        // inorder(root);
        // System.out.println();

        // postorder(root);
        // System.out.println();

        // levelorder(root);
        // System.out.println();

        System.out.println(countOfNodes(root));

        System.out.println(sumOfNodes(root));

        System.out.println(heightOfTree(root));

    }
}
