class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums, target, 0);
        return res;
    }

    void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int remain, int start){
        if(remain<0){return;
        }
        else if(remain == 0){
            res.add(new ArrayList<>(temp));
        }else{
            for(int i=start; i<nums.length; i++){
                if(i>start && nums[i]==nums[i-1]){
                    continue;
                }
                temp.add(nums[i]);
                backtrack(res, temp, nums, remain - nums[i], i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
}
