/*
Write a java program which will accept students details like Student
RollNo, Name, Subject, Marks from the keyboard using scanner class, stored the same in
a file. Again open the file, read the content and display all.
 */

import java.io.*;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get student details from user
        System.out.println("Enter student details:");
        System.out.print("Roll No: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        System.out.print("Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Subject: ");
        String subject = scanner.nextLine();
        
        System.out.print("Marks: ");
        double marks = scanner.nextDouble();
        
        // Write to file
        try (FileWriter writer = new FileWriter("student.txt")) {
            writer.write("Roll No: " + rollNo + "\n");
            writer.write("Name: " + name + "\n");
            writer.write("Subject: " + subject + "\n");
            writer.write("Marks: " + marks + "\n");
            System.out.println("Student details saved to file successfully!");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
        
        // Read from file and display
        System.out.println("\nReading student details from file:");
        try (BufferedReader reader = new BufferedReader(new FileReader("student.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
        
        scanner.close();
    }
}