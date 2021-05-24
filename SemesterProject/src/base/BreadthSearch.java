package base;
// Goal of this is to breadth search the BST
import java.util.LinkedList;
import java.util.Queue;
// Define node
class breBST {
    class breNode {
        int data;
        base.Node left;
        base.Node right;

        public breNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
// Insert Queue into the function
    public void levelOrderQueue(breNode root) {
        Queue<breNode> q = new LinkedList<breNode>();
        if (root == null)
            return;
        q.add(root);
        while (!q.isEmpty()) {
            breNode n = (breNode) q.remove();
            System.out.print(" " + n.data);
            if (n.left != null)
                //q.add(n.left);
            if (n.right != null);
                //q.add(n.right);
        }
    }
// Main code to execute the goal
    public static void main(String[] args) {
        //breNode root = new breNode(27);
        //root.left = new breNode(14);
        //root.right = new breNode(35);
        //root.left.left = new breNode(10);
        //root.left.right = new breNode(19);
        //root.right.left = new breNode(31);
        //root.right.right = new breNode(42);

        breBST i = new breBST();
        System.out.println("Breadth First Search : ");
        //i.levelOrderQueue(root);
    }
}

