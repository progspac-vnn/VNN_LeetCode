class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        backtrack(result, new ArrayList<>(), nums);

        return result;
    }

    void backtrack(List<List<Integer>> result, List<Integer> temp,int[] nums)
    {
        if(temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }

        for(int num : nums){
            if(temp.contains(num)){ continue; }

            temp.add(num);

            backtrack(result, temp, nums);

            temp.remove(temp.size()-1);
        }
    }
}
