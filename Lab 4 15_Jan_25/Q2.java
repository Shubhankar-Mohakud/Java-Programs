/*
Illustrate the execution of constructors in multi-level inheritance with three
Java classes – plate(length, width), box(length, width, height), wood box (length, width, height, thick)
where box inherits from plate and woodbox inherits from box class. Each class has constructor where
dimensions are taken from user.
*/
import java.util.Scanner;

class Plate{
    int length, width;

    public Plate(int length, int width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate constructor called: Length = " + length + ", Width = " + width);
    }
}

class Box extends Plate {
    int height;

    public Box(int length, int width, int height) {
        super(length, width); 
        this.height = height;
        System.out.println("Box constructor called: Height = " + height);
    }
}

class WoodBox extends Box {
    int thickness;

    public WoodBox(int length, int width, int height, int thickness) {
        super(length, width, height); 
        this.thickness = thickness;
        System.out.println("WoodBox constructor called: Thickness = " + thickness);
    }
}

public class Q2 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the wood box: ");
        int length = scanner.nextInt();

        System.out.print("Enter the width of the wood box: ");
        int width = scanner.nextInt();

        System.out.print("Enter the height of the wood box: ");
        int height = scanner.nextInt();

        System.out.print("Enter the thickness of the wood box: ");
        int thickness = scanner.nextInt();

        WoodBox woodBox = new WoodBox(length, width, height, thickness);

        scanner.close();
    }
}
