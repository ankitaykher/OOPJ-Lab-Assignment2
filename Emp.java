class Emp {
    int id;
    String name;
    int basicSalary;
    private static int count = 0; // static counter

    // Default constructor
    public Emp() {
        this.id = 0;
        this.name = "Unknown";
        this.basicSalary = 20000;
        count++;
    }

    // Parameterized constructor
    public Emp(int id, String name, int basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        count++;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    // Static method to get total objects created
    public static int getCount() {
        return count;
    }

    // Display method
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + basicSalary);
    }

    // Main method
    public static void main(String[] args) {
        Emp e1 = new Emp(101, "Alice", 5000);
        Emp e2 = new Emp(102, "Bob", 10000);
        Emp e3 = new Emp(); // default constructor
        Emp e4 = new Emp(); // default constructor

        // Display details
        e1.display();
        e2.display();
        e3.display();
        e4.display();

        // Display total objects created
        System.out.println("Total Employees: " + Emp.getCount());
    }
}
