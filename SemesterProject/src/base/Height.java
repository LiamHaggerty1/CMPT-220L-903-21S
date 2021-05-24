package base;

// Find the Height of a tree
class Node {
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class heightBST
{
    Node root;
    int maxHeight(Node node)
    {
        if (node == null)
            return 0;
        else
        {
            int lHeight = maxHeight(node.left);
            int rHeight = maxHeight(node.right);
            if (lHeight > rHeight)
                return (lHeight + 1);
            else
                return (rHeight + 1);
        }
    }
// Main code that will find the height
    public static void main(String[] args)
    {
        heightBST tree = new heightBST();

        tree.root = new Node(27);
        tree.root.left = new Node(14);
        tree.root.right = new Node(35);
        tree.root.left.left = new Node(10);
        tree.root.left.right = new Node(19);
        tree.root.right.left = new Node(31);
        tree.root.right.right = new Node(42);

        System.out.println("The height of the BST is : " + tree.maxHeight(tree.root));
    }
}