class Solution {
    boolean c;
    public void inorder(TreeNode root,HashSet<Integer>a,int k){
        if(root==null)return ;
        if(c)return ;
        
        if(a.contains(k-root.val)){
            c=true;
            return;
        }
        a.add(root.val);
         inorder(root.left,a,k);
         inorder(root.right,a,k);
    }
    public boolean findTarget(TreeNode root, int k) {
        c=false;
        HashSet<Integer>a=new HashSet<>();
        inorder(root,a,k);
        return c;
    }
}