package comp2603lab;

public class BankApp {

    public static void main(String[] args) {
        // Create two Account objects
        Account savings = new Account(1001);
        Account checking = new Account(1002);

        // Deposit money
        savings.deposit(500.00);
        checking.deposit(1000.00);

        // Print accounts
        System.out.println(savings);
        System.out.println(checking);

        // Withdraw from checking
        checking.withdraw(250.00);
        System.out.println("\nAfter withdrawal:");
        System.out.println(checking);

        // Try to withdraw more than balance
        checking.withdraw(1000.00);
        System.out.println("\nAfter attempting to overdraw:");
        System.out.println(checking);
    }
}
