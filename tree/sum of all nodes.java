/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    static int sumBT(Node root) {
        if(root==null)
        {
            return 0;
        }
        return sumBT(root.left)+sumBT(root.right)+root.data;
    }
}
