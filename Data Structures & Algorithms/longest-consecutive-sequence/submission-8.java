class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int i : nums){
            st.add(i);
        }
        int res = 0;
        for(int i : st){
            if(!st.contains(i-1)){
                int current = i;
                int cnt = 1;
                while(st.contains(current+1)){
                    current++;
                    cnt++;
                }
                res = Math.max(res,cnt);
            }
        }
        return res;
        
    }
}
