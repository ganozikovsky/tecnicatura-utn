import java.util.Scanner;

public class GetPrice {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the price of the purchase: ");
    double price = scanner.nextDouble();

    scanner.close();

    double finalPrice; 

    if (price > 100) {
      double discount = price * 0.2;
      finalPrice = price - discount;
    } else {
      finalPrice = price;
    }

    System.out.println("The final price of the purchase is: " + finalPrice);
  }
}