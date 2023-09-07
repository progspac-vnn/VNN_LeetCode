class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==nums[j]){
                count++;
            }else{
                count--;
                if(count == 0){
                    j=i+1;
                }
            }
        }

        count=0;
        for(int i=0; i<nums.length; i++){
            count++;
        }

        if(count>nums.length/2){
            return nums[j];
        }else{
            return -1;
        }
    }
}
