class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        if(obstacleGrid[m-1][n-1]==1){return 0;}
        
        int dp[][] = new int[m][n];
        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }
        int res = rec(obstacleGrid,m,n,0,0,dp);

        return res;
    }

    int rec(int[][] obstacleGrid, int m , int n ,int i, int j, int[][] dp){
        
        if(i==m-1 && j==n-1) {return 1;}
        
        if(i==m || j==n) {return 0;}

        if(obstacleGrid[i][j]==1){return 0;}

        if(dp[i][j] != -1) {return dp[i][j];}

        dp[i][j] = rec(obstacleGrid,m,n ,i+1, j,dp) + rec(obstacleGrid,m,n,i,j+1,dp);

        return dp[i][j]; 
    }
}
