import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String type = "";
        double spentMoney = 0;

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                spentMoney = budget * 0.3;
                type = "Camp";
            } else if (season.equals("winter")) {
                spentMoney = budget * 0.7;
                type = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                spentMoney = budget * 0.4;
                type = "Camp";
            } else if (season.equals("winter")) {
                spentMoney = budget * 0.8;
                type = "Hotel";
            }
        } else if (budget > 1000) {
            destination = "Europe";
            spentMoney = budget * 0.9;
            type = "Hotel";
        }

        System.out.printf("Somewhere in %s", destination);
        System.out.println();
        System.out.printf("%s - %.2f", type, spentMoney);
    }
}
