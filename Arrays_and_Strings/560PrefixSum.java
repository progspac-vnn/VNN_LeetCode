class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int cnt = 0;
        int n = nums.length;
        map.put(0,1);

        for(int i=0; i<n; i++){
            prefixSum += nums[i];
            int toExclude = prefixSum - k; 
            if(map.containsKey(toExclude)){
                cnt += map.get(toExclude);
            }

            if(map.containsKey(prefixSum)){
                map.put(prefixSum, map.get(prefixSum) + 1);
            }else{
                map.put(prefixSum, 1);
            }
        }

        return cnt;
    }
}
