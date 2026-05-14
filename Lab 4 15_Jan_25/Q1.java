/*
A Plastic manufacturer sells plastic in different shapes like 2D sheet and 3D
box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. Implement
it in Java to calculate the cost of plastic as per the dimensions given by the user where 3D inherits
from 2D.
*/
import java.util.Scanner;

class TwoD{
    int length, breadth;

    public TwoD(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int calculateArea() {
        return length*breadth;
    }
    public int calculateCost(){
        int area = calculateArea();
        return 40*area;
    }
}

class ThreeD extends TwoD{
    int height;

    public ThreeD(int length, int breadth, int height){
        super(length, breadth);
        this.height = height;
    }

    public int calculateVolume() {
        return length * breadth * height;
    }

    public int calculateCost(){
        int volume = calculateVolume();
        return 60*volume;
    }
}

class Q1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose the type of plastic (1 for 2D sheet, 2 for 3D box): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter the length of the sheet (in ft): ");
            int length = scanner.nextInt();
            System.out.print("Enter the width of the sheet (in ft): ");
            int breadth = scanner.nextInt();

            TwoD sheet = new TwoD(length, breadth);
            System.out.println("The cost of the 2D sheet is: Rs " +sheet.calculateCost());
        } else if (choice == 2) {
            System.out.print("Enter the length of the box (in ft): ");
            int length = scanner.nextInt();
            System.out.print("Enter the width of the box (in ft): ");
            int breadth = scanner.nextInt();
            System.out.print("Enter the height of the box (in ft): ");
            int height = scanner.nextInt();

            ThreeD box = new ThreeD(length, breadth, height);
            System.out.println("The cost of the 3D box is: Rs " +box.calculateCost());
        } else {
            System.out.println("Invalid choice. Please run the program again.");
        }

        scanner.close();
    }
}