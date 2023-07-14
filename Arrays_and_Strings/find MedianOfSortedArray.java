class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length  + nums2.length];

        int pos=0;
        double median;

        for(int ele : nums1)
        {
            nums3[pos++] = ele;
        }
        for(int ele : nums2)
        {
            nums3[pos++] = ele;
        }

        Arrays.sort(nums3);

        if((nums3.length)%2 == 0)
        {
            median = ((nums3[(nums3.length)/2]) + (nums3[((nums3.length)/2)-1]))/2.0;
        }else{
            median = nums3[(nums3.length)/2];
        }

        return median;

    }
}
