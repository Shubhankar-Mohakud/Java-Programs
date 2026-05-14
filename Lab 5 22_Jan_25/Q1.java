/*
Illustrate the usage of abstract class with following Java classes –
-> An abstract class ‘student’ with two data members roll no, reg no, a method getinput() and an abstract
method course()
-> A subclass ‘kiitian’ with course() method implementation
Write the driver class to print the all details of a kiitian object. 
*/

abstract class Student{
    int roll_no;
    int reg_no;

    public void getInput(int roll_no, int reg_no){
        this.roll_no=roll_no;
        this.reg_no=reg_no;
    }

    abstract void course();
}

class Kiitian extends Student{
    void course(){
        System.out.println("Course: B.Tech CSE");
    } 
}

public class Q1{
    public static void main(String[] args) {
        Kiitian kiitian = new Kiitian();

        kiitian.getInput(123, 45678);

        System.out.println("Roll No: " + kiitian.roll_no);
        System.out.println("Reg No: " + kiitian.reg_no);
        kiitian.course();
    }
}