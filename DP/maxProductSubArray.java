class Solution {
    public int maxProduct(int[] nums) {
       int curMax = 1;
       int curMin = 1;
       int res = Integer.MIN_VALUE;

       for(int i=0; i<nums.length; i++)
       {
           int temp = nums[i] * curMax;
           curMax = Math.max(Math.max(curMax*nums[i], curMin*nums[i]), nums[i]);
           curMin = Math.min(Math.min(temp, curMin*nums[i]), nums[i]);
           res = Math.max(res, curMax);
       }

       return res;
    }
}
