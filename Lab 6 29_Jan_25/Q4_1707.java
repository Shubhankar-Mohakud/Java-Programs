/*
Write a program to create user defined exceptions called
HrsException, MinException and SecException. Create a class Time which contains data
members hours, minutes, seconds and a method to take a time from user which throws
the user defined exceptions if hours (&gt;24 &amp;&lt;0),minutes(&gt;60 &amp;&lt;0),seconds(&gt;60 &amp;&lt;0).
*/

import java.util.Scanner;

class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Time {
    private int hours, minutes, seconds;

    public void setTime(int h, int m, int s) throws HrsException, MinException, SecException {
        if (h < 0 ||h > 24) {
            throw new HrsException("Invalid hours");
        }
        if (m < 0 || m >= 60) {
            throw new MinException("Invalid minutes");
        }
        if (s < 0 || s >= 60) {
            throw new SecException("Invalid seconds");
        }
        
        this.hours = h;
        this.minutes = m;
        this.seconds = s;
    }

    public void displayTime() {
        System.out.println("Time: " + hours + ":" + minutes + ":" + seconds);
    }
}

public class Q4_1707 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Time time = new Time();
        
        try {
            System.out.print("Enter hours: ");
            int h = scanner.nextInt();
            System.out.print("Enter minutes: ");
            int m = scanner.nextInt();
            System.out.print("Enter seconds: ");
            int s = scanner.nextInt();
            
            time.setTime(h, m, s);
            time.displayTime();
        } catch (HrsException | MinException | SecException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
