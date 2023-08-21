class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(res, new ArrayList<>(), nums, used);
        return res;
    }

    void backtrack(List<List<Integer>> res, List<Integer> temp, int[] nums, boolean[] used){
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }

        for(int i=0; i<nums.length; i++){
            if(used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) continue;

            temp.add(nums[i]);
            used[i]=true;
            backtrack(res, temp, nums, used);
            temp.remove(temp.size()-1);
            used[i]=false;
        }
    }
}
