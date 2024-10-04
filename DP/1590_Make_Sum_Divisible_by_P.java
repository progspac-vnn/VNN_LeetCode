class Solution {
    public int minSubarray(int[] nums, int p) {
        long total = 0;
        for (int num : nums) {
            total = (total + num);
        } // TC: O(n)

        int rem = (int) (total % p);
        if (rem == 0) return 0;

        HashMap<Integer, Integer> prefixMod = new HashMap<>();
        prefixMod.put(0,-1);
        long prefixSum = 0;
        int minLength = nums.length;

        

        for(int i=0; i<nums.length; i++){
            prefixSum += nums[i];
            int currMod = (int) (prefixSum % p);
            int targetMod = (currMod - rem + p) % p;

            if(prefixMod.containsKey(targetMod)){
                minLength = Math.min(minLength, i - prefixMod.get(targetMod));
            }

            prefixMod.put(currMod, i);
        }

        return minLength == nums.length ? -1 : minLength;
    }
}class Solution {
    public int minSubarray(int[] nums, int p) {
        long total = 0;
        for (int num : nums) {
            total = (total + num);
        } // TC: O(n)

        int rem = (int) (total % p);
        if (rem == 0) return 0;

        HashMap<Integer, Integer> prefixMod = new HashMap<>();
        prefixMod.put(0,-1);
        long prefixSum = 0;
        int minLength = nums.length;

        

        for(int i=0; i<nums.length; i++){
            prefixSum += nums[i];
            int currMod = (int) (prefixSum % p);
            int targetMod = (currMod - rem + p) % p;

            if(prefixMod.containsKey(targetMod)){
                minLength = Math.min(minLength, i - prefixMod.get(targetMod));
            }

            prefixMod.put(currMod, i);
        }

        return minLength == nums.length ? -1 : minLength;
    }
}
