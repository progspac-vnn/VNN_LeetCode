class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int ans1 = solve(nums, 0, nums.length-1);
        int ans2 = solve(nums, 1, nums.length);

        return Math.max(ans1, ans2);
    }

    int solve(int[] nums, int start, int end){
        int prev = nums[start];
        int prev2 = 0;

        for(int i=start+1; i<end; i++){
            int pick = nums[i];
            if(i>1){
                pick+=prev2;
            }
            int not_pick = 0 + prev;
            int curr_pick = Math.max(pick, not_pick);
            prev2 = prev;
            prev = curr_pick;
        }
        return prev;
    }
}
