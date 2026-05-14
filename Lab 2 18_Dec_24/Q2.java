import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int n = 10;
        int evenCount = 0;
        int oddCount = 0;
        Scanner scanner = new Scanner(System.in);
        while (n-- > 0) {
            int x = scanner.nextInt();
            if ((x & 1) == 1) { 
                oddCount++;
            } else {
                evenCount++;
            }
        }
        System.out.println("Odd nums  : " + oddCount);
        System.out.println("Even nums : " + evenCount);
        scanner.close();
    }
}
