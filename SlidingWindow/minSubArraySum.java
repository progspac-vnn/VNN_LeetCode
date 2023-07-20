class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int len = nums.length;
        int minLen = Integer.MAX_VALUE;
        int check = 0;

        int flag =0;
        int i=0;
        for(int j=0; j<len; j++)
        {
            check+=nums[j];

            while(check>=target){
                flag=1;
                minLen = Math.min(minLen, (j-i)+1);
                check -= nums[i];
                i++;
            }
        }

        if(flag==0){
            return 0;
        }

        return minLen;
    }
}
