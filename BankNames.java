class BankNames {

    private static String bankName = "CDAC BANK"; // static variable

    // Static method to display bank name
    public static void showBankNames() {
        System.out.println(bankName);
    }

    // Main method to test
    public static void main(String[] args) {
        BankNames.showBankNames(); // Call static method without creating object
    }
}
