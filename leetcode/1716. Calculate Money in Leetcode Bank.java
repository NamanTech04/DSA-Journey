class Solution {
    @SuppressWarnings("unused")
    int totalMoney(int n) {
        int terms = n/7;
        int a1 = 28;
        int a2 = 28 +(terms -1) * 7;
        int result;

        result = terms * (a1 + a2) /2;

        int start_money = 1 + terms;
        for(int days = 1; days <= (n%7); days++) {
            result += start_money;
            start_money++;
        }
        return result;
    }
};
