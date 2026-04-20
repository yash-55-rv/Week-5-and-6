import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        long temp = number;
        int count = 0;

        // Count digits
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        int[] digits = new int[count];
        temp = number;

        // Store digits in array
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(temp % 10);
            temp = temp / 10;
        }

        // Frequency array
        int[] frequency = new int[10];

        // Calculate frequency
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Display result
        System.out.println("\nDigit Frequency:");

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        sc.close();
    }
}
