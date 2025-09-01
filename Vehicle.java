class Vehicle {
    String regNo;
    String ownerName;
    String vehicleType;

    // Static counter
    static int vehicleCount = 0;

    // Constructor (auto-generates regNo)
    public Vehicle(String ownerName, String vehicleType) {
        vehicleCount++;  
        this.regNo = "MH-2025-" + vehicleCount; 
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Getter methods
    String getRegNo() {
        return regNo;
    }

    String getOwnerName() {
        return ownerName;
    }

    String getVehicleType() {
        return vehicleType;
    }

    // Display method(Instance methods)
    public void display() {
        System.out.println("Reg No: " + regNo);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("------------------------");
    }

    // Static method
    public static void showTotalVehicle() {
        System.out.println("Total Vehicles: " + vehicleCount);
    }

    // Main method
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Ankita", "Car");
        Vehicle v2 = new Vehicle("Anita", "Bike");
        Vehicle v3 = new Vehicle("Arjun", "Auto");

        v1.display();
        v2.display();
        v3.display();

        Vehicle.showTotalVehicle();
    }
}
