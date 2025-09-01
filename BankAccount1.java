class BankAccount1{

    private String accountHolder;
    private int balance;

    // Parameterized constructor
    public BankAccount1(String accountHolder, int balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter for accountHolder
    public String getAccountHolder() {
        return accountHolder;
    }

    // Getter for balance
    public int getBalance() {
        return balance;
    }

    // Setter for accountHolder
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Setter for balance
    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Method to display account details
    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    // Main method
    public static void main(String[] args) {
        // Create a BankAccounts object
        BankAccount1 account = new BankAccount1("Ankita Yatin Kher", 209000000);

        // Optionally update balance
        account.setBalance(210000000);

        // Print account details
        account.displayDetails();
    }
}
