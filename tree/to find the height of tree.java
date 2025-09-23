/*
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
    int height(Node node) {
        if(node==null)
        {
            return -1;
        }
        int x=height(node.left);
        int y=height(node.right);
        return 1+Math.max(x,y);
    }
}
