import java.util.Scanner;

class GradeRange {
	
   
		
		public static void main(String[] args) {
    // Create first student
    Students1 student1 = new Students1("101", "Ak", 85);

    // Create second student
    Students1 student2 = new Students1("102", "Bob", 55);

    // Print marks and grades for first student
    System.out.println("Student: " + student1.name); // or create display method
    System.out.println("Marks: " + student1.getMarks());
    System.out.println("Grade: " + student1.calculateGrade());

    // Print marks and grades for second student
    System.out.println("Student: " + student2.name);
    System.out.println("Marks: " + student2.getMarks());
    System.out.println("Grade: " + student2.calculateGrade());
}

        
	}
		
		public String CalculateGrade(){
        if (marks >= 80) {
    return "A";
} else if (marks >= 60) {
    return "B";
} else if (marks >= 40) {
    return "C";
} else {
    return "Fail";
}
	}