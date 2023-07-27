class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];

        dp[0] = 0;

        for(int i=1; i<dp.length; i++)
        {
            dp[i] = dp.length;
            for(int coin : coins){
                if(i-coin>=0){
                    dp[i] = Math.min(dp[i], dp[i-coin]+1);
                }
            }
        }

        return dp[amount] == dp.length ? -1 : dp[amount]; 
    }


}
