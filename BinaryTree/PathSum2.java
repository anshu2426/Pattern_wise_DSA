class Solution {
    public void check(TreeNode root,List<List<Integer>>a,List<Integer>b,int t){
        if(root==null)return ;
        if(root.left==null&&root.right==null){
            if(t==root.val){
                b.add(root.val);
                List<Integer>c=new ArrayList<>(b);
                a.add(c);
                b.remove(b.size()-1);
                return ;

            }
             return ;
        }
        b.add(root.val);
        check(root.left,a,b,t-root.val);
        check(root.right,a,b,t-root.val);
        b.remove(b.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int t) {
        List<List<Integer>>a=new ArrayList<>();
        if(root==null)return a;
        List<Integer>b=new ArrayList<>();
        check(root,a,b,t);
        return a;
    }
}