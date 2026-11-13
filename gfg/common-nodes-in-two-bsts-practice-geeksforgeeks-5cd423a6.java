class Solution {
    public ArrayList<Integer> findCommon(Node r1, Node r2) {
        ArrayList<Integer> result = new ArrayList<>();
        java.util.Stack<Node> s1 = new java.util.Stack<>();
        java.util.Stack<Node> s2 = new java.util.Stack<>();
        
        Node curr1 = r1;
        Node curr2 = r2;
        
        while (curr1 != null || !s1.isEmpty() || curr2 != null || !s2.isEmpty()) {
            while (curr1 != null) {
                s1.push(curr1);
                curr1 = curr1.left;
            }
            while (curr2 != null) {
                s2.push(curr2);
                curr2 = curr2.left;
            }
            
            if (s1.isEmpty() || s2.isEmpty()) {
                break;
            }
            
            Node top1 = s1.peek();
            Node top2 = s2.peek();
            
            if (top1.data == top2.data) {
                result.add(top1.data);
                s1.pop();
                s2.pop();
                curr1 = top1.right;
                curr2 = top2.right;
            } else if (top1.data < top2.data) {
                s1.pop();
                curr1 = top1.right;
            } else {
                s2.pop();
                curr2 = top2.right;
            }
        }
        
        return result;
    }
}
