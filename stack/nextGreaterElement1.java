class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer>a=new Stack<>();
        HashMap<Integer,Integer>b=new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(a.size()>0&&a.peek()<=nums2[i]){
                a.pop();
            }
            if(a.size()==0)b.put(nums2[i],-1);
            else b.put(nums2[i],a.peek());
            a.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            nums1[i]=b.get(nums1[i]);
        }
        return nums1;
    }
}