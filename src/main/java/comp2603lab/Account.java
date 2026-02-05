package comp2603lab;

public class Account {

    // Attributes (instance variables)
    private int number;
    private double balance;

    // Constructor
    public Account(int number) {
        this.number = number;
        this.balance = 0.0;
    }

    // Accessor (getter) for number
    public int getNumber() {
        return number;
    }

    // Accessor (getter) for balance
    public double getBalance() {
        return balance;
    }

    // Mutator: deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    // Mutator: withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        }
    }

    // toString method
    public String toString() {
        return "Account #" + number + ", Balance: $" + balance;
    }
}
