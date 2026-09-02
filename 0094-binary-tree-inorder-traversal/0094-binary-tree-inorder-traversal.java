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
    public List<Integer> inorderTraversal(TreeNode root) {
        // if (root==null )return null;
        // if (root.left==null && root.right==null)return root;

        Stack<TreeNode> st=new Stack<>();
        List<Integer> ans=new ArrayList<>();
        TreeNode curr=root;
          while(true){
           
           if(curr!=null){
               st.push(curr);
               curr=curr.left;
           }
           
           else{
               if(st.isEmpty())break;
               curr=st.pop();
               ans.add(curr.val);
               curr=curr.right;
           }
            
            
        }
        return ans;
    }
}