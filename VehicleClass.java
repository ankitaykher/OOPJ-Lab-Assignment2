class VehicleClass {

    private String vehicleName; // instance variable for each vehicle

    // Static block executes when class loads
    static {
        System.out.println("Welcome to CDAC Vehicle Registration Portal");
    }

    // Parameterized constructor
    public VehicleClass(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    // Display method
    public void display() {
        System.out.println("Vehicle Name: " + vehicleName);
    }

    // Main method to test
    public static void main(String[] args) {
        // Create multiple vehicle objects
        VehicleClass v1 = new VehicleClass("Car");
        VehicleClass v2 = new VehicleClass("Bike");
        VehicleClass v3 = new VehicleClass("Bullet");

        // Display vehicle names
        v1.display();
        v2.display();
        v3.display();
    }
}
