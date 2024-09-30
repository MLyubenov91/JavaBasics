import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double totalToysCost = (puzzles * 2.60) + (dolls * 3) + (bears * 4.10) + (minions * 8.20) + (trucks * 2);
        int totalToysCount = puzzles + dolls + bears + minions + trucks;

        if (totalToysCount >= 50) {
            totalToysCost *= 0.75;
        }

        double finalIncome = totalToysCost * 0.90;

        if (finalIncome >= tripPrice) {
            double leftOverMoney = finalIncome - tripPrice;
            System.out.printf("Yes! %.2f lv left.", leftOverMoney);
        } else {
            double neededMoney = Math.abs(finalIncome - tripPrice);
            System.out.printf("Not enough money! %.2f lv needed.", neededMoney);
        }
    }
}
