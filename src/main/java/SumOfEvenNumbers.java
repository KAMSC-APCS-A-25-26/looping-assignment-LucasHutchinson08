import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {     
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer value: ");
        int integer = sc.nextInt();

        if (integer < 2) {
            System.out.println("Error - Integer must be greater than 2");
        }
        int sum = 0;
        for (int i = 2; i <= integer; i += 2) {
            sum +=i;
        }
        System.out.println("The sum of even numbers between 2 and " + integer + " is " + sum +".");
        // TODO: Step 1 - Get user input

        // TODO: Step 2 - Validate input
        
        // TODO: Step 3 - Calculate sum of even numbers
        
        // TODO: Step 4 - Display the result

    }
}
