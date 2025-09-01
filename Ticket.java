class Ticket {

    // Instance variables
    private String name;
    private int ticketNo;

    // Static variables
    private static int counter = 5000; // for auto-generated ticketNo
    private static int totalTicket = 0;

    // Constructor → single parameter (name)
    public Ticket(String name) {
        this.name = name;
        counter++;          // increment counter for ticket number
        this.ticketNo = counter; 
        totalTicket++;      // increment total tickets
    }

    // Display ticket details
    public void display() {
        System.out.println("Ticket No: " + ticketNo + ", Name: " + name);
    }

    // Static method to display total tickets booked
    public static void showTotalTicket() {
        System.out.println("Total Tickets Booked: " + totalTicket);
    }

    // Main method
    public static void main(String[] args) {
        Ticket T1 = new Ticket("Ravi");
        Ticket T2 = new Ticket("Anita");
        Ticket T3 = new Ticket("Arjun");

        // Show ticket details
        T1.display();
        T2.display();
        T3.display();

        // Show total tickets
        Ticket.showTotalTicket();
    }
}
