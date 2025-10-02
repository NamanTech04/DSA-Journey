import java.util.ArrayList;

class Solution {
    public ArrayList<ArrayList<Integer>> combinationSum(int n, int k) {
       ArrayList<ArrayList<Integer>> res = new ArrayList<>();
       ArrayList<Integer> list = new ArrayList<>();
       solve(1,n,k,res,list,0);
       return res;
       
    }
    void solve(int start, int n, int k, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> list, int sum){
        if(list.size() == k && sum == n){
            res.add(new ArrayList<>(list));
            return;
        }
        if(list.size()==k && sum < n) return;
        if(list.size()>k || sum>n)return;
        
        for(int i=start; i<=9; i++){
                list.add(i);
                solve(i+1,n,k,res,list,sum+i);
                list.remove(list.size()-1);
            }
    }
}