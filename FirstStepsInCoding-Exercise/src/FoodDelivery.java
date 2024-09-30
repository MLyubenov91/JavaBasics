import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int vegeterianMenus = Integer.parseInt(scanner.nextLine());

        double totalMenusPrice = chickenMenus * 10.35 + fishMenus * 12.40 + vegeterianMenus * 8.15;
        double dessertPrice = totalMenusPrice * 0.20;
        double finalPrice = totalMenusPrice + dessertPrice + 2.50;

        System.out.println(finalPrice);
    }
}
