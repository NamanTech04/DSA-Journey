
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class box{
    Node node;
    int left, right;
    box(Node node, int left, int right){
        this.node = node;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public Node constructTree(int[] pre, int[] post) {
        int n = pre.length;
        HashSet<Integer> set = new HashSet<>();
        Queue<box> q = new LinkedList<>();
        
        Node root = new Node(pre[0]);
        q.offer(new box(root,1,n-2));
        set.add(pre[0]);
        while(!q.isEmpty()){
            box temp = q.poll();
            Node node = temp.node;
            int l = temp.left;
            int r = temp.right;
            
            
            // left child
            if( l>= n || set.contains(pre[l])) node.left = null;
            else{
                node.left = new Node(pre[l]);
                set.add(pre[l]);
                q.offer(new box(node.left, l+1, find(pre[l], post)-1));
            }
            
            // right child
            if( r<0 || set.contains(post[r])) node.right = null;
            else{
                node.right = new Node(post[r]);
                set.add(post[r]);
                q.offer(new box(node.right, find(post[r], pre)+1, r-1));
            }
        }
        return root;
    }
    
    int find(int target, int[] arr){
        for(int i =0; i<arr.length; i++){
            if(arr[i] == target) return i;
        }
        return -1;
    }
}









