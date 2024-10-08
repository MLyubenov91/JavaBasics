import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int gradeCounter = 1;
        double sum = 0;
        int excludedCounter = 0;

        while (gradeCounter <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4) {
                excludedCounter += 1;
                if (excludedCounter > 1) {
                    break;
                }
                continue;
            }

            sum += grade;
            gradeCounter++;
        }

        double average = sum / 12;

        if (gradeCounter >= 12) {
            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        } else {
            System.out.printf("%s has been excluded at %d grade", name, gradeCounter);
        }
    }
}
