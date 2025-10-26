class Bank {
    
    long[] bank_account;

    public Bank(long[] balance) {
        bank_account = balance;
    }
    
    public boolean transfer(int account1, int account2, long money) {
        int n = bank_account.length;
        if(account1 > n || account2 > n) return false;

        if(bank_account[account1 - 1] < money) return false;

        bank_account[account1 -1] -= money;
        bank_account[account2 -1] += money;

        return true;
    }
    
    public boolean deposit(int account, long money) {
        int n = bank_account.length;
        if(account > n) return false;

        bank_account[account-1] += money;

        return true;
    }
    
    public boolean withdraw(int account, long money) {
        int n = bank_account.length;
        if(account > n) return false;
        if(bank_account[account - 1] < money) return false;

        bank_account[account-1] -= money;

        return true;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */