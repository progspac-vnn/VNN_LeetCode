import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> parent = new ArrayList<>();
        int n = nums.length;
        int l, r;

        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            l = i + 1;
            r = n - 1;

            while (l < r) {
                int threeSum = nums[i] + nums[l] + nums[r];
                if (threeSum > 0) {
                    r -= 1;
                } else if (threeSum < 0) {
                    l += 1;
                } else {
                    parent.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l += 1;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l += 1;
                    }
                }
            }
        }

        return parent;
    }
}
