class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            counts.put(nums[i], counts.getOrDefault(nums[i], 0) + 1);
        }
        List<Map.Entry<Integer,Integer>> lst = new ArrayList<>(counts.entrySet());
        lst.sort((a,b)-> b.getValue()-a.getValue());
        int arr [] = new int [k];
        for(int i = 0;i<k;i++){
            arr[i]=lst.get(i).getKey();
        }
        return arr;

        
    }
}
