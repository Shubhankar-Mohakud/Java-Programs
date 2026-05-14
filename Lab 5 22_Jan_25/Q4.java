/*
Define an interface Emploee with a method getDetails() to get emplyee
details as Empid and Ename. Also define a derived interface Manager with a method
getDeptDetails() to get department details such as Deptid and Deptname.Then define a class Head
which implements Manager interface and also prints all details of the employee. Write the complete
program to display all details of one head of the department.
*/
import java.util.Scanner;

interface Employee{
    public void getDetails();
}

interface Manager extends Employee{
    public void getDeptDetails();
}

class Head implements Manager {
    public int Empid;
    public String Ename;
    public int Deptid;
    public String Deptname;
    
    public void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        Empid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        Ename = sc.nextLine();
        
    }

    public void getDeptDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Department ID: ");
        Deptid = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Department Name: ");
        Deptname = sc.nextLine();
        
    }
    
    public void Display(){
        System.out.println("Employee Details");
        System.out.println("Employee name: "+Ename);
        System.out.println("Employee ID: "+Empid);
        System.out.println("Department Details");
        System.out.println("Department name: "+Deptname);
        System.out.println("Department ID: "+Deptid);
    }

}

public class Q4 {
    public static void main(String[] args) {
        Head head = new Head();
        head.getDetails();
        head.getDeptDetails();
        head.Display();

    }
}
