class Solution {
    public int countServers(int[][] mat) {
       int m=mat.length;
        int n=mat[0].length;
        int mc=0;
        int rc[]=new int[m];
        int cc[]=new int[n];
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(mat[i][j]==1){
                rc[i]++;
                cc[j]++;
            }
        }
       }
       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(mat[i][j]==1 && rc[i]>1 || mat[i][j]==1 && cc[j]>1){
                mc++;
            }
        }
       }
       return mc;
    }
}