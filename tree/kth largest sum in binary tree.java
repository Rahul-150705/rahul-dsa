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
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<List<Integer>>li=new LinkedList<>();
        Queue<TreeNode> que=new LinkedList<>();
        List<Long> temp=new LinkedList<>();
        if(root==null) return 0;
        que.offer(root);
        ArrayList<Long> sorted = new ArrayList<>();
        while(!que.isEmpty())
        {
            long sum=0;
            int size=que.size();
            for(int i=0;i<size;i++)
            {
                TreeNode node=que.poll();
                sum+=node.val;
                if(node.left!=null) que.offer(node.left);
                if(node.right!=null) que.offer(node.right);
            }
        temp.add(sum);
        }
        PriorityQueue<Long> pq = new PriorityQueue<>((a, b) -> Long.compare(b, a));
        pq.addAll(temp);
        for(int i=0;i<k-1;i++)
        {
            if(!pq.isEmpty())  pq.poll();
        }
        return pq.isEmpty() ? -1 :pq.poll(); 
    }
}/*pq.offer(sum);
            if (pq.size() > k) pq.poll(); // keep only k largest sums
        }

        return pq.size() < k ? -1 : pq.peek(); // k-th largest sum
    }*/
    
