
import java.util.ArrayList;

class Solution {
    public ArrayList<String> binstr(int n) {
      StringBuilder str = new StringBuilder("");
      ArrayList<String> res = new ArrayList<>();
      solve(str, n, res);
      return res;
    }
    void solve(StringBuilder str, int n, ArrayList<String> res){
        if(str.length() == n){
            res.add(str.toString());
            return;
        }
        
        // add 0
        str.append('0');
        // solve
        solve(str, n, res);
        // delete
        str.deleteCharAt(str.length()-1);
        
        
         // add 1
        str.append('1');
        // solve
        solve(str, n, res);
        // delete
        str.deleteCharAt(str.length()-1);
    }
}