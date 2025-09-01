class Passenger {
	public static void main(String[] args) {
        // Create passengers using both constructors
        Passenger p1 = new Passenger("Ravi", 25);
        Passenger p2 = new Passenger("Anita", 30, "Sleeper");
        Passenger p3 = new Passenger("Arjun", 28, "AC");

        // Show details
        p1.display();
        p2.display();
        p3.display();

        // Show total passengers
        Passenger.showTotalPassengers();
    }

    // Instance variables
    private String name;
    private int age;
    private String seatType;

    // Static variable
    static int totalPassengers = 0;

    // Constructor 1 → name, age
    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
        this.seatType = "General"; // default if not given
        totalPassengers++; // increment counter
    }

    // Constructor 2 → name, age, seatType
    public Passenger(String name, int age, String seatType) {
        this.name = name;
        this.age = age;
        this.seatType = seatType;
        totalPassengers++; // increment counter
    }

    // Display passenger details
    public void display() {
        System.out.println("Name: " + name + " | Age: " + age + " | Seat: " + seatType);
    }

    // Static method to display total passengers
    public static void showTotalPassengers() {
        System.out.println("Total Passengers Booked: " + totalPassengers);
    }
}

// Main class

    
