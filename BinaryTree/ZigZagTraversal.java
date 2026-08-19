class Solution {
    public List<Integer> reverse(List<Integer>a){
        int i=0,j=a.size()-1;
        while(i<j){
            int t=a.get(i);
            a.set(i,a.get(j));
            a.set(j,t);
            i++;
            j--;
        }
        return a;
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode>a=new ArrayDeque<>();
        List<List<Integer>>ans=new ArrayList<>();
      if(root!=null)  a.add(root);
        int c=0;
        while(a.size()>0){
            int k=a.size();
            List<Integer>x=new ArrayList<>();
            while(k!=0){
                TreeNode t=a.remove();
                    if(t.left!=null)a.add(t.left);
                    if(t.right!=null)a.add(t.right);
                    x.add(t.val);
                k--;
            }
           if(c%2==0) ans.add(x);
          else ans.add(reverse(x));
          c++;
        }
        return ans;
    }
}