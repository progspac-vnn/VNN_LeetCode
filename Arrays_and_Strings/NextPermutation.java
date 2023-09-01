class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            rev(nums, 0, n - 1);
        } else {
            for (int i = n - 1; i > idx; i--) {
                if (nums[i] > nums[idx]) {
                    swap(nums, i, idx);
                    break;
                }
            }

            rev(nums, idx + 1, n - 1);
        }
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    void rev(int[] arr, int idx_s, int idx_e) {
        for (int i = idx_s, j = idx_e; i < j; i++, j--) {
            swap(arr, i, j);
        }
    }
}
