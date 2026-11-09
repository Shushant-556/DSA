class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n= nums.length;
        int i=1;
        if(n==1) return nums[0];
        if(nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }
        while(i<n){
            if(nums[i-1]!= nums[i]){
                return nums[i-1];
            }
            i+=2;
        }
        return -1;
    }
}