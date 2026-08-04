class Solution {
    public int[][] merge(int[][] in) {
        ArrayList<int[]>a=new ArrayList<>();
        Arrays.sort(in,(c,d)->(c[0]-d[0]));
        int i=0;
        while(i<in.length){
            int max=in[i][1];
            int s=in[i][0];
                while(i!=in.length-1&&max>=in[i+1][0]){
                    max=Math.max(max,in[i+1][1]);
                    i++;
                }
            int[] t={s,max};
            a.add(t);
            i++;
        }
        int[][] b=new int[a.size()][2];
        for(int k=0;k<b.length;k++){
            b[k][0]=a.get(k)[0];
            b[k][1]=a.get(k)[1];
        }
        return b;
    }
}