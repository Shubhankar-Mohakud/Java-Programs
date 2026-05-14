import java.util.HashMap;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Number of elements in the list
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Input: Elements of the list
        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // HashMap to store the frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Calculate frequency
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Output: Display frequency of each element
        System.out.println("Frequency of each element:");
        for (int key : frequencyMap.keySet()) {
            System.out.println(key + " occurs " + frequencyMap.get(key) + " times");
        }

        scanner.close();
    }
}
