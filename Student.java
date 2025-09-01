class Student{
	public static void main(String[] args) {
        // Create 3 student
        Student s1 = new Student("Rahul",78,true);
        Student s2 = new Student("Puja", 34,false);
        Student s3 = new Student("Amit", 65,true);

        // Print details
        System.out.println(s1.getName() + " | Marks: " + s1.getMarks()+"| Passed: " + s1.getisPassed());
        System.out.println(s2.getName() + " | Marks: " + s2.getMarks()+"| Passed: " + s1.getisPassed());
        System.out.println(s3.getName() + " | Marks: " + s3.getMarks()+"| Passed: " + s1.getisPassed());


        // Show total employee
        Student.showTotalStudents();
    }

 private String name;
 private int marks;
 private boolean isPassed;

    // Static variable
    static int totalStudents = 0;

    // Constructor (initializes all variables)
    public Student(String name, int marks,boolean isPassed) {
        this.name = name;
        this.marks = marks;
        this.isPassed = isPassed;
       totalStudents++;  // increment
	}



public boolean isPassed() {
    if (marks >= 35) {
        return true;   // passed
    } else {
        return false;  // failed
    }
}

    // Getters
    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public boolean getisPassed() {
        return isPassed;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setisPassed(boolean isPassed) {
        this.isPassed = isPassed;
    }

    // Static method to display total student
    public static void showTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }
}
