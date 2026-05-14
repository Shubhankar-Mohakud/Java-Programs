import java.util.Scanner;

class Q5{
    public static void main(String[] args) {
        System.out.print("Enter first String : ");
        Scanner scanner1 = new Scanner(System.in);
        String first = scanner1.nextLine();
        System.out.print("Enter second String : ");
        Scanner scanner2 = new Scanner(System.in);
        String second = scanner2.nextLine();
        System.out.println(second+" "+first);
        scanner1.close();
        scanner2.close();
    }
}
