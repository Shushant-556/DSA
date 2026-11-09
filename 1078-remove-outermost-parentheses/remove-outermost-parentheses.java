class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result=new StringBuilder();
        char[] ch=s.toCharArray();
        int depth=0;
        for(char x:ch){
            if(x=='('){
                if(depth>0){
                    result.append(x);
                }
                depth++;
            }
            else{
                depth--;
                if(depth>0){
                    result.append(x);
                }
            }
        }
        return result.toString();
    }
}