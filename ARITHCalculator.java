import java.util.Scanner;
public class ARITHCalculator {

    public static void main(String[] args) {

        // --- Constant declaration ---
        final String TITLE = "Simple Calculator";

        // --- Variable declaration ---
        double num1, num2, result = 0;
        int choice;

        Scanner sc = new Scanner(System.in);

        System.out.println("===== " + TITLE + " =====");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Factorial");
        System.out.print("Enter your choice (1-5): ");
        choice = sc.nextInt();

        // --- Decision-making using switch-case ---
        switch (choice) {
            case 1:
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;

            case 2:
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;

            case 3:
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;

            case 4:
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error! Division by zero not allowed.");
                }
                break;

            case 5:
                System.out.print("Enter a number: ");
                int n = sc.nextInt();
                int fact = 1;
                for (int i = 1; i <= n; i++) {
                    fact *= i;  // factorial logic using loop
                }
                System.out.println("Factorial = " + fact);
                break;

            default:
                System.out.println("Invalid choice! Please select between 1 to 5.");
        }

        sc.close(); // close Scanner
    }
}


