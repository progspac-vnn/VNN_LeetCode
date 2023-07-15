import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Map<Map<Integer, Integer>, Integer> dp = new HashMap<>();

        return backtrack(nums, target, 0, 0, dp);
    }

    private int backtrack(int[] nums, int target, int i, int total, Map<Map<Integer, Integer>, Integer> dp) {
        if (i == nums.length) {
            return total == target ? 1 : 0;
        }

        Map<Integer, Integer> key = new HashMap<>();
        key.put(i, total);

        if (dp.containsKey(key)) {
            return dp.get(key);
        }

        int result = backtrack(nums, target, i + 1, total + nums[i], dp) +
                backtrack(nums, target, i + 1, total - nums[i], dp);
        dp.put(key, result);

        return result;
    }
}
