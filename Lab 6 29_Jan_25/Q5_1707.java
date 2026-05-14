/*
Create an user defined exception named CheckArgument to check
the number of arguments passed through command line. If the number of arguments is
less than four then throw the Check Argument exception, else print the addition of squares
of all the four elements. 
*/
import java.util.ArrayList;
import java.util.Scanner;

class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}

public class Q5_1707 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = 0;
        Scanner sc = new Scanner(System.in);
        boolean onoff = true;
        System.out.print("If you want to enter a number, press 1 else 0 : ");
        int d = sc.nextInt();
        if (d==0) onoff = false;
        while(onoff){
            int num;
            System.out.print("Enter a number : "); 
            num = sc.nextInt();
            list.add(num);
            n++;
            System.out.print("If you want to enter a number, press 1 else 0 : ");
            d = sc.nextInt();
            if (d==0) onoff = false;
        }
        try {
            if (list.size() < 4) {
                throw new CheckArgument("Insufficient arguments");
            }
            int sumOfSquares = 0;
            for (int num : list) {
                sumOfSquares += num*num;
            }
            System.out.println("Sum of squares of the four numbers: " + sumOfSquares);
        } catch (CheckArgument e) {
            System.out.println("Exception caught: "+ e.getMessage());
        } finally{
            sc.close();;
        }
        
    }
}
