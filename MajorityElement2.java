class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int cd1 = 0;
        int cd2 = 0;
        int c1 = 0;
        int c2 = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == cd1) {
                c1++;
            }
            else if (nums[i] == cd2) {
                c2++;
            }
            else if (c1 == 0) {
                cd1 = nums[i];
                c1 = 1;
            }
            else if (c2 == 0) {
                cd2 = nums[i];
                c2 = 1;
            }
            else {
                c1--;
                c2--;
            }
        }

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == cd1)
                count1++;
            else if (nums[i] == cd2)
                count2++;
        }

        List<Integer> ans = new ArrayList<>();

        if (count1 > nums.length / 3)
            ans.add(cd1);

        if (count2 > nums.length / 3)
            ans.add(cd2);

        return ans;
    }
}
