class Solution {
    public int totalFruit(int[] fruits) {
        int max=0;
        int i=0,j=0;
        HashMap<Integer,Integer>a=new HashMap<>();
        while(j<fruits.length){
           a.put(fruits[j], a.getOrDefault(fruits[j], 0) + 1);
            if(a.size()>2){
                max=Math.max(max,j-i);
                while(i<=j&&a.size()>2){
                    a.put(fruits[i],a.get(fruits[i])-1);
                    if(a.get(fruits[i])==0)a.remove(fruits[i]);
                    i++;
                }

            }
            j++;
        }
        if(a.size()<=2)max=Math.max(max,j-i);
        return max;
    }
}