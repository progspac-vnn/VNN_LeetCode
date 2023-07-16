class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        Map<Integer, Integer> dp = new HashMap<>();
        int res = solve(days, 0, costs, dp);
        return res;
    }

    private int solve(int days[], int i, int cost[], Map<Integer, Integer> dp)
    {
        if(i==days.length){return 0;}

        if(dp.containsKey(i)){
            return dp.get(i);
        }

        int opt1 = cost[0] + solve(days, i+1, cost, dp);
        int k;
        for(k=i; k<days.length; k++)
        {
            if(days[k]>=days[i]+7){break;}
        }
        int opt2 = cost[1] + solve(days, k, cost, dp);

        
        for(k=i; k<days.length; k++)
        {
            if(days[k]>=days[i]+30){break;}
        }
        int opt3 = cost[2] + solve(days, k, cost, dp);

        dp.put(i, Math.min(opt1, Math.min(opt2, opt3)));
        return Math.min(opt1, Math.min(opt2, opt3));
    }
    
}
