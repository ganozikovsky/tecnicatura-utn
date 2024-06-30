import java.util.Scanner;

public class WeekDaysHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of hours: ");
        int totalHours = scanner.nextInt();

        scanner.close();

        int weeks = totalHours / (7 * 24);
        int remainingHours = totalHours % (7 * 24);

        int days = remainingHours / 24;
        int hours = remainingHours % 24;

        System.out.println(totalHours + " hours are equivalent to:");
        System.out.println(weeks + " weeks, " + days + " days, and " + hours + " hours.");
    }
}
