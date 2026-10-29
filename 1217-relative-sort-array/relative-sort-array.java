class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int i=0;
        int j=0;
        int k=0;
        int m=arr1.length;
        int n=arr2.length;
        while(i<n){
            while(j<m){
                if(arr1[j]==arr2[i]){
                    int temp=arr1[k];
                    arr1[k]=arr1[j];
                    arr1[j]=temp;
                    k++;
                }
                j++;
            }
            j=0;
            i++;
        }
        Arrays.sort(arr1,k,m);
        return arr1;
    }
}