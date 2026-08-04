class Solution {
    public int[][] insert(int[][] ans, int[] ni) {
        ArrayList<int[]> a = new ArrayList<>();
        ArrayList<int[]> b = new ArrayList<>();
        boolean c = true;
        for (int i = 0; i < ans.length; i++) {
            if (c && ni[0] < ans[i][0]) {
                b.add(ni);
                c = false;
            }
            b.add(ans[i]);
        }
        if (c) {
            b.add(ni);
        }
        int i = 0;

        while (i < b.size()) {
            int s = b.get(i)[0];
            int max = b.get(i)[1];

            while (i < b.size() - 1 && max >= b.get(i + 1)[0]) {

                max = Math.max(max, b.get(i + 1)[1]);
                i++;

            }
            i++;

            int[] t = { s, max };
            a.add(t);
        }

        int[][] x = new int[a.size()][2];
        for (int k = 0; k < x.length; k++) {
            x[k][0] = a.get(k)[0];
            x[k][1] = a.get(k)[1];
        }

        return x;
    }
}