import java.util.Scanner;

class Box {
    // Data members
    private double length;
    private double width;
    private double height;

    // Constructor to initialize dimensions
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Method to calculate volume
    public double volume() {
        return length * width * height;
    }
}



public class Q1_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Dimensions of the box
        System.out.print("Enter the length of the box: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the box: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the box: ");
        double height = scanner.nextDouble();

        // Create an object of the Box class
        Box box = new Box(length, width, height);

        // Output: Volume of the box
        System.out.println("The volume of the box is: " + box.volume());

        scanner.close();
    }
}
