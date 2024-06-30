import java.util.Scanner;

public Class OperationByNumber {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the first number: ");
    double number1 = scanner.nextDouble();

    System.out.println("Enter the second number: ");
    double number2 = scanner.nextDouble();

    scanner.close()

    double result;

    if (numeber1 == number2) {
      result = number1 * number2;
      System.out.println("The result of the multiplication is: " + result);
    } else if (number1 > number2) {
      result = number1 - number2;
      System.out.println("The result of the subtraction is: " + result);
    } else {
      result = number1 + number2;
      System.out.println("The result of the addition is: " + result);
    }
}