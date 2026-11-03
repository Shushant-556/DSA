class Solution {
    public int minMoves(int[] nums) {
        int max=0;
        for(int num:nums){
            max=Math.max(num,max);
        }
        int diff=0;
        int ans=0;
        for(int num:nums){
            diff=max-num;
            ans+=diff;
        }
        return ans;
    }
}