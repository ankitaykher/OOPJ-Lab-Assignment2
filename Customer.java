class Customer {
	public static void main(String[] args) {
        // Create Customer using both constructors
        Customer c1 = new Customer("Rahul");
        Customer c2 = new Customer("puja","premium");
        Customer c3 = new Customer("Amit");

        // Show details
        c1.display();
        c2.display();
        c3.display();

        // Show total Customer
        Customer.showTotalCustomer();
    }

    // Instance variables
    private String name;
    private String ticketType;

    // Static variable
    static int totalCustomer = 0;

    // Constructor 1 → name, age
    public Customer(String name) {
        this.name = name;
        
        this.ticketType = "General"; // default if not given
        totalCustomer++; // increment counter
    }

    // Constructor 2 → name, age, seatType
    public Customer(String name,String ticketType) {
        this.name = name;
        this.ticketType = ticketType;
        totalCustomer++; // increment counter
    }

    // Display Customer details
    public void display() {
        System.out.println("Name: " + name + " | Ticket: " + ticketType);
    }

    // Static method to display total Customer
    public static void showTotalCustomer() {
        System.out.println("Total Customer Booked: " + totalCustomer);
    }
}

// Main class

    
