class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        Queue<TreeNode>a=new ArrayDeque<>();
        if(root!=null)a.add(root);
      
        while(a.size()>0){
            int k=a.size();
            List<Integer>x=new ArrayList<>();
            while(k>0){
              TreeNode t=a.remove();
            if(t.left!=null)a.add(t.left);
            if(t.right!=null)a.add(t.right);
             x.add(t.val);
             k--;
            }
            ans.addFirst(x);
        }
        return ans;
    }
}