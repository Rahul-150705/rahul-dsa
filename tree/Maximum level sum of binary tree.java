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
    public int maxLevelSum(TreeNode root) {
        List<List<Integer>>li=new LinkedList<>();
        Queue<TreeNode> que=new LinkedList<>();
        List<Integer> temp=new LinkedList<>();
        if(root==null) return 0;
        que.offer(root);
        int max = Integer.MIN_VALUE;
        int count=0;
        int v=0;
        while(!que.isEmpty())
        {
            int sum=0;
            int size=que.size();
            count++;
            for(int i=0;i<size;i++)
            {
                TreeNode node=que.poll();
                sum+=node.val;
                if(node.left!=null) que.offer(node.left);
                if(node.right!=null) que.offer(node.right);
            }
            if(sum>max)
            {
                max=sum;
                v=count;
            }
        }
        return v;
    }
}
