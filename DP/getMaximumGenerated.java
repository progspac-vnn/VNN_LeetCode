class Solution {
    public int getMaximumGenerated(int n) {
        int maxNum = Integer.MIN_VALUE;
        int nums[] = new int[n+1];
        
        if(n==0)
        {
            return 0;
        }
        nums[0]=0;
        nums[1]=1;
        for(int i=1; i<=n/2; i++)
        {
            
            nums[2*i] = nums[i];
            if(n%2==0 && i==n/2){
                break;
            } 
            nums[(2*i)+1] = nums[i] + nums[i+1];
            // maxNum = Math.max(maxNum, nums[i]);

        }

        for(int i=0; i<nums.length; i++)
        {
           maxNum = Math.max(maxNum, nums[i]);
        }
        return maxNum;
    }
}
