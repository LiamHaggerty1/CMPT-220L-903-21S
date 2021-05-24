package base;

class maxNode {
    int data;
    maxNode left, right;

    public maxNode(int data)
    {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
    maxNode root;
    static int findMax(maxNode node)
    {
        if (node == null)
            return Integer.MIN_VALUE;

        int res = node.data;
        int lres = findMax(node.left);
        int rres = findMax(node.right);

        if (lres > res)
            res = lres;
        if (rres > res)
            res = rres;
        return res;
    }

    public static void main(String args[])
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new maxNode(27);
        tree.root.left = new maxNode(14);
        tree.root.right = new maxNode(35);
        tree.root.left.right = new maxNode(19);
        tree.root.left.left = new maxNode(10);
        tree.root.right.right = new maxNode(42);
        tree.root.right.left = new maxNode(31);

        // Function call
        System.out.println("The Maximum element is " + tree.findMax(tree.root));
    }

}