class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(!st.isEmpty()){
                    result.append(ch); 
                }
                st.push(ch);
            }
            else{
                st.pop();
                if(!st.isEmpty()){
                    result.append(ch);
                }            
            }
        }
        return result.toString();
    }
}