class Solution {
    public int trap(int[] h) {
        int n = h.length;
        int max = 0;
        int pre [] = new int [n];
        int suf [] = new int [n];
        pre[0] = h[0];
        suf[n-1] = h[n-1];
        for(int i = 1;i<n;i++){
            pre[i] = Math.max(pre[i-1],h[i]);
        }
        for(int i = n-2;i>=0;i--){
            suf[i] = Math.max(suf[i+1],h[i]);
        }
        for(int i = 0;i<n;i++){
            max += Math.min(pre[i],suf[i])-h[i];
        }
        return max;

        
    }
}
