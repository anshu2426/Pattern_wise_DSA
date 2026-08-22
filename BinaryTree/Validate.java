class Solution {
    public void inorder(TreeNode root,ArrayList<Integer>b){
        if(root==null)return ;
        inorder(root.left,b);
        b.add(root.val);
        inorder(root.right,b);
    }
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer>b=new ArrayList<>();
        inorder(root,b);
        for(int i=0;i<b.size()-1;i++){
            if(b.get(i)>=b.get(i+1))return false;
        }
        return true;
    }
}