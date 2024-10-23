import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juryCount = Integer.parseInt(scanner.nextLine());
        String presentationName = scanner.nextLine();

        double finalAssessmentSum = 0;
        int presentationCount = 0;

        while (!presentationName.equals("Finish")) {
            double gradeSum = 0;
            for (int i = 0; i < juryCount; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                gradeSum += grade;
            }

            double averageGrade = gradeSum / juryCount;
            finalAssessmentSum += averageGrade;
            presentationCount++;

            System.out.printf("%s - %.2f.%n", presentationName, averageGrade);

            presentationName = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", finalAssessmentSum / presentationCount);
    }
}
