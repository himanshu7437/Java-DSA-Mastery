import java.util.*;

public class binaryTree5 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void levelOrder(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) { 
            Node currNode = q.remove();
            if(currNode == null) {
                System.out.println();
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data+ " ");
                if(currNode.left != null) {
                    q.add(currNode.left);
                }
                if(currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
        
    }

    public static int CountOfNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int leftNodes = CountOfNodes(root.left);
        int rightNodes = CountOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    public static int sumOfNodes(Node root) {
        if(root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    public static int heigth(Node root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = heigth(root.left);
        int rigthHeight = heigth(root.right);

        int myHeight = Math.max(leftHeight, rigthHeight) + 1;

        return myHeight;
    }



    public static void main(String[] args) {

        // Binary Tree Questions

        //1. count of Nodes.

        // int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // BinaryTree tree = new BinaryTree();
        // Node root = tree.buildTree(nodes);
        
        // System.out.println(CountOfNodes(root));

        // 2. sum of nodes

        // int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // BinaryTree tree = new BinaryTree();
        // Node root = tree.buildTree(nodes);

        // System.out.println(sumOfNodes(root));

        // 3. height of tree

        // int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // BinaryTree tree = new BinaryTree();
        // Node root = tree.buildTree(nodes);

        // System.out.println(heigth(root));

        // 4. diameter of tree

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);




    }
}
