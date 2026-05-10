class Solution {
    public int maxArea(int[] h) {
        int n = h.length;
        int max = 0;
        int left = 0;
        int right = n-1;
        while(left<right){
            int area = Math.min(h[left],h[right])*(right-left);
            max = Math.max(max,area);
            if(h[left]<h[right]){
                left++;
            }
            else{
                right--;
            }
            
        }
        return max;
    }
}
