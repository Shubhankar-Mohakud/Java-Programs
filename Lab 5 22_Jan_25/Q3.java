/*
-Define an interface with three methods – earnings(), deductions() and bonus()
and define a Java class ‘Manager’ which uses this interface without implementing bonus() method.
Also define another Java class ‘Substaff’ which extends from ‘Manager’ class and implements
bonus() method. Write the complete program to find out earnings, deduction and bonus of a
substaff with basic salary amount entered by the user as per the following guidelines –
earnings basic + DA (80% of basic) + HRA (15% of basic)
deduction PF 12% of basic
bonus 50% of basic 
*/
import java.util.Scanner;

interface Salary {
    public double earnings();
    public double deductions();
    public double bonus();
}

class Manager implements Salary {
    double basic_salary;
    
    Manager(double basic_salary){
        this.basic_salary=basic_salary;
    }
    
    @Override
    public double earnings(){
        double da = 0.8 * basic_salary;
        double hra = 0.15 * basic_salary;
        return basic_salary + da + hra;
    }

    @Override
    public double deductions(){
        double ded = 0.12 * basic_salary;
        return ded;
    }

    @Override
    public double bonus(){
        return 0;
    }
}

class Substaff extends Manager {
    
    public Substaff(double basic_salary) {
        super(basic_salary);
    }

    public double bonus() {
        return 0.5 * basic_salary; 
    }
}
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the basic salary: ");
        double basicSalary = scanner.nextDouble();

        Substaff substaff = new Substaff(basicSalary);

        System.out.println("Earnings: " + substaff.earnings());
        System.out.println("Deductions: " + substaff.deductions());
        System.out.println("Bonus: " + substaff.bonus());
        scanner.close();
    }
}
