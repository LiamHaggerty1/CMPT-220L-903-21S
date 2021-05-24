package base;

//Creating the original binary search tree with nodes and elements
class BinarySearchTree {
// initializing nodes that go left and right
    class Node
    {
        int key;
        Node left, right;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }

    Node root;

    BinarySearchTree()
    {
        root = null;
    }

//Inserting rec
    void insert(int key)
    {
        root = insertRec(root, key);
    }

// Using rec to insert a new node
    Node insertRec(Node root, int key)
    {

// Is root is empty return back
        if (root == null)
        {
            root = new Node(key);
            return root;
        }

// If not, continue with the BST
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
        return root;
    }
    void inorder()
    {
        inorderRec(root);
    }
    void inorderRec(Node root)
    {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
// Finally, defines the elements of the search tree
    public static void main(String[] args)
    {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(27);
        tree.insert(14);
        tree.insert(10);
        tree.insert(19);
        tree.insert(35);
        tree.insert(31);
        tree.insert(42);
// Print the tree in order
        tree.inorder();
    }
}