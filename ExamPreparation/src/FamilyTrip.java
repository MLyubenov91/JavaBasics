import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double nightPrice = Double.parseDouble(scanner.nextLine());
        int additionalCostsPercentage = Integer.parseInt(scanner.nextLine());

        if (nights > 7) {
            nightPrice *= 0.95;
        }

        double totalPrice = nights * nightPrice + (budget * additionalCostsPercentage / 100);

        double diff = Math.abs(budget - totalPrice);

        if (budget >= totalPrice) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", diff);
        } else {
            System.out.printf("%.2f leva needed.", diff);
        }

    }
}
