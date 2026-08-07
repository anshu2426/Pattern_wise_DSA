class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>a=new Stack<>();
        int[] ans=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            while(a.size()>0&&a.peek()<=nums[i]){
                a.pop();
            }
            if(a.size()==0)ans[i]=-1;
            else ans[i]=a.peek();
            a.push(nums[i]);
        }
        for(int i=nums.length-1;i>=0;i--){
            while(a.size()>0&&a.peek()<=nums[i]){
                a.pop();
            }
            if(a.size()==0)ans[i]=-1;
            else ans[i]=a.peek();
            a.push(nums[i]);
        }
        return ans;
    }
}