import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while(!command.equals("End")) {
            double budget = Double.parseDouble(scanner.nextLine());
            double savings = 0;

            while (savings < budget) {
                double currentSaving = Double.parseDouble(scanner.nextLine());
                savings += currentSaving;
            }

            System.out.printf("Going to %s!%n", command);

            command = scanner.nextLine();
        }
    }
}
