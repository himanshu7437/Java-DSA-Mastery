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
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }

    }

    public static int CountOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNodes = CountOfNodes(root.left);
        int rightNodes = CountOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    public static int sumOfNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    public static int heigth(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = heigth(root.left);
        int rigthHeight = heigth(root.right);

        int myHeight = Math.max(leftHeight, rigthHeight) + 1;

        return myHeight;
    }

    public static int diameter(Node root) { // (O(n^2))
        if (root == null) {
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = heigth(root.left) + heigth(root.right) + 1;

        return Math.max(diam3, Math.max(diam1, diam2));
    }

    static class TreeInfo {
        int ht;
        int diam;

        TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

    public static TreeInfo diameter2(Node root) {

        if (root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int mydiam = Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo myInfo = new TreeInfo(myHeight, mydiam);
        return myInfo;

    }

    public static void main(String[] args) {

        // Binary Tree Questions

        // 1. count of Nodes.

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

        // 4. diameter of tree(approach 1)

        // int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // BinaryTree tree = new BinaryTree();
        // Node root = tree.buildTree(nodes);

        // System.out.println(diameter(root));

        // 5. diameter of tree(approach 2) - more optimize (O(n))

        // int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        // BinaryTree tree = new BinaryTree();
        // Node root = tree.buildTree(nodes);

        // System.out.println(diameter2(root).diam);

        // 6. Subtree of another tree -
        // https://leetcode.com/problems/subtree-of-another-tree/description/

        /**
         * Definition for a binary tree node.
         * public class TreeNode {
         * int val;
         * TreeNode left;
         * TreeNode right;
         * TreeNode() {}
         * TreeNode(int val) { this.val = val; }
         * TreeNode(int val, TreeNode left, TreeNode right) {
         * this.val = val;
         * this.left = left;
         * this.right = right;
         * }
         * }
         */
        // class Solution {
        // public boolean isIdentical(TreeNode root, TreeNode subRoot) {
        // if (root == null && subRoot == null) {
        // return true;
        // }

        // if (root == null || subRoot == null ) {
        // return false;
        // }

        // if(root.val == subRoot.val) {
        // return isIdentical(root.left, subRoot.left) && isIdentical(root.right,
        // subRoot.right);
        // }

        // return false;
        // }
        // public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // if(subRoot == null) {
        // return true;
        // }

        // if(root == null) {
        // return false;
        // }

        // if (root.val == subRoot.val) {
        // if(isIdentical(root, subRoot)) {
        // return true;
        // }
        // }

        // return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);

        // }
        // }

    }
}
