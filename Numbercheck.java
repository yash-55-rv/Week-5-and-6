import java.util.Scanner;

public class NumberCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        // Taking input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nChecking numbers:");

        // Checking positive, negative, zero
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is Positive and Even");
                } else {
                    System.out.println(numbers[i] + " is Positive and Odd");
                }
            } 
            else if (numbers[i] < 0) {
                System.out.println(numbers[i] + " is Negative");
            } 
            else {
                System.out.println(numbers[i] + " is Zero");
            }
        }

        // Comparing first and last element
        System.out.println("\nComparing first and last elements:");

        if (numbers[0] == numbers[4]) {
            System.out.println("First and last elements are Equal");
        } 
        else if (numbers[0] > numbers[4]) {
            System.out.println("First element is Greater than last element");
        } 
        else {
            System.out.println("First element is Less than last element");
        }

        sc.close();
    }
}
