class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // n/3 (total such elements possible are 3-1 = 2)
        int j=1;
        int count1 = 0, count2=0;
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            if(count1==0 && ele2!=nums[i]){
                count1++;
                ele1 = nums[i];
            }else if(count2==0 && ele1!=nums[i]){
                count2++;
                ele2=nums[i];
            }else if(nums[i]==ele1){
                count1++;
            }else if(nums[i]==ele2){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }

        count1=0;
        count2=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==ele1){
                count1++;
            }
            if(nums[i]==ele2){
                count2++;
            }
        }

        if(count1>nums.length/3){
            list.add(ele1);
        }
        if(count2>nums.length/3){
            list.add(ele2);
        }

        return list;
    }
}
