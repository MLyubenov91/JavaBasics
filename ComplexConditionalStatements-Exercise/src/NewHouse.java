import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double totalAmount = 0;

        switch (flower) {
            case "Roses" -> {
                totalAmount = flowerCount * 5;
                if (flowerCount > 80) {
                    totalAmount *= 0.90;
                }
            }
            case "Dahlias" -> {
                totalAmount = flowerCount * 3.80;
                if (flowerCount > 90) {
                    totalAmount *= 0.85;
                }
            }
            case "Tulips" -> {
                totalAmount = flowerCount * 2.80;
                if (flowerCount > 80) {
                    totalAmount *= 0.85;
                }
            }
            case "Narcissus" -> {
                totalAmount = flowerCount * 3;
                if (flowerCount < 120) {
                    totalAmount *= 1.15;
                }
            }
            case "Gladiolus" -> {
                totalAmount = flowerCount * 2.50;
                if (flowerCount < 80) {
                    totalAmount *= 1.20;
                }
            }
        }

        if (budget >= totalAmount) {
            double remainingMoney = budget - totalAmount;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flower, remainingMoney);
        } else {
            double neededMoney = Math.abs(budget - totalAmount);
            System.out.printf("Not enough money, you need %.2f leva more.", neededMoney);
        }
    }
}
