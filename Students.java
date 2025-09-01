class Students {
    // Instance variables
    private String name;
    private String className;

    // Static variable shared by all students
    static double tuitionFee;

    // Static block initializes it once
    static {
        tuitionFee = 30000;
        System.out.println("Static block executed → Tuition Fee set to " + tuitionFee);
    }

    // Constructor
    public Students(String name, String className) {
        this.name = name;
        this.className = className;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name + " | Class: " + className + " | Tuition Fee: " + tuitionFee);
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    // Static method to show tuition fee
    public static void showTuitionFee() {
        System.out.println("Tuition Fee for all students: " + tuitionFee);
    }

    // Main method for testing
    public static void main(String[] args) {
        Students s1 = new Students("Anjali","10th");
        Students s2 = new Students("Vikram","12th");

        s1.display();
        s2.display();

       Students.showTuitionFee();
    }
}
