/*
Write a Java class which has a method called ProcessInput(). This
method checks the number entered by the user. If the entered number is negative then
throw an user defined exception called NegativeNumberException, otherwise it displays
the double value of the entered number. 
*/

import java.util.Scanner;

class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

public class Q3_1707 {
        public static void ProcessInput(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed: " + number);
        } else {
            System.out.println("Double of the entered number: " + (number * 2));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        try {
            ProcessInput(num);
        } catch (NegativeNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
