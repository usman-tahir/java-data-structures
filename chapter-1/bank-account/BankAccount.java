
public class BankAccount {
    protected String account;
    protected double balance;

    public BankAccount(String account, double balance) {
        // pre: account is a string identifying the bank account, and balance
        // is the balance for the account
        // post: constructs a bank account with the specified balance
        this.account = account;
        this.balance = balance;
    }

    public boolean equals(Object other) {
        // pre: other is a valid bank account
        // post: returns true if this bank account is the same as other
        BankAccount that = (BankAccount)other;

        // two accounts are the same if the bank account numbers are the same
        return this.account.equals(that.account);
    }

    public String getAccount() {
        // post: returns the bank account number
        return this.account;
    }

    public double getBalance() {
        // post: returns the bank account balance
        return this.balance;
    }

    public void deposit(double amount) {
        // post: deposit money into the bank account
        this.balance += amount;
    }

    public void withdraw(double amount) {
        // pre: there are sufficient funds in the account
        // post: withdraw money from the bank account
        this.balance -= amount;
    }

    public String toString() {
        return "Account: " + this.getAccount() + "\nBalance: $" + this.getBalance() + "\n";
    }
}