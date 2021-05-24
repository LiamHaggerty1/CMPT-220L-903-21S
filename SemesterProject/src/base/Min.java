package base;

class minNode {
    int data;
    minNode left, right;

    public minNode(int data)
    {
        this.data = data;
        left = right = null;
    }
}

class minBST {
    minNode root;

    // Returns the max value in a binary tree
    static int findMin(minNode node)
    {
        if (node == null)
            return Integer.MAX_VALUE;

        int res = node.data;
        int lres = findMin(node.left);
        int rres = findMin(node.right);

        if (lres < res)
            res = lres;
        if (rres < res)
            res = rres;
        return res;
    }

    /* Driver code */
    public static void main(String args[]) {
        minBST tree = new minBST();
        tree.root = new minNode(27);
        tree.root.left = new minNode(14);
        tree.root.right = new minNode(35);
        tree.root.left.right = new minNode(19);
        tree.root.left.left = new minNode(10);
        tree.root.right.right = new minNode(42);
        tree.root.right.left = new minNode(31);

        // Function call
        System.out.println("The Minimum element is " + tree.findMin(tree.root));
    }
}