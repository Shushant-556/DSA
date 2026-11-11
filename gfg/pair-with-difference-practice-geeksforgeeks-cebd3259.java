class Solution {
    public boolean findPair(int[] arr, int x) {
        java.util.Arrays.sort(arr);
        int n = arr.length;
        int i = 0, j = 1;
        while (i < n && j < n) {
            if (i != j && arr[j] - arr[i] == x) {
                return true;
            } else if (arr[j] - arr[i] < x) {
                j++;
            } else {
                i++;
                if (i == j) {
                    j++;
                }
            }
        }
        return false;
    }
}
