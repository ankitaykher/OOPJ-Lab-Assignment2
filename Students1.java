class Students1 {
    private String rollNo;
    private String name;
    private int marks;

    // Parameterized constructor
    public Students1(String rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Getter for marks
    public int getMarks() {
        return marks;
    }

    // Setter for marks
    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    // Main method
    public static void main(String[] args) {
        // Create a student object
        Students1 student = new Students1("101", "Ak", 85);

        // Update marks using setter
        student.setMarks(95);

        // Print student details
        student.displayDetails();
    }
}
