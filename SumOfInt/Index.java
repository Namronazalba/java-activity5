package SumOfInt;
import java.util.Scanner;

public class Index {

    static int processInput(String input, int currentSum, boolean hasInput) {
        try {
            int num = Integer.parseInt(input);

            if (hasInput) {
                int newSum = currentSum + num;
                System.out.println("Sum of " + currentSum + " + " + num + " = " + newSum);
                return newSum;
            } else {
                System.out.println("Initial input = " + num);
                return num;
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Enter number or \"exit\".");
            return currentSum;
        }
    }

    public static void main(String[] args) {
        System.out.println("\nInput number or \"exit\".");
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        boolean hasInput = false;

        while (true) {
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Program end.");
                break;
            }

            sum = processInput(input, sum, hasInput);

            if (!hasInput) {
                try {
                    Integer.parseInt(input);
                    hasInput = true;
                } catch (NumberFormatException e) {
                        
                }
            }
        }

        scan.close();
    }
}