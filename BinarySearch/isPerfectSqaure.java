class Solution {
    public boolean isPerfectSquare(int num) {
        long test = num;
        long r=test;
        long l=1;

        while(l<=r){
            long mid = (l+r)/2;

            if(mid*mid>num){
                r = mid-1;
            }else if(mid*mid<num){
                l = mid+1;
            }else{
                return true;
            }
        }

        return false;
    }
}
