import java.util.Scanner;

public class SquareSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();

        scanner.close();

        double result = Math.pow(a, 2) + Math.pow(b, 2) + 2 * a * b;

        System.out.println("The result of (a + b)^2 is: " + result);
    }
}