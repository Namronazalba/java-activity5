package SumOfInt;
import java.util.Scanner;

public class Index {

    public static void main(String[] args) {
        System.out.println("\nInput number or \"exit\".");
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        boolean hasInput = false;

        while (true) {
            String input = scan.nextLine();
            if(input.equalsIgnoreCase("exit")){
                System.out.println("Program end.");
                break;
            }
            try{
                int num = Integer.parseInt(input);
                if (hasInput) {
                    sum+=num;
                    System.out.println("Sum of "+ sum + " + "+ num +" = " + sum);
                } else{
                    hasInput = true;
                    System.out.println("Initial input = " + num);
                }

            }catch(NumberFormatException e){
                System.out.println("Invalid input! Enter number or \"exit\".");
            }
            
        }
        scan.close();
        
    }
}