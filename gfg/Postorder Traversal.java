
import java.util.ArrayList;
import java.util.Stack;

/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        Stack<Node> st = new Stack<>(); 
        Stack<Node> st2 = new Stack<>(); 
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        st.push(root);
        
        while(!st.isEmpty()){
            Node temp = st.pop();
            st2.push(temp);
            if(temp.left != null) st.push(temp.left);
            if(temp.right != null) st.push(temp.right);
            
        }
        
        while (!st2.isEmpty()) {
            ans.add(st2.pop().data);
        }
        return ans;
    }
}