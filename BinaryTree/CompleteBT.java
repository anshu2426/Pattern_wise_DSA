class Solution {
   
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode>a=new ArrayDeque<>();
        boolean c=true;
        a.add(root);
        while(a.size()>0){
            int k=a.size();
            while(k>0){
                TreeNode t=a.remove();
              if(t.left!=null){
                if(c==false)return false;
                a.add(t.left);
              }
              else c=false;
               if(t.right!=null){ 
                if(c==false)return false;
                a.add(t.right);
                }
               else c=false;
               k--;
            }
        }
        return true;
    }
}