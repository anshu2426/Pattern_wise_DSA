class Solution {
    public void backtracking(List<List<Integer>>a,ArrayList<Integer>x,int[] nums){
        if(x.size()==nums.length){
            ArrayList<Integer>t=new ArrayList<>();
            for(int i=0;i<x.size();i++){
                t.add(x.get(i));
            }
            a.add(t);
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=-11){
                x.add(nums[i]);
                nums[i]=-11;
                backtracking(a,x,nums);
                nums[i]=x.get(x.size()-1);
                x.remove(x.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>a=new ArrayList<>();
        ArrayList<Integer>x=new ArrayList<>();
        backtracking(a,x,nums);
        return a;
    }
}