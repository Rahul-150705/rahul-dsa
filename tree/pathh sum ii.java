/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void path(TreeNode root,int targetSum,List<Integer> temp,List<List<Integer>> li)
    {
        if(root==null) return;
        temp.add(root.val);
        if(root.left==null && root.right==null && root.val==targetSum)
        {
            li.add(new ArrayList<>(temp));
        }
        else 
        {
            path(root.left,targetSum-root.val,temp,li);
            path(root.right,targetSum-root.val,temp,li);
        }
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) { 
        List<List<Integer>> li=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        path(root,targetSum,temp,li);
        return li;

    }
}
