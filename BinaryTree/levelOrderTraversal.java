class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode>a=new ArrayDeque<>();
        List<List<Integer>>ans=new ArrayList<>();
       if(root!=null) a.add(root);
        while(a.size()>0){
            List<Integer>x=new ArrayList<>();
            int k=a.size();
            while(k!=0){
                TreeNode t=a.remove();
               if(t.left!=null) a.add(t.left);
               if(t.right!=null) a.add(t.right);
                x.add(t.val);
                k--;
            }
            ans.add(x);
        }
        return ans;
    }
}