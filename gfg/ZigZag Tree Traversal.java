
import java.util.Stack;
import java.util.ArrayList;

/*
class Node {
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    @SuppressWarnings("unused")
    ArrayList<Integer> zigZagTraversal(Node root) {
       ArrayList<Integer> res = new ArrayList<>();
       Stack<Node> st1 = new Stack<>();
       Stack<Node> st2 = new Stack<>();
       
       st1.push(root);
       while(!st1.isEmpty() || !st2.isEmpty()){
           while(!st1.isEmpty()){
               Node node = st1.pop();
               res.add(node.data);
            //   pushing order left and right
               if(node.left!= null)
               st2.push(node.left);
            //    if(node.right != null)
            //    st2.push(node.right);
           }
           
           while(!st2.isEmpty()){
               Node node = st2.pop();
               res.add(node.data);
               
               // pushing order right and left
               
               if(node.right != null)
               st1.push(node.right);
            //    if(node.left != null)
            //    st1.push(node.left);
           }
       }
       return res; 
    }
}