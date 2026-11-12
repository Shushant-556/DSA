class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.isEmpty() && st.peek().equals(s.charAt(i))){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        String str="";
        while(!st.isEmpty()){
            str+=st.pop();
        }
        String reversed = new StringBuilder(str).reverse().toString();
        return reversed;
    }
}