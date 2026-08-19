class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp2=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp2;
                high--;
            }
        }
        
    }
    public static void main(String [] args){
        int arr[]={0,1,0,1,2,0,1};
        Solution sol =new Solution();
        sol.sortColors(arr);
    

    }
}
