class Solution {
    public void inorder(TreeNode root,List<Integer>a){
        if(root==null)return ;
        inorder(root.left,a);
        a.add(root.val);
        inorder(root.right,a);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>a=new ArrayList<>();
        inorder(root,a);
        return a;
    }
}