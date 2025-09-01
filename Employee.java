class Employee {
    public static void main(String[] args) {
        // Create 3 employee
        Employee e1 = new Employee("Ravi", 150000, 6);
        Employee e2 = new Employee("Anita", 120000, 3);
        Employee e3 = new Employee("The Guide", 100000, 5);

        // Print details
        System.out.println(e1.getName() + " | Salary: " + e1.getSalary() + " | Service: " + e1.getYearsOfService() + " | Bonus: " + e1.calculateBonus());
        System.out.println(e2.getName() + " | Salary: " + e2.getSalary() + " | Service: " + e2.getYearsOfService() + " | Bonus: " + e2.calculateBonus());
        System.out.println(e3.getName() + " | Salary: " + e3.getSalary() + " | Service: " + e3.getYearsOfService() + " | Bonus: " + e3.calculateBonus());


        // Show total employee
        Employee.showTotalEmployees();
    }


    // Instance variables
    private String name;
    private double salary;
    private int yearsOfService;

    // Static variable
    static int totalEmployees = 0;

    // Constructor (initializes all variables)
    public Employee(String name, double salary, int yearsOfService) {
        this.name = name;
        this.salary = salary;
        this.yearsOfService = yearsOfService;
        totalEmployees++;  // increment count
    }
public double calculateBonus() {
        if (yearsOfService > 5) {
            return salary * 0.05;   // 5% bonus
        } else {
            return 0.0;
        }
}
    // Getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearsOfService() {
        return yearsOfService;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    // Static method to display total employees
    public static void showTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}

	
	