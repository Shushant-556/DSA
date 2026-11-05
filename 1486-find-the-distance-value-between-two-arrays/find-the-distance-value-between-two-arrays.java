class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int i=0;
        int ans=0;
        while(i<arr1.length){
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    break;
                }
                if(j==arr2.length-1){
                    ans++;
                }
            }
            i++;
        }
        return ans;
    }
}