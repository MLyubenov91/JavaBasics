import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalFoodAmount = Double.parseDouble(scanner.nextLine());

        double totalEatenFood = 0;
        double totalEatenFoodByDog = 0;
        double totalEatenFoodByCat = 0;
        double biscuits = 0;

        for (int i = 1; i <= days; i++) {
            double foodForDog = Double.parseDouble(scanner.nextLine());
            double foodForCat = Double.parseDouble(scanner.nextLine());
            totalEatenFoodByDog += foodForDog;
            totalEatenFoodByCat += foodForCat;
            totalEatenFood += foodForDog + foodForCat;

            if (i % 3 == 0) {
                biscuits += (foodForDog + foodForCat) * 0.10;
            }
        }

        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(biscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", totalEatenFood / totalFoodAmount * 100);
        System.out.printf("%.2f%% eaten from the dog.%n", totalEatenFoodByDog / totalEatenFood * 100);
        System.out.printf("%.2f%% eaten from the cat.", totalEatenFoodByCat / totalEatenFood * 100);
    }
}
