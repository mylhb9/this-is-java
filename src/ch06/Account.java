package ch06;

public class Account {
    private int balance;
    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;

    public void setBalance(int balance) {
        if(balance < MIN_BALANCE || balance > MAX_BALANCE) {
        } else {
            this.balance = balance;
        }
    }

    public int getBalance() {
        return this.balance;
    }
}
