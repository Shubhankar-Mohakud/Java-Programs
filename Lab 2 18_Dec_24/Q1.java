import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int n = 3;
        int largeElement = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        while (n-- > 0) {
            int x = scanner.nextInt();
            largeElement = Math.max(x, largeElement);
        }
        System.out.println(largeElement);
        scanner.close();
    }
}
