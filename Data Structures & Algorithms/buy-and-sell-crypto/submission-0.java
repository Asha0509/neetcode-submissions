class Solution {
    public int maxProfit(int[] p) {
        int min = p[0];
        int ans = 0;
        for(int i = 0;i<p.length;i++){
            min = Math.min(p[i],min);

            ans = Math.max(ans,p[i]-min);
        }
        return ans;
        
    }
}
