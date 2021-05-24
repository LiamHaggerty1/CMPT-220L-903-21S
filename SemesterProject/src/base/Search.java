package base;

//Goal of this file is to find if a node exists in the binary search tree
class FindBST {
    static class Node
    {
        int data;
        Node left, right;
        Node(int data)
        {
            this.data = data;
            left = right = null;
        }
    };

// Traverse the tree and find if a certain node exists
    static boolean ifNodeExists( Node node, int key)
    {
        if (node == null)
            return false;

        if (node.data == key)
            return true;
        boolean res1 = ifNodeExists(node.left, key);

        if(res1) return true;
        boolean res2 = ifNodeExists(node.right, key);

        return res2;
    }

// Defines the elements of the node
// Find out whether the integer 19 is in the BST
    public static void main(String args[])
    {
        Node root = new Node(27);
        root.left = new Node(14);
        root.left.left = new Node(10);
        root.left.right = new Node(19);
        root.right = new Node(35);
        root.right.left = new Node(31);
        root.right.right = new Node(42);

        int key = 19;

        if (ifNodeExists(root, key))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}