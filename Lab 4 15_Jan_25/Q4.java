/*
Write a class Account containing acc_no, balance as data members
and two methods as input() for taking input from user and disp() method to display the details.
Create a subclass Person which has name and aadhar_no as extra data members and
override disp() function. Write the complete program to take and print details of three persons.
*/

import java.util.Scanner;

class Account {
    String acc_no;
    int balance;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        acc_no = scanner.nextLine();
        System.out.print("Enter Balance: ");
        balance = scanner.nextInt();
    }

    public void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Aadhar Number: ");
        aadhar_no = scanner.nextLine();
        super.input();
    }

    public void disp() {
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
        super.disp(); 
    }
}

public class Q4 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no. of persons : ");
        n = scanner.nextInt();
        Person[] persons = new Person[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            persons[i] = new Person();
            persons[i].input();
        }

        System.out.println("\nDetails of all persons:");
        for (int i = 0; i < persons.length; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            persons[i].disp();
        }
        scanner.close();
    }
}


