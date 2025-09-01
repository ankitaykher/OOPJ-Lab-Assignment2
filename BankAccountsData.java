class BankAccountsData {

    private String accountHolder;
    private double balance;

    // Parameterized constructor
    public BankAccountsData(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for accountHolder
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        }
    }

    // Display account details
    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
        System.out.println("---------------------------");
    }

    // Main method
    public static void main(String[] args) {
        // Create two accounts
        BankAccountsData account1 = new BankAccountsData("Alice", 5000);
        BankAccountsData account2 = new BankAccountsData("Bob", 10000);

        // Perform deposit/withdraw for account1
        account1.deposit(2000);
        account1.withdraw(1000);

        // Perform deposit/withdraw for account2
        account2.deposit(500);
        account2.withdraw(12000); // Should show "Insufficient balance!"

        // Display updated balances
        account1.displayDetails();
        account2.displayDetails();
    }
}
