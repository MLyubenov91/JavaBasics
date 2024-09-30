import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermenCount = Integer.parseInt(scanner.nextLine());
        double boatRent = getBoatRent(season, fishermenCount);

        if (budget >= boatRent) {
            double remainingMoney = budget - boatRent;
            System.out.printf("Yes! You have %.2f leva left.", remainingMoney);
        } else {
            double neededMoney = Math.abs(budget - boatRent);
            System.out.printf("Not enough money! You need %.2f leva.", neededMoney);
        }
    }

    private static double getBoatRent(String season, int fishermenCount) {
        double boatRent = 0;

        switch (season) {
            case "Spring" -> boatRent = 3000;
            case "Summer", "Autumn" -> boatRent = 4200;
            case "Winter" -> boatRent = 2600;
        }

        if (fishermenCount <= 6) {
            boatRent *= 0.90;
        } else if (fishermenCount <= 11) {
            boatRent *= 0.85;
        } else {
            boatRent *= 0.75;
        }

        if (fishermenCount % 2 == 0 && !season.equals("Autumn")) {
            boatRent *= 0.95;
        }
        return boatRent;
    }
}
