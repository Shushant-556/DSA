class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else if(operations[i].equals("D")){
                st.push(2*st.peek());
            }
            else if(operations[i].equals("+")){
                int v1=st.pop();
                int top=v1+st.peek();
                st.push(v1);
                st.push(top);
            }
            else{
                st.push(Integer.parseInt(operations[i]));
            }        
        }
        int ans=0;
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}