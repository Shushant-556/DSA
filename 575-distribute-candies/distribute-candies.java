class Solution {
    public int distributeCandies(int[] candy) {
      HashSet<Integer> set= new HashSet();
      for(int c: candy){
        set.add(c);
      }
      return Math.min(candy.length/2,set.size());
    }
}