//Bottom Up Approach(Iterative)
// do this again
class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length==0) return 0;
        int res=Integer.MIN_VALUE;
        int [][]d=new int[matrix.length+1][matrix[0].length+1];
        for(int i=d.length-2;i>=0;i--){
            for(int j=d[0].length-2;j>=0;j--){
                if(matrix[i][j]=='1'){
                    d[i][j]=1+Math.min(Math.min(d[i+1][j],d[i][j+1]),d[i+1][j+1]);
                    res=Math.max(res,d[i][j]);
                }
            }
        }
        return res*res;   
    }
}


//72 test cases passed and this is a top to down approach(recursion)

class Solution {
    public int maximalSquare(char[][] matrix) {

        Map<Map<Integer, Integer>, Integer> cache = new HashMap<>();
        solve(0, 0, matrix, cache);
        int maxSide = cache.isEmpty() ? 0 : Collections.max(cache.values());
        return maxSide * maxSide;
        
    }

    int solve(int r, int c, char[][] matrix, Map<Map<Integer, Integer>, Integer> cache)
    {
        if(r>=matrix.length || c>=matrix[0].length)
        {
            return 0;
        }

        Map<Integer, Integer> key = new HashMap<>();
        key.put(r,c);
        
        if(!cache.containsKey(key))
        {
            int down = solve(r+1, c, matrix, cache);
            int right = solve(r, c+1, matrix, cache);
            int diag = solve(r+1, c+1, matrix, cache);

            cache.put(key, 0);
            if(matrix[r][c]=='1'){
                cache.put(key,1+ Math.min(down, Math.min(right, diag)));
            }
            
        }

        return cache.get(key);
    }
}



