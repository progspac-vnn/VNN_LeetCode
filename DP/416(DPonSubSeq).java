//Optimize

class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int num : nums){
            sum += num;
        }

        if(sum % 2 == 1){
            return false;
        }

        int target = sum/2;
        
        int dp[][] = new int[n][target+1]; 
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        boolean res = solve(n-1, nums, target, dp);
        return res;
    }

    boolean solve(int idx, int []arr, int target, int dp[][]){
        if(target == 0){return true;}

        if(idx == 0) {return arr[0]==target;}

        if(dp[idx][target]!=-1){return dp[idx][target]==1;}
        boolean not_take = solve(idx - 1, arr, target, dp);
        boolean take = false;

        if (target >= arr[idx]) {
            take = solve(idx - 1, arr, target - arr[idx], dp);
        }

        dp[idx][target] = (take || not_take) ? 1 : 0;
        return dp[idx][target] == 1;
    }
}
