/*
Write a Java program to generate an
ArrayIndexOutofBoundsException and handle it using catch statement. 
*/

public class Q1_1707 {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println("Accessing index 10: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array index is out of bounds!");
        }
        System.out.println("Program continues after handling the exception.");
    }
}
