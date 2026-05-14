/*
Write a Java program to handle an ArithmeticException using try,
catch, and finally block.
*/

public class Q2_1707 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in try-catch-finally block");
        } finally {
            System.out.println("Execution of finally block.");
        }
        System.out.println("Program continues after handling the exception.");
    }
}