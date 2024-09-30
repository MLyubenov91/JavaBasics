import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actor = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int commission = Integer.parseInt((scanner.nextLine()));
        double neededPoints = 1250.5;

        for (int i = 0; i < commission; i++) {
            String name = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());

            academyPoints += (name.length() * points) / 2;

            if (academyPoints >= neededPoints) {
                break;
            }
        }

        if (academyPoints >= neededPoints) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, academyPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!", actor, neededPoints - academyPoints);
        }
    }
}
