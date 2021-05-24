package base;
// Goal of this is to put the binary search tree into preorder and postorder
class orderNode {
    int key;
    orderNode left, right;
    public orderNode(int item)
    {
        key = item;
        left = right = null;
    }
}
class orderBST {
    Node root;
    orderBST() { root = null; }
    void printPostorder(Node node)
    {
        if (node == null)
            return;
        printPostorder(node.left);
        printPostorder(node.right);
        //System.out.print(node.key + " ");
    }
// Preorder Node
    void printPreorder(Node node)
    {
        if (node == null)
            return;

        //System.out.print(node.key + " ");

        printPreorder(node.left);

        printPreorder(node.right);
    }

    void printPostorder() { printPostorder(root); }
    void printPreorder() { printPreorder(root); }
// Add the new nodes into the BST
    public static void main(String[] args)
    {
        orderBST tree = new orderBST();
        //tree.root = new orderNode(27);
        //tree.root.left = new orderNode(14);
        //tree.root.right = new orderNode(35);
        //tree.root.left.left = new orderNode(10);
        //tree.root.left.right = new orderNode(19);
        //tree.root.right.left = new orderNode(31);
        //tree.root.right.right = new orderNode(42);
// Print the preorder
        System.out.println("The preorder line is: ");
        tree.printPreorder();
// Print the postorder
        System.out.println("\nThe postorder line is: ");
        tree.printPostorder();
    }
}