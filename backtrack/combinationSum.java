class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), target, 0, nums);
        return res;

    }

    void backtrack(List<List<Integer>> res, List<Integer> temp,int remain, int start, int[] nums){
        if(remain<0) return;
        else if(remain==0){
            res.add(new ArrayList<>(temp));
        }else{
            for(int i=start; i<nums.length; i++){
                temp.add(nums[i]);
                backtrack(res, temp, remain - nums[i], i, nums);
                temp.remove(temp.size()-1);
            }
        }
    }
}
