import java.util.*;
class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int k=0;
        int n=candyType.length;
        int i=0;
        int j=0;
        while(i<n){
            if(candyType[i]==candyType[j]){
                i++;
            }
            else if(candyType[i]!=candyType[j]){
                j++;
                candyType[j]=candyType[i];
                i++;
            }
        }
       int distinct=j+1;
        return Math.min(distinct,n/2);
    }
}