import java.util.Scanner;

class Student {
    // Data members
    int roll;
    String name;
    double cgpa;

    // Constructor to initialize student details
    public Student(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Method to display student details
    public void display() {
        System.out.println("Roll: " + roll + ", Name: " + name + ", CGPA: " + cgpa);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Array to store student objects
        Student[] students = new Student[n];

        // Input: Student details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Enter roll number: ");
            int roll = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter CGPA: ");
            double cgpa = scanner.nextDouble();

            // Create a new Student object and store it in the array
            students[i] = new Student(roll, name, cgpa);
        }

        // Display details of all students
        System.out.println("\nDetails of students:");
        for (Student student : students) {
            student.display();
        }

        // Find the student with the lowest CGPA
        double minCgpa = students[0].cgpa;
        String minCgpaName = students[0].name;

        for (int i = 1; i < n; i++) {
            if (students[i].cgpa < minCgpa) {
                minCgpa = students[i].cgpa;
                minCgpaName = students[i].name;
            }
        }

        // Display the student with the lowest CGPA
        System.out.println("\nStudent with the lowest CGPA: " + minCgpaName + " (CGPA: " + minCgpa + ")");

        scanner.close();
    }
}
