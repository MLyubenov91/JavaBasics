import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int stats = Integer.parseInt(scanner.nextLine());
        double clothingPrice = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.10;
        double totalClothingCost = stats * clothingPrice;

        if (stats >= 150) {
            totalClothingCost *= 0.90;
        }

        double totalMovieCosts = decorPrice + totalClothingCost;

        if (totalMovieCosts > budget) {
            double neededMoney = Math.abs(budget - totalMovieCosts);
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", neededMoney);
        } else {
            double leftOverMoney = budget - totalMovieCosts;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", leftOverMoney);
        }
    }
}
