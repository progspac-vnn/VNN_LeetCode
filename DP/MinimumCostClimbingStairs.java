class Solution {
    public int minCostClimbingStairs(int[] cost) {
        Map<Integer, Integer> dp = new HashMap<>();

        int opt1 = solve(cost, 0,dp);

        int opt2 = solve(cost, 1,dp);

        return Math.min(opt1, opt2);
    }
        private int solve(int[] cost, int i, Map<Integer, Integer> dp)
        {
            if(i>=cost.length){return 0;}
            if(dp.containsKey(i)){return dp.get(i);}

            int result = cost[i] + Math.min(solve(cost, i+1, dp), solve(cost, i+2, dp));
            dp.put(i, result);
            return result;
        }
}
