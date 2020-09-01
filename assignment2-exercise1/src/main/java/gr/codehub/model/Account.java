package gr.codehub.model;

public class Account {
    private String owner;
    private Double balance;
    private int numberOfTransactions;

    public Account(String owner, Double balance, int numberOfTransactions) {
        this.owner = owner;
        this.balance = balance;
        this.numberOfTransactions = numberOfTransactions;
    }

    public void withdraw(Double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            balance = Math.round(balance * 100.0) / 100.0;
            numberOfTransactions++;
        } else {
            System.out.println("Cannot withdraw this amount. Try again.");
        }
    }

    public void deposit(Double amount) {
        balance = balance + amount;
        balance = Math.round(balance * 100.0) / 100.0;
        numberOfTransactions++;
    }

    public void testerAccount(int selection, double amount) {
        if (selection == 1) {
            System.out.println("Amount to withdraw: " + amount);
            withdraw(amount);
            System.out.println("New balance: " + balance + ". Number of Transactions: " + numberOfTransactions);
        } else if (selection == 2) {
            System.out.println("Amount to deposit: " + amount);
            deposit(amount);
            System.out.println("New balance: " + balance + ". Number of Transactions: " + numberOfTransactions);
        }
    }


}
