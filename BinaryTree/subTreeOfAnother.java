class Solution {
   
    public boolean check(TreeNode root,TreeNode subRoot){
        if(root==null&&subRoot==null)return true;
       if(root==null||subRoot==null)return false;
       if(root.val!=subRoot.val)return false;
        return check(root.left,subRoot.left)&&check(root.right,subRoot.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
       if(root==null&&subRoot==null)return true;
       if(root==null||subRoot==null)return false;
       if(root.val!=subRoot.val)return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
       return (check(root.left,subRoot.left)&&check(root.right,subRoot.right))||isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
    }
}