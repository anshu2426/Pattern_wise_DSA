class Solution {
    public void preorder(TreeNode root,List<Integer>a){
        if(root==null)return ;
        a.add(root.val);
        preorder(root.left,a);
        preorder(root.right,a);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>a=new ArrayList<>();
        preorder(root,a);
        return a;
    }
}