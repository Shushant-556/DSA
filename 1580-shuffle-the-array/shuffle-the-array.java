class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr= new int[nums.length];
        int x=0;
        int y=n;
        int k=0;
        while(y<nums.length){
            arr[k++]=nums[x];
            arr[k++]=nums[y];
            x++;
            y++;
        }
        return arr;
    }
}