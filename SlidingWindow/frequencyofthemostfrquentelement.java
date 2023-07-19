class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int maxfreq = 0;

        int i=0,j=0;
        long total = 0;

        while(j<nums.length)
        {
            total = total + nums[j];
            while( nums[j] * ((j-i)+1) > total + k ) 
            {
                total = total - nums[i];
                i++;
            }
            maxfreq= Math.max(maxfreq, (j-i)+1);
            j++;
        }

        return maxfreq;

    }
}
