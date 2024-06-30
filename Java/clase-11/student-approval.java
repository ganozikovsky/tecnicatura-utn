import java.util.Scanner;

public class StudentApproval {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the first grade: ");
    double grade1 = scanner.nextDouble();

    System.out.println("Enter the second grade: ");
    double grade2 = scanner.nextDouble();

    System.out.println("Enter the third grade: ");
    double grade3 = scanner.nextDouble();

    scanner.close();

    double average = (grade1 + grade2 + grade3) / 3;

    if (average >= 7) {
      System.out.println("The student is approved with an average of " + average);
    } else {
      System.out.println("The student is not approved with an average of " + average);
    }
  }
}