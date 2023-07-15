class Solution {
    public int climbStairs(int n) {
        Map<Map<Integer, Integer>, Integer> dp = new HashMap<>();

        return backtrack(0, 0, n, dp);
    }
    private int backtrack(int i, int steps, int n, Map<Map<Integer, Integer>, Integer> dp)
    {
        if(i==n){
            return steps==n ? 1 : 0;
        }
        if(steps==n){
            return 1;
        }

        Map<Integer,Integer> key = new HashMap<>();
        key.put(i,steps);

        if(dp.containsKey(key))
        {
            return dp.get(key);
        }

        int result = backtrack(i+1, steps+1, n, dp) + backtrack(i+1, steps+2, n, dp);
        dp.put(key, result);

        return result;
    }
}
