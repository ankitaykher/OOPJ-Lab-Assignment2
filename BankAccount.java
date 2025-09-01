class BankAccount {
    // Instance variables
    private String name;
    private double balance;

    // Static variable shared by all accounts
    static double interestRate;

    // Static block initializes it once
    static {
        interestRate = 4.0;
        System.out.println("Static block executed → Interest Rate set to " + interestRate + "%");
    }

    // Constructor
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name + " | Balance: " + balance + " | Interest Rate: " + interestRate + "%");
    }

    // Static method to show interest
    public static void showInterestRate() {
        System.out.println("Current Interest Rate: " + interestRate + "%");
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Main method for testing
    public static void main(String[] args) {
        BankAccount B1 = new BankAccount("Rohit", 25000);
        BankAccount B2 = new BankAccount("Priya", 30000);

        B1.display();
        B2.display();

        BankAccount.showInterestRate();
    }
}
