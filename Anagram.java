class Solution {
    public boolean isAnagram(String s, String t) {
        char[] st=s.toCharArray();
        char[] tr=t.toCharArray();
        Arrays.sort(st);
        Arrays.sort(tr);
        if(Arrays.equals(tr,st)){
            return true;
        }
        return false;
    }

}