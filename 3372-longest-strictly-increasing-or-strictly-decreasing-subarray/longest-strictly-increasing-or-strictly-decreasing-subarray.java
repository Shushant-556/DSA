class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxinc=0;
        int inc=0;
        int maxdec=0;
        int dec=0;
        int c=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                dec=0;
                inc++;
                maxinc=Math.max(inc,maxinc);
            }
            else if(nums[i]>nums[i+1]){
                inc=0;
                dec++;
                maxdec=Math.max(dec,maxdec);
            }
            else{
                inc=0;
                dec=0;
                c++;
            }
        }
        int inclen=maxinc+1;
        int declen=maxdec+1;
        if(c==nums.length-1) return 1;
        return Math.max(inclen,declen);
    }
}