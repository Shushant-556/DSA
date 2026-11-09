class Solution {
    public boolean isValid(String s) {
        Stack<Character> ch= new Stack<>();
        char[] ns=s.toCharArray();
        for(int i=0;i<ns.length;i++){
            if(ns[i]=='('){
                ch.push(')');
            }
            else if(ns[i]=='['){
                ch.push(']');
            }
            else if(ns[i]=='{'){
                ch.push('}');
            }
            else {
                if(ch.isEmpty()) return false;
                char x=ch.pop();
                if(x!=ns[i]){
                    return false;
                }
            }
        }
        return ch.isEmpty();
    }
}