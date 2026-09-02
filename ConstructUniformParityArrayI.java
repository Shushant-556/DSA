import java.util.*;

class Solution {
    public boolean uniformArray(int[] nums1) {
        return true;
    }
}

public class ConstructUniformParityArrayI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        int n = sc.nextInt();

        // Input array elements
        int[] nums1 = new int[n];
        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }

        Solution obj = new Solution();
        boolean ans = obj.uniformArray(nums1);

        System.out.println(ans);

        sc.close();
    }
}