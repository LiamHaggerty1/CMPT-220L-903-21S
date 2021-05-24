package base;
// The goal of this is to delete a node from an already defined binary search tree
import java.util.LinkedList;
import java.util.Queue;

class delBST{
    static class delNode
    {
        int key;
        delNode left, right;
        delNode(int key)
        {
            this.key = key;
            left = null;
            right = null;
        }
    }
    static delNode root;
    static delNode temp = root;
    static void inorder(delNode temp)
    {
        if (temp == null)
            return;
        inorder(temp.left);
        System.out.print(temp.key + " ");
        inorder(temp.right);
    }
    static void deleteDeepest(delNode root, delNode delNode)
    {
        Queue<delNode> q = new LinkedList<delNode>();
        q.add(root);
        delNode temp = null;
        while (!q.isEmpty())
        {
            temp = q.peek();
            q.remove();
            if (temp == delNode)
            {
                temp = null;
                return;
            }
            if (temp.right!=null)
            {
                if (temp.right == delNode)
                {
                    temp.right = null;
                    return;
                }
                else
                    q.add(temp.right);
            }
            if (temp.left != null)
            {
                if (temp.left == delNode)
                {
                    temp.left = null;
                    return;
                }
                else
                    q.add(temp.left);
            }
        }
    }

    static void delete(delNode root, int key)
    {
        if (root == null)
            return;
        if (root.left == null &&
                root.right == null)
        {
            if (root.key == key)
            {
                root=null;
                return;
            }
            else
                return;
        }

        Queue<delNode> q = new LinkedList<delNode>();
        q.add(root);
        delNode temp = null, keyNode = null;
        while (!q.isEmpty())
        {
            temp = q.peek();
            q.remove();
            if (temp.key == key)
                keyNode = temp;
            if (temp.left != null)
                q.add(temp.left);
            if (temp.right != null)
                q.add(temp.right);
        }
        if (keyNode != null)
        {
            int x = temp.key;
            deleteDeepest(root, temp);
            keyNode.key = x;
        }
    }
// Main code that will be executed
    public static void main(String args[])
    {
        root = new delNode(27);
        root.left = new delNode(14);
        root.left.left = new delNode(10);
        root.left.right = new delNode(19);
        root.right = new delNode(35);
        root.right.left = new delNode(31);
        root.right.right = new delNode(42);

        System.out.print("Deletion of integer 19 from ");
        inorder(root);

        int key = 19;
        delete(root, key);

        System.out.print("\nAfter deletion:");
        inorder(root);
    }
}