import java.util.Scanner;
public class Reverse_grade{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number between 0 and 4: ");
            double number = scanner.nextDouble();

            if (number < 0 || number > 4) {
                System.out.println("Invalid input. Number must be between 0 and 4.");
                return;
            }

            String[] letterGrades = {"F", "D", "C", "B", "A"};

            int index = (int) Math.round(number * 10.0);

            if (index >= 50 && index <= 54) {
                System.out.println("Closest letter grade: " + letterGrades[1] + "+");
            } else if (index >= 85 && index <= 89) {
                System.out.println("Closest letter grade: " + letterGrades[3]);
            } else if (index >= 90) {
                System.out.println("Closest letter grade: " + letterGrades[4]);
            } else {
                System.out.println("Closest letter grade: " + letterGrades[2] + "-");
            }
        }
}
