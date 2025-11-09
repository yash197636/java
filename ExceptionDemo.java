// Program to demonstrate Exception Handling in Java using try-catch
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input two numbers
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            // Perform division
            int result = num1 / num2; // may throw ArithmeticException
            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {
            // Catch division by zero error
            System.out.println("Error: Division by zero is not allowed!");

        } catch (Exception e) {
            // Catch any other exceptions
            System.out.println("Error: Invalid input! Please enter integers.");
        }

        System.out.println("Program continues after try-catch block...");
        sc.close();
    }
}
