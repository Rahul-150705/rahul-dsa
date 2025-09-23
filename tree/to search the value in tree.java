/*
class Node {
    int data;
    Node left;
    Node right;
    Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

class BST {
    boolean search(Node root, int x) {
        if(root==null)
        {
            return false;
        }
        if(root.data==x)
        {
            return true;
        }
        return search(root.left,x)||search(root.right,x);
    }
}
