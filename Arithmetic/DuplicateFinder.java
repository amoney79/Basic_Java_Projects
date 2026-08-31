import java.util.*;

public class DuplicateFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user input
        System.out.println("Enter integers separated by spaces: ");
        String input = scanner.nextLine();

        // Split user token and parse into integer
        String[] token = input.trim().split("\\s+");
        int[] numbers = new int[token.length];

        for (int i = 0; i < token.length; i++) {
            numbers[i] = Integer.parseInt(token[i]);
        }

        //Track seen and duplicate values
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        for (int num : numbers) {
            if (!seen.add(num)) {
                duplicate.add(num);
            }
        }

        // Print results
        if (duplicate.isEmpty()) {
            System.out.println("No duplicates found.");
        } else {
            System.out.println("Duplicate numbers: " + duplicate);
        }

        scanner.close();
    }
}