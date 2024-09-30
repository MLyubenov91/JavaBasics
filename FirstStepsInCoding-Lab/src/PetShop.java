import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogFoodPackages = Integer.parseInt(scanner.nextLine());
        int catFoodPackages = Integer.parseInt(scanner.nextLine());

        double totalAmount = dogFoodPackages * 2.50 + catFoodPackages * 4;

        System.out.printf("%.2f lv.", totalAmount);
    }
}
