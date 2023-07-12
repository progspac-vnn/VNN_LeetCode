class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numsToIndex = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            if(numsToIndex.containsKey(target - nums[i]))
            {
                return new int[] {numsToIndex.get(target-nums[i]), i};
            }
            numsToIndex.put(nums[i], i);
        }

        return new int[] {};
    }

}
