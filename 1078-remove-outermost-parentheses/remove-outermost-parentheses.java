class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> ch=new Stack<>();
        List<Character> ans=new ArrayList<>();
        char[] ns=s.toCharArray();
        int x=0;
        for(int i=0;i<ns.length;i++){
            if(ns[i]=='('){
                ch.push(ns[i]);
            }
            if(ns.length>0 && ns[i]==')'){
                ch.pop();
            }
            if(ch.isEmpty()){
                for(int j = x + 1; j < i; j++) {
                    ans.add(ns[j]);
                }
                x=i+1;
            }
        }
        StringBuilder result=new StringBuilder();
        for(char c:ans){
            result.append(c);
        }
        return result.toString();
    }
}