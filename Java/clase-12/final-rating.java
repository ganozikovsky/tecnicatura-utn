import java.util.Scanner;

public class FinalGradeCalculator {
    private static final double PARTICIPATION_WEIGHT = 0.10;
    private static final double MIDTERM1_WEIGHT = 0.25;
    private static final double MIDTERM2_WEIGHT = 0.25;
    private static final double FINAL_EXAM_WEIGHT = 0.40;

    public static void main(String[] args) {
        Scanner scanner = null;
            scanner = new Scanner(System.in);

            System.out.print("Enter participation grade (10%): ");
            double participationGrade = scanner.nextDouble();

            System.out.print("Enter first midterm exam grade (25%): ");
            double midterm1Grade = scanner.nextDouble();

            System.out.print("Enter second midterm exam grade (25%): ");
            double midterm2Grade = scanner.nextDouble();

            System.out.print("Enter final exam grade (40%): ");
            double finalExamGrade = scanner.nextDouble();

            double finalGrade = (participationGrade * PARTICIPATION_WEIGHT) +
                                (midterm1Grade * MIDTERM1_WEIGHT) +
                                (midterm2Grade * MIDTERM2_WEIGHT) +
                                (finalExamGrade * FINAL_EXAM_WEIGHT);

            System.out.printf("The final grade is: ", finalGrade);
    }
}