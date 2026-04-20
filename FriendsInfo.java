import java.util.Scanner;

public class FriendsInfo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking input
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i]);

            System.out.print("Enter age: ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height: ");
            heights[i] = sc.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        // Finding youngest and tallest
        for (int i = 1; i < 3; i++) {

            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("\nYoungest Friend: " + names[youngestIndex] +
                " (Age: " + ages[youngestIndex] + ")");

        System.out.println("Tallest Friend: " + names[tallestIndex] +
                " (Height: " + heights[tallestIndex] + ")");

        sc.close();
    }
}
