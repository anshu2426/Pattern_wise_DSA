class Solution {
    public void postorder(TreeNode root,List<Integer>a){
        if(root==null)return ;
        postorder(root.left,a);
        postorder(root.right,a);
        a.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>a=new ArrayList<>();
        postorder(root,a);
        return a;
    }
}